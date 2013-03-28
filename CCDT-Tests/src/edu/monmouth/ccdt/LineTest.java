package edu.monmouth.ccdt;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.monmouth.ccdt.data.Line;

public class LineTest {

	@Test
	public void testLine() {
		String StringTest = "Line one test" + "/n Line two test" + "/n Line three test";
		int integerTest = 2; 
		
		
		Line testLine = new Line(StringTest, integerTest);
		//Creating Tests for line and line number that was input into the constructor
		String lineResult = testLine.getLine();
		String line2Result = StringTest;
		int lineNumResult = testLine.getLineNumber();
		int lineNum2Result = integerTest;
		//Confirming line and number input in constructor matches created line and number in test
		assertEquals(lineResult, line2Result);
		assertEquals(lineNumResult, lineNum2Result);
		
		//Expect no return just pass
		
		
		
		
		
		
		
	}

}
