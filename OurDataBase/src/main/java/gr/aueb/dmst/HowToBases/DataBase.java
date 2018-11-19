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

	public void chooseFunction() {

		String[] choosenCategoriesNames;
		System.out.println("Choose a table.\nCurrently existing tables: \n" 
							+ tables.toString() + "\n");
		Scanner sc = new Scanner(System.in);
		String choosenTable = sc.nextLine();
		for(Table t : tables) {
			if (choosenTable == t.getTableName()) {
				choosenCategoriesNames = t.getCategoriesNames();
			}
		}

		int choice = Menu.functionsMenu();

	    //make objects for each class so that they can be called
	    Add objAdd = new Add();
	    Delete objDelete = new Delete();
	    Edit objEdit = new Edit();
	    
	    switch (choice) {
   
	    case 1: objAdd.addElement(choosenCategoriesNames);
	            break;
       
	    case 2: objDelete.deleteElement();
	            break;

	    case 3: objEdit.editElement();
	            break;
	            
	    }

	}

}
