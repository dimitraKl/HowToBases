package gr.aueb.dmst.HowToBases;

import javax.swing.JOptionPane;
import java.util.ArrayList;

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

	public String askForDBName() {
		dataBaseName = JOptionPane.showInputDialog(
		        "Welcome to your DataBase.\nHow would you like to name it?");

		if (dataBaseName == null || (dataBaseName != null && ("".equals(dataBaseName)))) {
			    System.exit(0);
		}

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
