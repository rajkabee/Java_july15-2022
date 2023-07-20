package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig{
	@Autowired
	PasswordEncoder passwordEncoder;
	
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
				request->{
					request.requestMatchers("/admin").hasRole("ADMIN")
							.requestMatchers("/user").hasAnyRole("USER","ADMIN")
							.requestMatchers("/").permitAll()
							.anyRequest()
							.authenticated();
				}
				).formLogin();
		return http.build();
	}
	
	@Bean
	UserDetailsManager userDetailsService() {
		UserDetails user = User.builder().username("user").password(passwordEncoder.encode("password")).roles("USER").build();
		UserDetails admin = User.builder().username("admin").password(passwordEncoder.encode("password")).roles("ADMIN").build();
		return new InMemoryUserDetailsManager(user, admin);
	}
	
//	@Bean
//	PasswordEncoder passwordEncoder() {
//		//return NoOpPasswordEncoder.getInstance();
//		return new BCryptPasswordEncoder();
//	}
	
}
