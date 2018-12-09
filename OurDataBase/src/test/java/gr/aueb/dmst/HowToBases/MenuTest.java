package gr.aueb.dmst.HowToBases;

import static org.junit.Assert.*;

import org.junit.Test;

public class MenuTest {
	Menu menuObj = new Menu();
	
	@Test
	public void testTablesMenu() {
		
		int x = menuObj.tablesMenu();
		assert x >= 1 && x <=4 : "The value returned is invalid." ;
		
	}

	@Test
	public void testDataMenu() {
		
		int x = menuObj.dataMenu();
		assert x >= 1 && x <=4 : "The value returned is invalid." ;
		
	}

	@Test
	public void testDataByColumnMenu() {
		
		int x = menuObj.dataMenu();
		assert x >= 1 && x <=2 : "The value returned is invalid." ;
		
	}

}
