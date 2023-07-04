package com.rajkabee.unitTesting;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.BDDMockito.Then;
import org.mockito.Mock;

class MockitoUnitTest {
	@Mock
	CalculatorService calc;
	@Test
	void test() {
		//calc = new CalculatorService();
		when(calc.add(3,4)).thenReturn(7);
		int res = calc.add(3,4);
		assertEquals(res, 7);
	}

}
