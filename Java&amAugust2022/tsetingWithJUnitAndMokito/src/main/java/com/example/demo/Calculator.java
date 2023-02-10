package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

public class Calculator {
	@Autowired
	CalculatorService calculatorService;
	
	public int add(int x, int y) {
		return calculatorService.add(x, y);
	}

	public Calculator(CalculatorService service) {
		this.calculatorService=service;
	}

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
