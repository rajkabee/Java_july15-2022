package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class PaymentController {
	@GetMapping("/pay")
	public String makePayment() {
		String url = "https://a.khalti.com/api/v2/epayment/initiate/";

		HttpHeaders headers = new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_JSON);

		Map<String, String> requestBody = new HashMap<>();
		requestBody.put("title", "Hello World");
		requestBody.put("content", "Lorem ipsum dolor sit amet");

		HttpEntity<Map<String, String>> requestEntity = new HttpEntity<>(requestBody, headers);

		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Post> responseEntity = restTemplate.postForEntity(url, requestEntity, Post.class);
		Post post = responseEntity.getBody();

	}
	
	
	
}
