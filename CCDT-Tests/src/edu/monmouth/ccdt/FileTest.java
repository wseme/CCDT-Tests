package edu.monmouth.ccdt;

import static org.junit.Assert.assertEquals;

import edu.monmouth.ccdt.data.File;

import java.io.IOException;

import org.junit.Test;



public class FileTest {

private String result2String;

java.io.File FileNew = new java.io.File("test/test.txt");


@Test
	public void testFile() {
		File testFiles = new File(FileNew);
		
		//Creating Tests for file that was input into the constructor
		String result = testFiles.getFileName();
		java.io.File result2 = FileNew;
		try {
			this.result2String = result2.getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     //Making sure that the file entered matches the file name that went into the program.
		assertEquals(result, this.result2String);

   }

}
