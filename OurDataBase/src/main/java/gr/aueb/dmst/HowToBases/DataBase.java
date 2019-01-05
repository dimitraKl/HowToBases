package gr.aueb.dmst.HowToBases;



// import java.util.Scanner;

import javax.swing.JOptionPane;

//import javax.swing.JFrame;
import java.util.ArrayList;

public class DataBase { 

	private String dataBaseName;
	private ArrayList<Table> tables = new ArrayList<Table>();


	/**
	 * Creation of the DataBase.
	 * <p>
	 * This method includes naming DataBases,
	 * initializing the number of categories,
	 * initializing the names of categories and puts them in categoriesNames table. All given by the user.
	 * Creates an object of Menu class and calls menu method while passing the categoriesNames table to Menu.
	 */

	public String getDataBaseName() {
		return dataBaseName;
	}

	public void setDataBaseName(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}

	public ArrayList<Table> getTables() {
		return tables;
	}

	public void setTables(ArrayList<Table> tables) {
		this.tables = tables;
	}

	public DataBase() {

	}

	public DataBase(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}


	public String askForDBName() {
	//	WelcomeDatabaseFrame wd = new WelcomeDatabaseFrame();
	//	wd.setWDVisible(true);
		dataBaseName = JOptionPane.showInputDialog(
		        "Welcome to your DataBase.\nHow would you like to name it?");
				
		//	dataBaseName = wd.getName();
		return dataBaseName;
}

	public void chooseTablesFunction() {
		int choice = Menu.tablesMenu();
		Functions f = new Functions();

		switch (choice) {
		case 1: tables = f.addTable(tables);
	            break;

	    case 2: tables = f.deleteTable(tables, chooseTable());
	            break;

	    case 3: chooseTable().chooseDataFunction();
	            break;

	    case 4: f.toDisplayTable(tables);
	    		break;
	    }

	}

	public Table chooseTable() {
		String chosenTable = JOptionPane.showInputDialog("Choose a table.\nCurrently existing tables: \n"
							+ tables.toString() + "\n");
		
		Table returnValue = null;
		do {
			for(Table t : tables) {
				if (chosenTable.equals(t.getTableName())) {
					returnValue = t;
					break;
				}
			}
			if (returnValue == null) {
				chosenTable = JOptionPane.showInputDialog("The chosen table does not exist.\n"
								 + "Please choose again.\nCurrently existing tables: \n"
						         + tables.toString() + "\n");
				
			}
		} while(returnValue == null);

		return returnValue;
	}

}

