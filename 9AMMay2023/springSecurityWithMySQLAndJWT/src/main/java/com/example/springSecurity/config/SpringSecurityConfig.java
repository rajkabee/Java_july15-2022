package com.example.springSecurity.config;


import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;

import com.example.springSecurity.jwt.JwtAuthenticationEntryPoint;

import com.example.springSecurity.jwt.JwtAuthenticationFilter;


@Configuration
public class SpringSecurityConfig{
	@Autowired
	UserDetailsService userDetailsService;
	@Autowired
    private JwtAuthenticationEntryPoint point;
    @Autowired
    private JwtAuthenticationFilter filter;

	/*
	 * @Bean SecurityFilterChain web(HttpSecurity http) throws Exception {
	 * http.csrf(csrf -> csrf.disable()) .authorizeHttpRequests( request->{
	 * request.requestMatchers("/admin").hasRole("ADMIN")
	 * .requestMatchers("/user").hasAnyRole("USER","ADMIN") .requestMatchers("/",
	 * "/createUsers","/login").permitAll() .anyRequest() .authenticated()
	 * 
	 * } ) .exceptionHandling(ex -> ex.authenticationEntryPoint(point))
	 * .sessionManagement(session ->
	 * session.sessionCreationPolicy(SessionCreationPolicy.STATELESS)) .formLogin();
	 * 
	 * 
	 * return http.build(); }
	 */
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.csrf(csrf -> csrf.disable())
        	     .authorizeRequests()
                .requestMatchers("/hello").authenticated()
                .requestMatchers("/auth/login","/createUsers").permitAll()
                .anyRequest()
                .authenticated()
                .and().exceptionHandling(ex -> ex.authenticationEntryPoint(point))
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
                ;
        http.addFilterBefore(filter, UsernamePasswordAuthenticationFilter.class);
        return http.build();
    }
    
    
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	@Bean
    public AuthenticationManager authenticationManager(AuthenticationConfiguration builder) throws Exception {
        return builder.getAuthenticationManager();
    }
	
//	@Bean
//	CorsConfigurationSource corsConfigurationSource() {
//		CorsConfiguration configuration = new CorsConfiguration();
//		configuration.setAllowedOrigins(CorsConfiguration.ALL.lines().toList());
//		configuration.setAllowedMethods(CorsConfiguration.ALL.lines().toList());
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		source.registerCorsConfiguration("/**", configuration);
//		source.registerCorsConfiguration("/auth/login", configuration);
//		return source;
//	}

	
}
