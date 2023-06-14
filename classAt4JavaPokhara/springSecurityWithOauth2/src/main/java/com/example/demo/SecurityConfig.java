package com.example.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.oauth2.server.resource.OAuth2ResourceServerConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.config.oauth2.client.CommonOAuth2Provider;
import org.springframework.security.oauth2.client.InMemoryOAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.security.oauth2.client.registration.ClientRegistration;
import org.springframework.security.oauth2.client.registration.ClientRegistrationRepository;
import org.springframework.security.oauth2.client.registration.InMemoryClientRegistrationRepository;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {
	 private static List<String> clients = (List<String>) Arrays.asList("google");

	    @Bean
	    public ClientRegistrationRepository clientRegistrationRepository() {
	        List<ClientRegistration> registrations = clients.stream()
	          .map(c -> getRegistration(c))
	          .filter(registration -> registration != null)
	          .collect(Collectors.toList());
	        
	        return new InMemoryClientRegistrationRepository(registrations);
	    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http. csrf(csrf -> csrf.disable())
//        	.authorizeHttpRequests(auth -> auth
//                .requestMatchers("/token/**").permitAll()
//                .anyRequest().authenticated()
//            )
//            .sessionManagement(sess -> sess.sessionCreationPolicy(SessionCreationPolicy.STATELESS))
//            .oauth2ResourceServer(OAuth2ResourceServerConfigurer::jwt)
//            .httpBasic(Customizer.withDefaults());
    	http.authorizeRequests().anyRequest().authenticated()
        .and()
        .oauth2Login()
        .clientRegistrationRepository(clientRegistrationRepository())
        .authorizedClientService(authorizedClientService());
      return http.build();
       
    }
    
    private static String CLIENT_PROPERTY_KEY 
    = "spring.security.oauth2.client.registration.";

  @Autowired
  private Environment env;

  private ClientRegistration getRegistration(String client) {
      String clientId = env.getProperty(
        CLIENT_PROPERTY_KEY + client + ".client-id");

      if (clientId == null) {
          return null;
      }

      String clientSecret = env.getProperty(
        CLIENT_PROPERTY_KEY + client + ".client-secret");
   
      if (client.equals("google")) {
          return CommonOAuth2Provider.GOOGLE.getBuilder(client)
            .clientId(clientId).clientSecret(clientSecret).build();
      }
    
      return null;
  }
  
  @Bean
  public OAuth2AuthorizedClientService authorizedClientService() {
   
      return new InMemoryOAuth2AuthorizedClientService(
        clientRegistrationRepository());
  }
}
