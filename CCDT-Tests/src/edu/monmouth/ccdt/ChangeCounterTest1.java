package edu.monmouth.ccdt;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import edu.monmouth.ccdt.data.Change;
import edu.monmouth.ccdt.data.File;
import edu.monmouth.ccdt.data.Version;

public class ChangeCounterTest1 {

	
		//Create the two imported Files
		java.io.File t1 = new java.io.File("/TestFiles/src/ccdt/testfiles/TestFile1.java");
		java.io.File t2 = new java.io.File("/TestFiles/src/ccdt/testfiles/TestFile2.java");
		//Create the two versions from the Files
		Version v1 = new Version(1, t1);
		Version v2 = new Version(2, t2);
		//Create a File from the java.io.File
		File tf1 = new File(t1);
		File tf2 = new File(t2);
		//Create instance of Change with Versions and File
		Change test1 = new Change(v1,v2,tf2);
		
	@Test
	public void testCompare() {
		File previousFile = tf1;
		File currentFile = tf2;
		assertEquals(tf1, previousFile);
		assertEquals(tf2, currentFile);
	}
	
	@Test
	public void testGetLineAmountAdded() {
//		ArrayList<Line> lines = v1.gtChange();
//		int lineCount = 0;
//		assertTrue(lineCount > 0);
	}

	@Test
	public void testGetLineAmountDeleted() {
		int linecount=0;
		assertTrue(linecount > 0);
		
	}

	@Test
	public void testGetLineAmountChanged() {
		int linecount=0;
		assertTrue(linecount > 0);
	}

	@Test
	public void testGetLineAmountNoChange() {
		int linecount = 0;
		assertTrue(linecount > 0);
	}

}