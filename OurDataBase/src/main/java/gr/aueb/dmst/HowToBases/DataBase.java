package gr.aueb.dmst.HowToBases;

import java.util.Scanner;
import java.util.ArrayList;
public class DataBase {
	

	public void dataBase() {

		System.out.println("Welcome to your data base. How would you like to name it?");
		Scanner sc = new Scanner(System.in);
		String dbName = sc.nextLine();//read name of the whole Data Base
		System.out.println("How many categories would you like?");
		int catNum = sc.nextInt();//read number of categories
		String [] catNames = new String[catNum];//initialize array with the names of categories
		catNames[0]=sc.nextLine();
		for (int i = 0; i < catNum; i++) { //fill catNames

			System.out.println("Give name of category "+ (i+1) +":");
			catNames[i] = sc.nextLine();

		}
		//the following 4 lines are turned into comments in case we need them in the future
		//ArrayList<Object> data = new ArrayList<Object>(); 
        //int counter = 0; //counter for objects in arraylist
        //objMenu.setData(data);
        //objMenu.setCounter(0);
        Menu objMenu = new Menu();
		objMenu.menu(catNames); //give catNames as a parameter since it doesn't change
		                        //and it will be needed for our prints 
	}//end dataBase method

}//end class DataBase


