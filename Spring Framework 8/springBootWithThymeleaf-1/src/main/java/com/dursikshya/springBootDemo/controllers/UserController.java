package com.dursikshya.springBootDemo.controllers;

import java.lang.ProcessBuilder.Redirect;
import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dursikshya.springBootDemo.model.entity.User;
import com.dursikshya.springBootDemo.model.repos.UserRepository;

@Controller
public class UserController {
	@Autowired
	UserRepository userRepo;
	
	@RequestMapping("/")
	public String index() {
		return "../index";
	}
	@RequestMapping("/users")
	public String users(Model model) {
		ArrayList<User> users =(ArrayList<User>) userRepo.findAll(); 
		model.addAttribute("users", users);
		return "users";
	}
	@RequestMapping(value = "/users" , method = RequestMethod.POST)
	public String addUser(@RequestParam("name") String name,
							@RequestParam("email") String email
							) {
		userRepo.save(new User(0 ,name, email, true));
		return "redirect:/users";
	}
	@RequestMapping("/userRegdFrom")
	public String userRegdFrom() {
		return "UserRegdForm";
	}
	
	
}
