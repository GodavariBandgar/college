package com.junit.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorsTest {

	
	
			@Test
			public void testSum()
			{
				Calculators calculators = new Calculators();
				
				int actualresult = calculators.sum(10, 10);
				
				int expectedresult=20;
				
				assertEquals(expectedresult, actualresult);
				
			}
			
			@Test
			public void testSub()
			{
				Calculators calculators = new Calculators();
				
				int actualresult = calculators.sub(10, 5);
				
				int expectedresult=5;
				
				assertEquals(expectedresult, actualresult);
				
				
			}
			
			@Test
			public void testMul()
			{
				
				Calculators calculators = new Calculators();
				
				
				int actualresult = calculators.mul(10, 10);
			
				
				int expectedresult=100;
				
				
				assertEquals(expectedresult, actualresult);
				
			}
			
			
			
			
			@Test
			public void testDiv() {
				
				Calculators calculators = new Calculators();
				
				
				int actualresult = calculators.div(10, 2);
				
				int expectedresult=5;
				
				assertEquals(expectedresult, actualresult);
			}
			
			
			
			
			
			
			
			
}
