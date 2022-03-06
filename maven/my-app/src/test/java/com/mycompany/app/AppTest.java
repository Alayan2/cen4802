package com.mycompany.app;

import com.mycompany.app.Main;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * Unit test for recursive Fibonacci App.
 */
public class AppTest {

	/**
	* Unit test for recursive implementation of Fibonacci sequence.
	*/
	@Test
	void testFibRecursive() {
		assertEquals(0, Main.fibRecursive(0));
		assertEquals(1, Main.fibRecursive(1));
		assertEquals(55, Main.fibRecursive(10));
		assertEquals(144, Main.fibRecursive(12));	
	}
	
	/**
	* Unit test of string output of fibonacci value and term number.
	*/
	@Test
	void testPrintOutput() {
		
		String tenth = "The 10th term of the Fibonacci sequence is 55.\n";
		String twelfth = "The 12th term of the Fibonacci sequence is 144.\n";
		assertEquals(tenth, Main.printOutput(10, 55));
		assertEquals(tenth, Main.printOutput(10, 55));
	}

}
