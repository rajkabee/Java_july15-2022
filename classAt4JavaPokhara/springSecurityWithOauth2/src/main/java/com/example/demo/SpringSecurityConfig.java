package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.authentication.HttpStatusEntryPoint;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;
@Configuration
public class SpringSecurityConfig{
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http
			.csrf(c -> c
	            .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
	        )
			.authorizeHttpRequests((authorize) -> authorize
				
				.requestMatchers("/admin").hasRole("ADMIN")
				.requestMatchers("/user").hasAnyRole("ADMIN", "USER")
				.requestMatchers("/home").permitAll()
				.requestMatchers("/login*").permitAll()
				.requestMatchers("/logout*").permitAll()
				.requestMatchers("/", "/error", "/webjars/**").permitAll()
				.anyRequest()
			    .authenticated()
			    
			).exceptionHandling(e -> e
	                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
		            )
	        .httpBasic(Customizer.withDefaults())
	        .logout(l -> l
	                .logoutSuccessUrl("/").permitAll()
	            );
	        
	       

		return http.build();
	}
	
	
//	@Bean
//	public UserDetailsService users() {
//		UserDetails user = User.builder()
//			.username("user")
//			.password("password")
//			.roles("USER")
//			.build();
//		UserDetails admin = User.builder()
//			.username("admin")
//			.password("password")
//			.roles("USER", "ADMIN")
//			.build();
//		return new InMemoryUserDetailsManager(user, admin);
//	}
	
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		return NoOpPasswordEncoder.getInstance();
//	}
	

}
