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

<<<<<<< HEAD
	public static int tablesMenu(ArrayList<Object> tables) {

		System.out.println("--- TABLES MENU ---");
		System.out.println("Press 1 to create a new table in your data base. /n"
	    		         + "Press 2 to delete a table from your data base.");
	    Scanner sc = new Scanner(System.in);
	    int choice;

	    //Make sure choice is 1 or 2.
	    do {
	        choice = sc.nextInt();
	        if (choice < 1 || choice > 2 ) {
	        	System.out.println("Please insert 1 or 2.");
	        }
	    } while (choice < 1 || choice > 3);

	    return choice;

	}

	public static int functionsMenu() {

		System.out.println("--- FUNCTIONS MENU ---");
		System.out.println("Press 1 to add an element to your data base. /n"
=======
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
	public void menu(String [] categoriesNames) { 
		
	    System.out.println("Press 1 to add an element to your data base. /n"
>>>>>>> refs/remotes/origin/master
	    		         + "Press 2 to delete an element from your data base. /n"
	    		         + "Press 3 to edit an element in your data base.");
	    Scanner sc = new Scanner(System.in);
	    int choice;
<<<<<<< HEAD

	    //Make sure choice is 1, 2 or 3.
=======
	    /*If more choices are to be displayed we can use "choice <1 || choice >++" 
	     * and make a try-catch block if the answer is not an integer.
	     */
>>>>>>> refs/remotes/origin/master
	    do {
	        choice = sc.nextInt();
	        if (choice != 1 || choice != 2 || choice != 3) {
	        	System.out.println("Please insert 1,2 or 3.");
	        }
<<<<<<< HEAD
	    } while (choice < 1 || choice > 3);
=======
	    }
	    while (choice != 1 || choice != 2 || choice != 3);
	    
	    Add objAdd = new Add();
	    Delete objDelete = new Delete();
	    Edit objEdit = new Edit();
	    
	    switch (choice) {
   
	    case 1: objAdd.addElement(categoriesNames);
	            break;
       
	    case 2: objDelete.deleteElement();
	            break;
>>>>>>> refs/remotes/origin/master

	    return choice;

	}

}
