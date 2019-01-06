package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;

import org.junit.Test;

public class DataBaseTest {
	

	@Test
	public void testDataBase() {
		
		DataBase objDataBase = new DataBase("Phone Book"); //
		assert objDataBase.getDataBaseName().equals("Phone Book") : "DataBase was not named successfully";
		
	}

	@Test
	public void testChooseTable() {
		
		DataBase objDataBase = new DataBase();
		Table dataobj1 = new Table();
		Table dataobj2 = new Table();
		ArrayList<Table> tables = new ArrayList<Table>();
		tables.add(dataobj1);
		tables.add(dataobj2);
	    objDataBase.setTables(tables);
		Table table = objDataBase.chooseTable();
		assert objDataBase.getTables().contains(table) : "Invalid returned arraylist.";
		
	}

}
