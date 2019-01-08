package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import org.junit.Test;

public class TableTest {

    
    @Test
    public void testChooseData() {
    	
    	String [] dataByColumn1 = {"Anna", "Samouri"};
    	Data dataobj1 = new Data("name", 0, dataByColumn1);
    	String [] dataByColumn2 = {"Fani", "Sakellariou"};
    	Data dataobj2 = new Data("name", 0, dataByColumn2);
    	ArrayList<Data> allData = new ArrayList<Data>();
    	allData.add(dataobj1);
    	allData.add(dataobj2);
    	Table tableObj = new Table();
    	tableObj.setAllData(allData);
    	Data data = tableObj.chooseData();
    	assert allData.contains(data) : "Invalid returned value";
    	
    }

}

