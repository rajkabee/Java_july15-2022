package com.rajkabee.unitTesting;

public class Calculator {
	CalculatorService service;
	
	
	public Calculator(CalculatorService service) {
		super();
		this.service = service;
	}


	public int perform(int a, int b) {
		return service.add(a, b);
	}
}
