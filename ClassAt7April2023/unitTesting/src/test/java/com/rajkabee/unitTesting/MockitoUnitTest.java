package com.rajkabee.unitTesting;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class MockitoUnitTest {
	
	Calculator calc=null;
	CalculatorService service = mock(CalculatorService.class);
	
	@BeforeAll
	public void setUp() {
		calc = new Calculator(service);
	}
	
	@Test
	public void test() {
		when(service.add(3,4)).thenReturn(7);
		int res = calc.perform(3,4);
		assertEquals(res, 7);
	}

}
