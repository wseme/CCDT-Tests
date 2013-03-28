package edu.monmouth.ccdt;
//Need to continue to work on.
import static org.junit.Assert.*;

import java.util.ArrayList;


import org.junit.Test;


import edu.monmouth.ccdt.data.Program;
import edu.monmouth.ccdt.data.Version;



public class ProgramTest {

	
private ArrayList<Version> versions;
boolean True = true;
boolean False = false;
boolean answer;

public ProgramTest(){
	versions = new ArrayList<Version>();
}


	@Test
	public void testProgram() {
		//Only thing test does is creates new object versions the remainder is tested in add and get
		Program testProg = new Program();
		
		
		ProgramTest localTest = new ProgramTest();
		
		if(testProg.equals (localTest)){
			 True = answer;
		}else{
			False = answer;
		}
	
		assertTrue(True);
		//have output of the file from .addVersion not really much else to do with this test
		
        
	}
}


