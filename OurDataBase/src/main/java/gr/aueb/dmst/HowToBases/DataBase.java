package gr.aueb.dmst.HowToBases;

import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 * Creates the DataBase.
 * Creates and initializes the name of the database and the type Table tables.
 */

public class DataBase { 

	private String dataBaseName;
	private ArrayList<Table> tables = new ArrayList<Table>();

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
		this.tables = new ArrayList<Table>(tables);
	}

	public DataBase() {

	}

	public DataBase(String dataBaseName) {
		this.dataBaseName = dataBaseName;
	}

	public DataBase(String dataBaseName, ArrayList<Table> tables) {
		this.dataBaseName = dataBaseName;
		this.tables = new ArrayList<Table>(tables);
	}
	
	/**
	 * Asks the user to give a name for the database.
	 * @return dataBaseName the name of the database.
	 */

	public String askForDBName() {
		dataBaseName = JOptionPane.showInputDialog(
		        "Welcome to your DataBase.\nHow would you like to name it?");

		if (dataBaseName == null || (dataBaseName != null && ("".equals(dataBaseName)))) {
			    System.exit(0);
		}

		return dataBaseName;
	}
	
	/**
	 * Calls class Menu and manages the user's choice on table tables.
	 */

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
	
	/**
	 * Displays the existing tables and asks the user to choose.
	 * If the table exists, it returns the chosen table from table tables, 
	 * if not they are asked to chose again.
	 * @return returnValue the chosen table that exists in table tables.
	 */

	public Table chooseTable() {
		String chosenTable = JOptionPane.showInputDialog("Choose a table.\nCurrently existing tables: \n"
							+ tables.toString() + "\n");
		if (chosenTable == null || (chosenTable != null && ("".equals(chosenTable)))) {
			    System.exit(0);
		}

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
			if (chosenTable == null || (chosenTable != null && ("".equals(chosenTable)))) {
				    System.exit(0);
			}
		} while(returnValue == null);

		return returnValue;
	}

}
