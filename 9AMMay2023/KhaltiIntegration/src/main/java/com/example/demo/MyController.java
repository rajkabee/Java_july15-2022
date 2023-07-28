package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {
	
	@GetMapping("/")
	public String home() {
		return "home.html";
	}
	@ResponseBody
	@PostMapping("/paymentConfirm")
	public String paymentConfirm(@ModelAttribute Payment payment) {
		System.out.println(payment);
		return "payment confirmed";
	}
	
}
