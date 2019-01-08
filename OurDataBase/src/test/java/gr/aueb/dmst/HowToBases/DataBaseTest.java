package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import org.junit.Test;

public class DataBaseTest {
	

	@Test
	public void testDataBase() {
		
		DataBase objDataBase = new DataBase("Phone Book");
		assert objDataBase.getDataBaseName().equals("Phone Book") : "DataBase was not named successfully";
		
	}


}
