package com.ms;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ParameterTest {
	
	private int num1;
	private int num2;
	private int expected;
	
	public ParameterTest(int num1, int num2, int expected) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.expected = expected;
	}

	@Test
	public void testCal() {
		Calculator cal =new Calculator();
		int actual=cal.cal(num1, num2);
		assertEquals(actual, expected);
	}
	
	@Parameterized.Parameters
	public static Collection primeNumbers() {
		return Arrays.asList(new Object [][]  { {10 ,20 ,30} ,{10 ,-5 , 5} , {-10 , -20, -30},{-20 , 10 , -10}});
	}

}
