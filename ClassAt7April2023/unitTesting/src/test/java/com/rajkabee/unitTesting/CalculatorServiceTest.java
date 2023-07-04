package com.rajkabee.unitTesting;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorServiceTest {

	@Test
	void testAdd() {
		CalculatorService calc = new CalculatorService();
		int res = calc.add(2,3);
		assertEquals(5,res);
	}

}
