package gr.aueb.dmst.HowToBases;

import static org.junit.Assert.*;

import org.junit.Test;

public class DataTest {
	
	@Test
	public void testData() {
    	
    	String [] catNames = {"name", "surname"};
    	Data dataobj = new Data(catNames, "name");
    	assert dataobj.getReferencePointName().equals("name") : "Error in the constructor. " + 
				                                                "Invalid reference point name";
		assert dataobj.getReferencePoint() == 0 : "Error in the constructor. " + 
                                                  "Invalid reference point number";
		assert dataobj.getDataByColumn().length == 2 : "Error in the constructor. " + 
                                                       "Invalid size of data by column";
	}

	@Test
	public void testChooseFunction() {
		fail("Not yet implemented");
	}

	@Test
	public void testChooseData() {
		
		String [] catNames = {"name", "surname"};
		Data dataobj = new Data(catNames, "name");
		int choice = dataobj.chooseData(catNames);
		assert choice != -1 : "Error in ChooseData. Returned value is -1";
		
	}

	@Test
	public void testToString() {
		fail("Not yet implemented");
	}

	@Test
	public void testToMyString() {
		fail("Not yet implemented");
	}

}
