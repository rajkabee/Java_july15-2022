package com.rajkabee.api;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SpringSecurityConfig{
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
					authorize->
					authorize
						.requestMatchers("/admin").hasRole("ADMIN")
						.requestMatchers("/user").hasAnyRole("USER", "ADMIN")
						.requestMatchers("/", "login", "logout").permitAll()
						.anyRequest().authenticated()
				).formLogin();
		return http.build();
	}
	
	@Bean
	public UserDetailsService users() {
		return new InMemoryUserDetailsManager(
					User.builder().username("admin").password("admin123").roles("ADMIN").build(),
					User.builder().username("user").password("user123").roles("USER").build()
				);
	}
	
	@Bean
	PasswordEncoder paswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	
}
