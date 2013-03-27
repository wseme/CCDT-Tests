package edu.monmouth.ccdt;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.monmouth.ccdt.data.Change;
import edu.monmouth.ccdt.data.File;
import edu.monmouth.ccdt.data.Version;



public class ChangeTest {
	//Create the test file,folder and integer
	private java.io.File FileNew = new java.io.File("test/test.txt");
	private java.io.File FileFolder = new java.io.File("test/");
	//private java.io.File FileNew = new java.io.File("test/test.txt");
	private java.io.File FileFolderPrev = new java.io.File("testDanPrevVer/");
	private int num = 2;
	private int numPrev = 1;
	
	
	
	@Test
	public void testChange() {
		File testFiles = new File(FileNew);
		Version testVer = new Version(num, FileFolder);
		Version testVerPrev = new Version(numPrev, FileFolderPrev);
		//Testing that the change constructor will successfully take the arguements ver, prev ver and file directory
		Change testChanges = new Change(testVer,testVerPrev,testFiles);
		

	}

}
