package gr.aueb.dmst.HowToBases;

import java.util.Scanner;
import java.util.ArrayList;

public class DataBase {
	
	private String dataBaseName;
	private ArrayList<Table> tables = new ArrayList<Table>();

<<<<<<< HEAD
	public DataBase() {
=======
	private String Name;
	private static int NUMBER_OF_CATEGORIES;
	private String[] categoriesNames = new String[NUMBER_OF_CATEGORIES];

	/**
	 * Creation of the DataBase.
	 * <p>
	 * This method includes naming DataBases,
	 * initializing the number of categories,
	 * initializing the names of categories and puts them in categoriesNames table. All given by the user.
	 * Creates an object of Menu class and calls menu method while passing the categoriesNames table to Menu.
	 */
	public void dataBase() {
>>>>>>> refs/remotes/origin/master

		System.out.println("Welcome to your data base. How would you like to name it?");
		Scanner sc = new Scanner(System.in);
		dataBaseName = sc.nextLine();

<<<<<<< HEAD
		Table newTable = new Table();
		tables.add(newTable);

	}

	public void chooseFunction(int choice) {

		String[] choosenCategoriesNames;
		System.out.println("Choose a table.\nCurrently existing tables: \n" 
							+ tables.toString() + "\n");
		Scanner sc = new Scanner(System.in);
		String choosenTable = sc.nextLine();
		for(Table t : tables) {
			if (choosenTable == t.getTableName()) {
				choosenCategoriesNames = t.getCategoriesNames();
			}
=======
		categoriesNames[0] = sc.nextLine();
		for (int i = 0; i < categoriesNames.length; i++) {
			System.out.println("Give name of category " + (i+1) + ":");
			categoriesNames[i] = sc.nextLine();
>>>>>>> refs/remotes/origin/master
		}
		
	    //make objects for each class so that they can be called
	    Add objAdd = new Add();
	    Delete objDelete = new Delete();
	    Edit objEdit = new Edit();
	    
	    switch (choice) {
   
	    case 1: objAdd.addElement(choosenCategoriesNames);
	            break;
       
	    case 2: objDelete.deleteElement();
	            break;

<<<<<<< HEAD
	    case 3: objEdit.editElement();
	            break;
	            
	    }
	    
=======
		//the following 4 lines are turned into comments in case we need them in the future
		//ArrayList<Object> data = new ArrayList<Object>(); 
        //int counter = 0; //counter for objects in arraylist
        //objMenu.setData(data);
        //objMenu.setCounter(0);
        Menu objMenu = new Menu();
		objMenu.menu(categoriesNames);
>>>>>>> refs/remotes/origin/master
	}

}
