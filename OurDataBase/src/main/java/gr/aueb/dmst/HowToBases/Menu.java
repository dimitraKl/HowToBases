package gr.aueb.dmst.HowToBases;
import java.util.Scanner;
import java.util.ArrayList;


public class Menu {

	private ArrayList<Object> data; //make both of them instance vars so that we can change them
	//private int counter; we don't know yet if we will need a counter

	
	public void setData(ArrayList<Object> data) { //keep our arraylist up to date any class needed
		this.data = data;						 //(comment will be deleted when added to the java doc of Add class)
	}

	public ArrayList<Object> getData(){ //get an up to date arraylist from any class needed
		return data;					//(comment will be deleted when added to the java doc of Add class)
	}

	//we don't know if we will need a counter for objs in arraylist

	//public void setCounter(int counter){
		//this.counter = counter;
	//}

	//public int getCounter() {
		//return counter;
	//}

	public static int tablesMenu(ArrayList<Object> tables) {

		System.out.println("--- TABLES MENU ---");
		System.out.println("Press 1 to create a new table in your data base. /n"
	    		         + "Press 2 to delete a table from your data base.");
	    Scanner sc = new Scanner(System.in);
	    int choice;

	    //Make sure choice is 1 or 2.
	    do {
	        choice = sc.nextInt();
	        if (choice != 1 || choice != 2 ) {
	        	System.out.println("Please insert 1 or 2.");
	        }
	    } while (choice != 1 || choice != 2);

	    return choice;

	}

	public static int functionsMenu() {

		System.out.println("--- FUNCTIONS MENU ---");
		System.out.println("Press 1 to add an element to your data base. /n"
	    		         + "Press 2 to delete an element from your data base. /n"
	    		         + "Press 3 to edit an element in your data base.");
	    Scanner sc = new Scanner(System.in);
	    int choice;

	    /*If more choices are to be displayed we can use "choice <1 || choice >++" 
	     * and make a try-catch block if the answer is not an integer.
	     */

	    //Make sure choice is 1, 2 or 3.
	    do {
	        choice = sc.nextInt();
	        if (choice != 1 || choice != 2 || choice != 3) {
	        	System.out.println("Please insert 1,2 or 3.");
	        }
	    } while (choice != 1 || choice != 2 || choice != 3);

	    return choice;

	}

}
