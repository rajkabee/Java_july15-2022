package com.rajkabee.api;

import java.util.Collections;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringSecurityWithOauthApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityWithOauthApplication.class, args);
	}
	@GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return Collections.singletonMap("name", principal.getAttribute("name"));
    }
	
	
//	@Override
//    protected void configure(HttpSecurity http) throws Exception {
//   
//        http
//            .authorizeRequests(a -> a
//                .antMatchers("/", "/error", "/webjars/**").permitAll()
//                .anyRequest().authenticated()
//            )
//            .exceptionHandling(e -> e
//                .authenticationEntryPoint(new HttpStatusEntryPoint(HttpStatus.UNAUTHORIZED))
//            )
//            .oauth2Login();
//        
//    }
	@Bean
	SecurityFilterChain web(HttpSecurity http) throws Exception {
		http.authorizeHttpRequests(
					authorize->
					authorize
						
						.anyRequest().permitAll()
						
				).oauth2Login();
		return http.build();
	}
	
}
