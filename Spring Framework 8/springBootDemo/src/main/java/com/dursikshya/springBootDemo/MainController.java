package com.dursikshya.springBootDemo;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {
	@RequestMapping("/")
	public String hello() {
		return "Welcome to my first spring boot web application!";
	}
	@RequestMapping("/user/{id}")
	public String getUser(@PathVariable("id") int id) {
		User[] users = {
				new User(1, "Pradeep shrestha"),
				new User(2,  "Sanjeep Thapa"),
				new User(3, "Kabita Khanal")
		};
		for(int i=0; i<3; i++) {
			if(users[i].id==id) {
				return users[i].toString();
			}
		}
		
		
		return "no user found";
	}
	
	@RequestMapping("/greetings")
	public String greet(@RequestParam("name") String guestName) {
		return "Hello "+guestName+", Welcome to my first spring boot web application!";
	}
}
