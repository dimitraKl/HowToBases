package gr.aueb.dmst.HowToBases;

import org.junit.Test;

public class DataTest {
	
	@Test
	public void testData() {
    	
    	String [] databycolumn = {"fani", "sakellariou"};
    	Data dataobj = new Data("name", 0, databycolumn );
    	assert dataobj.getReferencePointName().equals("name") : "Error in the constructor. " + 
				                                                "Invalid reference point name";
		assert dataobj.getReferencePoint() == 0 : "Error in the constructor. " + 
                                                  "Invalid reference point number";
		assert dataobj.getDataByColumn().length == 2 : "Error in the constructor. " + 
                                                       "Invalid size of data by column";
	}
	
	@Test
	public void testConvertReferencePoint() {
	String [] categoriesNames = {"name", "surname"};
	Data dataObj = new Data();
	int referencePoint =  dataObj.convertReferencePoint("name", categoriesNames);
	assert referencePoint == 0 : "Error in referencePoint method. " +
	                             "Invalid array position returned.";
	
	}
	
	@Test
	public void testChooseData() {
		
		String [] catNames = {"name", "surname"};
		Data dataobj = new Data();
		int choice = dataobj.chooseData(catNames);
		assert choice != -1 : "Error in ChooseData. Returned value is -1";
		
	}

}