package gr.aueb.dmst.HowToBases;

import org.junit.Test;

public class MenuTest {

	@Test
	public void testTablesMenu() {
	
	    int choice = Menu.tablesMenu();
	    assert choice >= 1 & choice <= 4 : "Error in TablesMenu. Invalid return value";
	    
	}
	
	@Test
	public void testDataMenu() {
	
	    int choice = Menu.dataMenu();
	    assert choice >= 1 & choice <= 4 : "Error in DataMenu. Invalid return value";
	
	}
	
	@Test
	public void testDataByColumnMenu() {
		
	    int choice = Menu.dataByColumnMenu();
	    assert choice >= 1 & choice <= 3 : "Error in DataByColumnMenu. Invalid return value";
	
	}

}

