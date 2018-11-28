package gr.aueb.dmst.HowToBases;

import java.util.Scanner;
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

	public DataBase() {

		System.out.println("Welcome to your data base. How would you like to name it?");
		Scanner sc = new Scanner(System.in);
		dataBaseName = sc.nextLine();

		Table newTable = new Table();
		tables.add(newTable);

	}
	
	public void chooseTablesFunction() {
		
		int choice = Menu.tablesMenu();
		
		//make objects for each class so that they can be called
	    //Addition objAdd = new Addition();
		Deletion objDelete = new Deletion();
		
		switch (choice) {
	   
		case 1: //tables = objAdd.addTable(tables);
				Table newTable = new Table();
				tables.add(newTable);
	            break;
       
	    case 2: tables = objDelete.deleteTable(tables, chooseTable());
	            break;

	    case 3: chooseTable().chooseDataFunction();
	            break;
	            
	    case 4: Display.toDisplayAll(tables);
		            
	    }

	}

	public Table chooseTable() {

		System.out.println("Choose a table.\nCurrently existing tables: \n" 
							+ tables.toString() + "\n");
		Scanner sc = new Scanner(System.in);
		String chosenTable = sc.nextLine();
		Table returnValue = null;
		do {
			for(Table t : tables) {
				if (chosenTable.equals(t.getTableName())) {
					returnValue = t;
					break;
				}
			}
			if (returnValue == null) {
				System.out.println("The chosen table does not exist.\n"
								 + "Please choose again.\nCurrently existing tables: \n"
						         + " tables.toString()" + "\n");
				chosenTable = sc.nextLine();
			}
		} while(returnValue == null);
		
		return returnValue;

	}

}
