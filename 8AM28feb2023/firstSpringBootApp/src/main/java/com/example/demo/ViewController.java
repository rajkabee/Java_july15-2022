package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
//@RequestMapping("/view")
@Controller
public class ViewController {

	@RequestMapping("/products")
	public String products() {
		return "products";
	}
	
}
