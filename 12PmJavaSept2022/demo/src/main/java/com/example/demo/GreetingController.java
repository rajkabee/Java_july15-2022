package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GreetingController {

	@GetMapping("/greeting")
	public String greetingdfafass(
			@RequestParam(name="username", required=false, defaultValue="World")
			String name, 
			Model model) {
		model.addAttribute("client_name", name);
		return "greeting";
	}

}
