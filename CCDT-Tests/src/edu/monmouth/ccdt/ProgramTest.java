package edu.monmouth.ccdt;
//Need to continue to work on.
import java.util.ArrayList;


import org.junit.Test;

import edu.monmouth.ccdt.data.Program;
import edu.monmouth.ccdt.data.Version;



public class ProgramTest {
private	java.io.File FileNew = new java.io.File("testRoot/test");
	
	@Test
	public void testProgram() {
		//Only thing test does is creates new object versions the remainder is tested in add and get
		Program testProg = new Program();
		
		//additional test of methods not really doing much these methods will be tested in other tests.
		testProg.addVersion(FileNew);
		ArrayList<Version> testResult = testProg.getVersions();
        
		//have output of the file from .addVersion not really much else to do with this test
		
        
	}
}


