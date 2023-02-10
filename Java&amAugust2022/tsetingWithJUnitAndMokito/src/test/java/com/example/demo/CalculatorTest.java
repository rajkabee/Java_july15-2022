package com.example.demo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

class CalculatorTest {
	
	
	static Calculator calc;
	static CalculatorService service;
	@BeforeAll
	static void beforeAll() {
		
		service=mock(CalculatorService.class);
		calc = new Calculator(service);
		System.out.println("Before All!");
	}
	
	@BeforeEach
	void beforeEach() {
		System.out.println("Before Each!");
	}
	
	@AfterEach
	void afterEach() {
		System.out.println("After Each!");
	}
	
	@Test
	void addTest() {
		//fail("Not yet implemented");
		System.out.println("Testing Add");
		when(service.add(1, 3)).thenReturn(4);
		
		assertEquals(4, calc.add(1, 3));
	}
	
	@Test
	void testCaseTwo() {
		System.out.println("Test case 2 running...");
	}
	
	@Test
	void testCaseThree() {
		System.out.println("Test case 3 running...");
	}
	
	@AfterAll
	static void afterAll() {
		System.out.println("After All!");
	}

}
