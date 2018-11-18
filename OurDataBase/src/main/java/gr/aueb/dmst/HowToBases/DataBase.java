package gr.aueb.dmst.HowToBases;

<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
public static void main(String [] args) {
		
		System.out.println("Welcome to your data base. How would you like to name it?");
		Scanner sc = new Scanner(System.in);
		String dbName = sc.nextLine();
		System.out.println("How many categories would you like?");
		int catNum = sc.nextInt();
		String [] catNames = new String[catNum];
		catNames[0] = sc.nextLine();
		for (int i = 0; i < catNum; i++) {
			
			System.out.println("Give name of category "+ (i+1) +":");
			catNames[i] = sc.nextLine();
		}
		
		
		Add obj0 = new Add();
		obj0.values(catNames, catNum);
		System.out.println("Now you can create your data base. Please insert your data." );
		ArrayList <Object> data = new ArrayList <Object>();
		int i = 0;
		//δυο επαναληψεις η μια μεσα στην αλλη
		do {
			ArrayList<String> obj1 = new ArrayList<String>();
			Add obj2 = new Add();
			System.out.println("Add your number " +(i+1)+ " element for category "+catNames[i]);
			String el = sc.nextLine();
			obj1.add(i,el);
			obj2.set(i, el);
			i++;
			
			
			
		} while (i<=10);
	
		
	}
}
=======
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


>>>>>>> refs/remotes/origin/master
