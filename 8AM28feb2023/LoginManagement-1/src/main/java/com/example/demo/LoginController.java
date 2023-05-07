package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
@RestController
public class LoginController {
	
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/login/{username}")
	public String hello( @PathVariable("username") String username) {
//		String msg = restTemplate.getForObject("http://localhost:8762/user/"+username, String.class);
		String msg = restTemplate.getForObject("http://UserManagement/user/"+username, String.class);
		return msg;
	}
}
