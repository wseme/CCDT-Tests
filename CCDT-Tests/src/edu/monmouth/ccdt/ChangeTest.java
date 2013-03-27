package edu.monmouth.ccdt;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.monmouth.ccdt.data.Change;
import edu.monmouth.ccdt.data.File;
import edu.monmouth.ccdt.data.Version;



public class ChangeTest {
	//Create the test file
	private java.io.File FileNew = new java.io.File("test/test.txt");
	java.io.File FileFolder = new java.io.File("test/");
	private int num = 2;
	private int numPrev = 1;
	private Version previousVersion1;
	private Version currentVersion1;
	
	
	@Test
	public void testChange() {
		File testFiles = new File(FileNew);
		Version testVer = new Version(num, FileFolder);
		Version testVerPrev = new Version(numPrev, FileFolder);
		//Testing that the change constructor will successfully take the arguements ver, ver and file directory
		Change testChanges = new Change(testVer,testVerPrev,testFiles);
		

	}

}
