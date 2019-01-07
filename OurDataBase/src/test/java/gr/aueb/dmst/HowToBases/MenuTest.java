package gr.aueb.dmst.HowToBases;

import org.junit.Test;

public class MenuTest {

	@Test
	public void testTablesMenu() {
	
	    Menu menuObj = new Menu();
	    int choice = menuObj.tablesMenu();
	    assert choice >= 1 & choice <= 4 : "Error in TablesMenu. Invalid return value";
	    
	}
	
	@Test
	public void testDataMenu() {
		
		Menu menuObj = new Menu();
	    int choice = menuObj.dataMenu();
	    assert choice >= 1 & choice <= 4 : "Error in DataMenu. Invalid return value";
	
	}
	
	@Test
	public void testDataByColumnMenu() {
		
		Menu menuObj = new Menu();
	    int choice = menuObj.dataByColumnMenu();
	    assert choice >= 1 & choice <= 3 : "Error in DataByColumnMenu. Invalid return value";
	
	}

}

