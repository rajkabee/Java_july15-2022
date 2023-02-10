package com.example.demo.controllers;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.model.entity.Product;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String index() {
		return "homepage";
	}
	/*
	@ResponseBody
	@RequestMapping("/product/1")
	public String product1() {
		return "<h1>BMW CAR</h1>";
	}
	*/
	
	
	
}
