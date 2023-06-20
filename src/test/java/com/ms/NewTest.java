package com.ms;

import static org.junit.Assert.*;

import org.junit.Test;

public class NewTest {

	@Test
	public void test() {
		Calculator cal=new Calculator();
		int actual=cal.cal(10, 12);
		int expected=22;
		assertEquals(expected, actual);
	}
	@Test
	public void testNegative() {
		Calculator cal=new Calculator();
		int actual=cal.cal(10, -12);
		int expected=-2;
		assertEquals(expected, actual);
	}

}
