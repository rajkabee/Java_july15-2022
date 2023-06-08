package com.example.demo;

import java.util.Collections;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.oauth2.core.user.OAuth2User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/user")
    public Map<String, Object> user(@AuthenticationPrincipal OAuth2User principal) {
        return Collections.singletonMap("name", principal.getAttribute("name"));
    }
	
	@RequestMapping("/home")
	public String home() {
		return "this is home api called";
	}

	@RequestMapping("/users")
	public String user() {
		return "this is user api called";
	}
	
	@RequestMapping("/admin")
	public String admin() {
		return "this is admin api called";
	}

	
}
