package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    	http
		.oauth2Client(oauth2 -> oauth2
			.clientRegistrationRepository(this.clientRegistrationRepository())
			.authorizedClientRepository(this.authorizedClientRepository())
			.authorizedClientService(this.authorizedClientService())
			.authorizationCodeGrant(codeGrant -> codeGrant
				.authorizationRequestRepository(this.authorizationRequestRepository())
				.authorizationRequestResolver(this.authorizationRequestResolver())
				.accessTokenResponseClient(this.accessTokenResponseClient())
			)
		);
        return http.build();
    }

	
}