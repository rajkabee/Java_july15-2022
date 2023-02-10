package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SessionController {
	@GetMapping("/")
	public String index(HttpSession session, Model model) {
		List<String> messages = (List<String>) session.getAttribute("messages");
		if(messages==null) {
			messages=new ArrayList<String>();
		}
		session.setAttribute("messages", messages);
		model.addAttribute("messages",messages);
		return "index.html";
	}
	
	@PostMapping("/")
	public String handleSessionData(@RequestParam("msg") String msg, HttpSession session, Model model) {
		List<String> messages = (List<String>) session.getAttribute("messages");
		if(messages==null) {
			messages=new ArrayList<String>();
		}
		messages.add(msg);
		session.setAttribute("messages", messages);
		model.addAttribute("messages",messages);
		return "redirect:/";
	}
	
	@PostMapping("/deleteSession")
	public String deleteSessionData(HttpSession session) {
		session.invalidate();
		return "redirect:/";
		
	}
}
