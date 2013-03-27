package edu.monmouth.ccdt;

import static org.junit.Assert.*;

import org.junit.Test;

import edu.monmouth.ccdt.data.Change;
import edu.monmouth.ccdt.data.File;
import edu.monmouth.ccdt.data.Version;

public class ChangeTest {
	private Version previousVersion1;
	private Version currentVersion1;
	private File file1;
	
	@Test
	public void testChange() {
		//Creating Tests for directory and number that was input into the constructor
		//*****In order to get this to work the modifier needs to be changed on the private variable in Change
		//Really just inputting the variables and making sure they are not altered going through the constructor.
		Change testChange = new Change(previousVersion1,currentVersion1,file1);
		//Version testPrev = testChange.previousVersion;
		Version test2Prev = previousVersion1;
		//Version testCurr = testChange.currentVersion;
		Version test2Curr = currentVersion1;
		//File testFile = testChange.file;
        File test2File = file1;
		//assertEquals(testPrev, test2Prev);
		//assertEquals(testCurr, test2Curr);
		//assertEquals(testFile, test2File);

	}

}
