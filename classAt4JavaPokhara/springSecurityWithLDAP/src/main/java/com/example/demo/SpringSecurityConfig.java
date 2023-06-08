package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
@Configuration
public class SpringSecurityConfig{
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http
			.authorizeHttpRequests((authorize) -> authorize
				.requestMatchers("/admin").hasRole("ADMIN")
				.requestMatchers("/user").hasAnyRole("ADMIN", "USER")
				.requestMatchers("/home").permitAll()
				.requestMatchers("/login*").permitAll()
				.requestMatchers("/logout*").permitAll()
				.anyRequest()
			    .authenticated()
			    
			)
	        .formLogin();
	       

		return http.build();
	}
	
	  @Autowired
	  public void configure(AuthenticationManagerBuilder auth) throws Exception {
	    auth
	      .ldapAuthentication()
	        .userDnPatterns("uid={0},ou=people")
	        .groupSearchBase("ou=groups")
	        .contextSource()
	          .url("ldap://localhost:8389/dc=springframework,dc=org")
	          .and()
	        .passwordCompare()
	          .passwordEncoder(new BCryptPasswordEncoder())
	          .passwordAttribute("userPassword");
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