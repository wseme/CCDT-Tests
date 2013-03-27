package edu.monmouth.ccdt;
//Need to continue to work on.
import java.util.ArrayList;
import static org.junit.Assert.*;

import org.junit.Test;

import edu.monmouth.ccdt.data.Program;
import edu.monmouth.ccdt.data.Version;



public class ProgramTest {
private	java.io.File FileNew = new java.io.File("test/");
	
	@Test
	public void testProgram() {
		//Only thing test does is creates new object versions the remainder is tested in add and get
		Program testProg = new Program();
		
		//additional test of methods
		testProg.addVersion(FileNew);
		ArrayList<Version> testResult = testProg.getVersions();
        
        
	}
}


