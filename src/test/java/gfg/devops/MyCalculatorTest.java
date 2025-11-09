package gfg.devops;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyCalculatorTest {
	
	MyCalculator calc = new MyCalculator();
	

	@Test
	public void test_sum() {		
		assertEquals(40, calc.sum(30, 10));			
	}
	
	@Test
	public void test_diff() {		
		assertEquals(20, calc.diff(30, 10));		
	}


}
