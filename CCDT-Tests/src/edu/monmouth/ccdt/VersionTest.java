package edu.monmouth.ccdt;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import junit.framework.TestCase;

import org.junit.Test;

import edu.monmouth.ccdt.data.Change;
import edu.monmouth.ccdt.data.File;
import edu.monmouth.ccdt.data.Version;


public class VersionTest {

//Create to test the Versions through Change.
java.io.File FileFolderCurr = new java.io.File("testRoot/test/");
private int num = 2;
private java.io.File FileFolderPrev = new java.io.File("testRoot/testDanPrevVer/");
private int numPrev = 1;
private java.io.File FileNew = new java.io.File("testRoot/test/test.txt");

	@Test
	public void testVersion() {
		//Created a previous and current instance
		Version testCurr = new Version(num, FileFolderCurr);
		Version testPrev = new Version(numPrev, FileFolderPrev);
		//Create a test file from Files
		File testFiles = new File(FileNew);
		//Add Versions and test files through Change to confirm it works.
		Change testVersionsChange = new Change(testCurr,testPrev, testFiles );
		
		
		
		
		


		
	}

}
