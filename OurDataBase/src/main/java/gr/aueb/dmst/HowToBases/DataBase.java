package gr.aueb.dmst.HowToBases;

import java.util.Scanner;
//import java.util.ArrayList;

public class DataBase {

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

		System.out.println("Welcome to your data base. How would you like to name it?");
		Scanner sc = new Scanner(System.in);
		Name = sc.nextLine();
		System.out.println("How many categories would you like?");
		NUMBER_OF_CATEGORIES = sc.nextInt();

		categoriesNames[0] = sc.nextLine();
		for (int i = 0; i < categoriesNames.length; i++) {
			System.out.println("Give name of category " + (i+1) + ":");
			categoriesNames[i] = sc.nextLine();
		}

		//the following 4 lines are turned into comments in case we need them in the future
		//ArrayList<Object> data = new ArrayList<Object>(); 
        //int counter = 0; //counter for objects in arraylist
        //objMenu.setData(data);
        //objMenu.setCounter(0);
        Menu objMenu = new Menu();
		objMenu.menu(categoriesNames);
	}

}
