package edu.monmouth.ccdt;

import static org.junit.Assert.*;

import java.io.*;
import java.util.*;

import org.junit.Test;

import edu.monmouth.ccdt.data.Version;

public class VersionTest {
private int num = 1;

java.io.File FileFolder = new java.io.File("test/");




	@Test
	public void testVersion() {
	
		Version testV = new Version(num, FileFolder );
	
		//Creating Tests for directory and number that was input into the constructor
		File resultDir = testV.getDirectory();
		File result2Dir = FileFolder;
		int resultNumber = testV.getNumber();
		int result2Number = num;
	    
		//Confirming number and Folder input in constructor matches created number and Folder in test
		assertEquals(resultDir, result2Dir);
		assertEquals(resultNumber, result2Number);
		
		
	}

}
