package gr.aueb.dmst.HowToBases;

import java.util.Scanner;
public class DataBase {
	

	public static void main(String [] args) {

		System.out.println("Welcome to your data base. How would you like to name it?");
		Scanner sc = new Scanner(System.in);
		String dbName = sc.nextLine();//read name of the whole Data Base
		System.out.println("How many categories would you like?");
		int catNum = sc.nextInt();//read number of categories
		String [] catNames = new String[catNum];//initialize array with the names of category
		catNames[0]=sc.nextLine();
		for (int i = 0; i < catNum; i++) { //fill catNames

			System.out.println("Give name of category "+ (i+1) +":");
			catNames[i] = sc.nextLine();

		}

		//call menu method


    }//end main

}//end class


