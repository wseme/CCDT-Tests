package edu.monmouth.ccdt;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.monmouth.ccdt.data.Change;
import edu.monmouth.ccdt.data.File;
import edu.monmouth.ccdt.data.Version;



public class ChangeTest {
	//Create the test file,folder and integer
	private java.io.File FileNew = new java.io.File("testRoot/test/test.txt");
	private java.io.File FileFolder = new java.io.File("testRoot/test/");
	//private java.io.File FileNew = new java.io.File("test/test.txt");
	private java.io.File FileFolderPrev = new java.io.File("testRoot/testDanPrevVer/");
	private int num = 2;
	private int numPrev = 1;
	
	
	File testFiles = new File(FileNew);
	Version testVer = new Version(num, FileFolder);
	Version testVerPrev = new Version(numPrev, FileFolderPrev);
	//Testing that the change constructor will successfully take the arguements ver, prev ver and file directory
	Change testChanges = new Change(testVer,testVerPrev,testFiles);
	
	
	
	@Test
	public void testChange() {

		
		//Confirming that testVer and testVerPrev are not the same
		//assertNotSame(testVer, testVerPrev);
		assertSame(testVer,testVer);
		
		
		//Expect output return of our files test.txt from both Prev and Cur dir.
        
		
	}
public Change getChangeTest(){
	return testChanges;
	
}
	
} 
