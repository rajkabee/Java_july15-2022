package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class ViewController {
	
	@RequestMapping("/")
	public String home(Model model) {
		
		model.addAttribute("name", "Rudra");
		return "index.jsp";
	}
	
}
