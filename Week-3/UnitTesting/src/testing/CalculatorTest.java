package testing;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import calsi.Calculator;

class CalculatorTest {
	
	

	@Test
	void testAdd() {
		
		Calculator cal = new Calculator();
		
		int actual = cal.add(5,4);
		
		assertEquals(9,actual);
		
		//assertNotNull(cal);
		
	}

	@Test
	void testSub() {
		
Calculator cal = new Calculator();
		
		int actual = cal.sub(5,5);
		
		assertEquals(0,actual);
		
		assertNotEquals(1,actual);
		
		
	}

}
