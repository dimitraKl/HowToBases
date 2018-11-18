package gr.aueb.dmst.HowToBases;

import java.util.Scanner;
//import java.util.ArrayList;

public class DataBase {

	private String Name;
	private static int NUMBER_OF_CATEGORIES;
	private String[] categoriesNames = new String[NUMBER_OF_CATEGORIES];

	public void dataBase() {

		System.out.println("Welcome to your data base. How would you like to name it?");
		Scanner sc = new Scanner(System.in);
		Name = sc.nextLine();
		System.out.println("How many categories would you like?");
		NUMBER_OF_CATEGORIES = sc.nextInt();

		//Fill table categoriesNames with elements
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
		objMenu.menu(categoriesNames); //give catNames as a parameter since it doesn't change
		                        //and it will be needed for our prints 
	}

}
