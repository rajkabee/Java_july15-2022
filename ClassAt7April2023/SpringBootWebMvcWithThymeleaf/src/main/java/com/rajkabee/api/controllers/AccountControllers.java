package com.rajkabee.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.rajkabee.api.entities.Account;
import com.rajkabee.api.repositories.AccountRepository;

@Controller
@RequestMapping("/accounts")
public class AccountControllers {
	
	@Autowired
	AccountRepository accountRepo;
	
	@GetMapping("/new")
	public String newAccount() {
		return "newAccountForm";
	}
	
	@PostMapping("/new")
	public String newAccountProcess(@ModelAttribute Account account, Model model) {
		Account ac = accountRepo.save(account);
		model.addAttribute("account", ac);
		model.addAttribute("msg", "Account Created Successfully!");
		return "redirect:/";
		
	}
	
}
