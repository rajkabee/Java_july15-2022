package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.model.Course;

import com.example.demo.model.Course;

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	@RequestMapping("/")
	public String coursesHome() {
		return "courses";
	}
	@RequestMapping("/{id}")
	public String getCourse(@PathVariable int id, Model model) {
		model.addAttribute("id", id);
		return "courseDetails";
	}
	
	@GetMapping("/addCourse")
	public String addCourse() {
		return "addCourseForm";
	}
	
	@PostMapping("/addCourse")
	public String addCourseConfirm(@RequestParam("courseName") String name,
									@RequestParam("description") String description,
									@RequestParam("price") int price, 
									@RequestParam("duration") int duration
									) {
		Course course = new Course(0, name, description, duration, price);
		System.out.println(course);
		return "addCourseForm";
	}
}
