package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.dto.Cart;
import com.example.demo.entities.Address;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class OrderController {
	
	@GetMapping("/checkout")
	public String checkoutForm(HttpServletRequest req, Model model) {
		HttpSession session =  req.getSession();
		Cart cart = (Cart)session.getAttribute("cart");
		//System.out.println(cart);
		model.addAttribute("cart", cart);
		return "checkout";
	}
	@PostMapping("/newOrder")
	public String newOrder(
			@RequestParam("fName") String fName,
			@RequestParam("lName") String lName,
			@RequestParam("email") String email,
			@RequestParam("mobileNo") String mobile,
			@RequestParam("address1") String address1,
			@RequestParam("address2") String address2,
			@RequestParam("country") String country,
			@RequestParam("city") String city,
			@RequestParam("state") String state,
			@RequestParam("zipcode") String zipcode,
			@RequestParam("shipping_fName") String shipping_fName,
			@RequestParam("shipping_lName") String shipping_lName,
			@RequestParam("shipping_email") String shipping_email,
			@RequestParam("shipping_mobileNo") String shipping_mobile,
			@RequestParam("shipping_address1") String shipping_address1,
			@RequestParam("shipping_address2") String shipping_address2,
			@RequestParam("shipping_country") String shipping_country,
			@RequestParam("shipping_city") String shipping_city,
			@RequestParam("shipping_state") String shipping_state,
			@RequestParam("shipping_zipcode") String shipping_zipcode
			) {
		Address billingAddress = new Address(0,fName,lName,email, mobile, address1, address2, country, state, city, Integer.parseInt(zipcode));
		Address shippingAddress = new Address(0,shipping_fName,shipping_lName,shipping_email, shipping_mobile, shipping_address1, shipping_address2, shipping_country, shipping_state, shipping_city, Integer.parseInt(shipping_zipcode));
		System.out.println(billingAddress);
		System.out.println(shippingAddress);
		
		return "redirect:/checkout";
	}
}
