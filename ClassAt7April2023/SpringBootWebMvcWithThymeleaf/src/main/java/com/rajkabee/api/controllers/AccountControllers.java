package com.rajkabee.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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
	
	@GetMapping("")
	public String accounts(Model model) {
		List<Account> accounts= accountRepo.findAll();
		model.addAttribute("accounts", accounts);
		model.addAttribute("msg","AccountList");
		return "accounts";
	}
	
	@GetMapping("/new")
	public String newAccount(Model model) {
		model.addAttribute("msg", "addNewAccount");
		return "accounts";
	}
	
	@PostMapping("/new")
	public String newAccountProcess(@ModelAttribute Account account, Model model) {
		Account ac = accountRepo.save(account);
		model.addAttribute("account", ac);
		model.addAttribute("msg", "Account Created Successfully!");
		return "redirect:/accounts";
		
	}
	@GetMapping("/update/{id}")
	public String update(@PathVariable("id") long id, Model model) {
		Account ac = accountRepo.findById(id).get();
		model.addAttribute("account", ac);
		model.addAttribute("msg", "accountUpdateForm");
		return "accounts";
	}
	@PostMapping("/update")
	public String updateProcess(@ModelAttribute Account account) {
		Account ac = accountRepo.save(account);
		return "redirect:/accounts";
	}
	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable("id") long id, Model model) {
		Account ac = accountRepo.findById(id).get();
		accountRepo.delete(ac);
		model.addAttribute("msg", "accountDeleted");
		return "redirect:/accounts";
	}
}
