package edu.monmouth.ccdt;

import static org.junit.Assert.*;


import edu.monmouth.ccdt.data.File;



import org.junit.Test;



public class FileTest {

//creating a data file, null and image file
java.io.File FileNew = new java.io.File("test/test.txt");
java.io.File File2Null = new java.io.File("testDanNull/testNull.txt");
java.io.File File3Jpeg = new java.io.File("test/Test.jpeg");

@Test
	public void testFile() {
		//Testing inserting a file containing data and also inserting a Null File into the constructor
		File testFiles = new File(FileNew);
		File testFilesNull = new File(File2Null);
		File testFilesJpeg = new File(File3Jpeg);
		
		assertNotSame(testFiles, testFilesNull);
		assertNotSame(testFiles, testFilesJpeg);
		
		
		
		
		
   }

}
