package gr.aueb.dmst.HowToBases;
import java.util.Scanner;
import java.util.ArrayList;

/**
 * Creates a menu of choices for processing the Database
 * @author minarioanna
 */
public class Menu {

	private ArrayList<Object> data; //make both of them instance vars so that we can change them
	//private int counter; we don't know yet if we will need a counter

	/**Setting a data Objects in an Array list.
	 * <p>
	 *This method can initialize or change the data of the array list.  
	 * @param data an array list of Objects, the data of DataBases
	 */
	public void setData(ArrayList<Object> data) { //keep our arraylist up to date any class needed
		this.data = data;						 //(comment will be deleted when added to the java doc of Add class)
	}

	/**
	 * Returns a data Array list of Objects.
	 * <p>
	 * This method can be used to get the data of the array list.
	 * The data array list can be used to call the instance variables.
	 * @return an array list of objects, the data od DataBase
	 */
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

	public static int tablesMenu() {

		System.out.println("--- TABLES MENU ---");
		System.out.println("Press 1 to create a new table in your data base. \n"
	    		         + "Press 2 to delete a table from your data base. \n"
				         + "Press 3 to edit a table from your data base. \n"
	    		         + "Press 4 to display all the tables of your data base. \n");
	    Scanner sc = new Scanner(System.in);
	    int choice;

	    //Make sure choice is 1 or 2.
	    do {
	        choice = sc.nextInt();
	        if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
	        	System.out.println("Please insert 1, 2, 3 or 4.");
	        }
	    } while (choice != 1 && choice != 2 && choice != 3 && choice != 4);

	    return choice;

	}

	/**
	 * The menu of processing choices for the DataBase.
	 * <p>
	 * This method displays a menu from which the user can choose to 
	 * add, delete or edit an element of the DataBase.
	 * Makes sure choice is 1,2 or 3.
	 * Creates objects from classes Add, Delete, Edit so their methods can be used.
	 * Transfers the categoriesNames table to other methods or classes. 
	 * @param categoriesNames a table with the names of the categories of the DataBase. 
	 */
	public static int dataMenu() {

		System.out.println("--- FUNCTIONS MENU ---");
		System.out.println("Press 1 to add an element to this table. \n"
	    		         + "Press 2 to delete an element from this table. \n"
	    		         + "Press 3 to edit an element in this table. \n"
	    		         + "Press 4 to display the elements of this table. \n");
		//add table names 
	    Scanner sc = new Scanner(System.in);
	    int choice;

	    /*If more choices are to be displayed we can use "choice <1 || choice >++" 
	     * and make a try-catch block if the answer is not an integer.
	     */

	    //Make sure choice is 1, 2 or 3.
	    do {
	        choice = sc.nextInt();
	        if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
	        	System.out.println("Please insert 1, 2, 3 or 4. ");
	        }
	    } while (choice != 1 && choice != 2 && choice != 3 && choice != 4);

	    return choice;

	}

}
