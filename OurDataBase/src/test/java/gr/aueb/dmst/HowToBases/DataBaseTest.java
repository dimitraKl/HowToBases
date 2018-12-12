package gr.aueb.dmst.HowToBases;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.Test;

public class DataBaseTest {
	

	@Test
	public void testDataBase() {
		
		DataBase objDataBase = new DataBase(); //
		assert objDataBase.getTables().size() == 1 : "The arraylist tables is empty. " +
		                                             "DataBase was not created successfully";
		
		}

	@Test
	public void testChooseTablesFunction() {
		fail("Not yet implemented");
	}

	@Test
	public void testChooseTable() {
		
		DataBase objDataBase = new DataBase(); //unnecessary message from the constructor 
		                                       //of DataBase
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
