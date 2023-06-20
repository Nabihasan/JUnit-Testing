package com.ms;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
@RunWith(Parameterized.class)
public class ParameterTest2 {
	
		private String prioprity;
		private int expected;
		private Tickets service =new Tickets();
		
	public ParameterTest2(String prioprity, int expected) {
			super();
			this.prioprity = prioprity;
			this.expected = expected;
		}


	@Test
	public void testMaxDtSolveTickets() {
		int actual=service.MaxDtSolveTickets(prioprity);
		assertEquals(expected, actual);
	}
	@Parameterized.Parameters
	public static Collection ticket() {
		return Arrays.asList(new Object [][] {{"high",2},{"medium",4},{"low",6},{"middle",8}});
		
	}

}
