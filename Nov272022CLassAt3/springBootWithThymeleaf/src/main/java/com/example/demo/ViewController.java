package com.example.demo;

import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ViewController {
	@RequestMapping("/")
	public String home(Model model) {
		String msg = "Welcome to Thymeleaf!";
		model.addAttribute("msg", msg);
		Date date = new Date();
		model.addAttribute("date", date);
		model.addAttribute("username", "Dursikshya");
		
		List<String> fruits = Arrays.asList("Apples", "Bananas", "Papayas", "Peaches", "Grapes");
		model.addAttribute("fruits", fruits);
		return "index";
	}
}
