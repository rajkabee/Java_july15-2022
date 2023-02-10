package com.dursikshya.studentManagement;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class ViewController {
	@GetMapping("/home/{id}")
	public String homePage(@PathVariable("id") int id) {
		if(id==1)
		return "index";
		else return "index2";
	}
	
	@GetMapping("/greeting")
	public String greetings(@RequestParam("username") String name, Model model) {
		String msg = "Hello, "+name;
		model.addAttribute("msg", msg);
		return "greeting";
	}
	
}
