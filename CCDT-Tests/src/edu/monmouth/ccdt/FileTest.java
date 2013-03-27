package edu.monmouth.ccdt;

import static org.junit.Assert.*;


import edu.monmouth.ccdt.data.File;



import org.junit.Test;



public class FileTest {

//creating a data file, null and image file
java.io.File FileNew = new java.io.File("testRoot/test/test.txt");
java.io.File File2Null = new java.io.File("testRoot/testDanNull/testNull.txt");
java.io.File File3Jpeg = new java.io.File("testRoot/testDanJpeg/Test.jpeg");

@Test
	public void testFile() {
		//Testing inserting a file containing data and also inserting a Null File into the constructor
		File testFiles = new File(FileNew);
		//Expecting to get warning for Null file
		File testFilesNull = new File(File2Null);
		//Expecting to get warning not allowing Jpeg
		File testFilesJpeg = new File(File3Jpeg);
		
		//Confirming that all of these files are seen differently by the File.java
		assertNotSame(testFiles, testFilesNull);
		assertNotSame(testFiles, testFilesJpeg);
		
		
		
		
		
   }

}
