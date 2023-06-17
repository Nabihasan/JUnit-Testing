package com.ms;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class Testing {
	
	@Test(timeout=5000)
	public void testcivilscore() {
		IntersetCal score=new IntersetCal();
		int sc=score.civilScore();
		System.out.println(sc);
	}
	@Before
	public void testBeforetherunning() {
		System.out.println("before running test case......");
	}
		@Test
		public void testEligible() {
			IntersetCal cal=new IntersetCal();
			boolean actual=cal.eligible(80000);
			assertTrue(actual);
		}
		@Test
		public void testIFSC() {
			IntersetCal cal=new IntersetCal();
			String actual=cal.getIFSC("INDORE");
			assertNull(actual);
		}
		
		@Test
		public void testEligiblefalse() {
			IntersetCal cal=new IntersetCal();
			boolean actual=cal.eligible(4000);
			assertFalse(actual);
		}
	@Test
	public void testIntersetGreaterthanfive() {
		IntersetCal cal=new IntersetCal();
		int actual=cal.interset(10000, 8);
		int expected=6400;
		assertEquals(expected,actual);
	}
	@Test
	public void testIntersetLessthanfive() {
		IntersetCal cal=new IntersetCal();
		int actual=cal.interset(10000, 4);
		int expected=1600;
		assertEquals(expected,actual);
	}
	@Ignore
	@Test
	public void testIntersetlessthanzero() {
		IntersetCal cal=new IntersetCal();
		int actual=cal.interset(10000, 0);
		int expected=0;
		assertEquals(expected,actual);
	}
	@Test(expected=NegativeException.class)
	public void testIntersetNegativeException() {
		IntersetCal cal=new IntersetCal();
		int actual=cal.interset(10000, -9);
		
	}
	@After
	public void testAftertherunning() {
		System.out.println("after running test case......");
	}

}
