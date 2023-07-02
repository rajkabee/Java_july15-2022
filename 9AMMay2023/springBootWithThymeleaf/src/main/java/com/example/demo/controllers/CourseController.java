package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.enitites.Category;
import com.example.demo.enitites.Course;
import com.example.demo.repos.CategoryRepository;
import com.example.demo.repos.CourseRepository;


@Controller
@RequestMapping("/courses")
public class CourseController {
	@Autowired
	CourseRepository courseRepo;
	@Autowired
	CategoryRepository categoryRepo;
	@GetMapping("")
	public String courses(Model model) {
		List<Course> courses = courseRepo.findAll();
		model.addAttribute("courses", courses);
		return "courses";
	}
	
	@ResponseBody
	@RequestMapping("/addCourses")
	public String addCourses(){
		Category category = categoryRepo.findById(4).get();
		Course java = new Course("JAVA", "Java Fullstack With Angular", category);
		Course mean = new Course("MEAN", "Mongo DB, Express JS, Angular, Node JS", category);
		Course mern = new Course("MERN", "Mongo DB, Express JS, React, Node JS", category);
		Course python = new Course("Python Fullsatck", "Python with Django", category);
		Course dotnet = new Course(".NET", "C# with .NET Framework", category);
//		List<Course> courses = new ArrayList<>();
//		courses.add(java);
//		courses.add(mean);
//		courses.add(mern);
//		courses.add(python);
//		courses.add(dotnet);
//		category.setCourses(courses);
		courseRepo.save(java);
		courseRepo.save(mean);
		courseRepo.save(mern);
		courseRepo.save(python);
		courseRepo.save(dotnet);
		//categoryRepo.save(category);
		return "done";
		
		
	}
}
