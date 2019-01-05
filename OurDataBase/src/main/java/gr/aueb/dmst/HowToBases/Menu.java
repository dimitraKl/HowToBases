package gr.aueb.dmst.HowToBases;

// import java.util.InputMismatchException;
//import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

/**
 * Creates a menu of choices for processing the Database
 * @author minarioanna
 */
public class Menu {

	public static int tablesMenu() {

	//	System.out.println("\n\n");
	//	System.out.println("--- TABLES MENU ---");
	//	System.out.println("Press 1 to create a new table in your data base. \n"
	 //   		         + "Press 2 to delete a table from your data base. \n"
	//			         + "Press 3 to edit a table of your data base. \n"
	 //   		         + "Press 4 to display all the tables of your data base. \n\n");
	 //   Scanner sc = new Scanner(System.in);
		
		
		JRadioButton button1 = new JRadioButton("Create a new table in your data base. \n");
		JRadioButton button2 = new JRadioButton("Delete a table from your data base. \n");
		JRadioButton button3 = new JRadioButton("Edit a table of your data base. \n");
		JRadioButton button4 = new JRadioButton("Display all the tables of your data base. \n\n");
		
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		JOptionPane.showMessageDialog(null,panel);
		
		int choice = 0;
		if (button1.isSelected()) {
			choice = 1;
		} else if(button2.isSelected()) {
			choice = 2;
		} else if(button3.isSelected()) {
			choice = 3;
		}else {
			choice = 4;
		}
		
	//    boolean input;

	    //Make sure choice is 1, 2, 3 or 4.
	//    do {
	 //   	do {
	  //  		try {
	   // 			input = true;
		//            choice = sc.nextInt();
		 //       } catch(InputMismatchException e) {
		 //       	input = false;
		 //       	System.out.println("You must insert a number (1-4).");
		 //       }   
	   // 	} while(input = false);
	   // 	if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
       // 		System.out.println("Please insert 1, 2, 3 or 4. ");
	//		}
	 //   } while (choice != 1 && choice != 2 && choice != 3 && choice != 4);

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

//		System.out.println("\n\n");
//		System.out.println("--- FUNCTIONS MENU ---");
//		System.out.println("Press 1 to add an element to this table. \n"
//	    		         + "Press 2 to delete an element from this table. \n"
//	    		         + "Press 3 to edit an element in this table. \n"
//	    		         + "Press 4 to display the elements of this table. \n\n");
		//add table names
//	    Scanner sc = new Scanner(System.in);
	   
	    
	    JRadioButton button1 = new JRadioButton("Add an element to this table. \n");
		JRadioButton button2 = new JRadioButton("Delete an element from this table. \n");
		JRadioButton button3 = new JRadioButton("Edit an element in this table. \n");
		JRadioButton button4 = new JRadioButton("Display the elements of this table. \n\n");
		
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		JOptionPane.showMessageDialog(null,panel);
		
		int choice = 0;
		if (button1.isSelected()) {
			choice = 1;
		} else if(button2.isSelected()) {
			choice = 2;
		} else if(button3.isSelected()) {
			choice = 3;
		}else {
			choice = 4;
		}
		
	    /*If more choices are to be displayed we can use "choice <1 || choice >++"
	     * and make a try-catch block if the answer is not an integer.
	     */

		// boolean input;
	    
//	   		do {
//	    	do {
//	    		try {
//	    			input = true;
//		            choice = sc.nextInt();
//		        } catch(InputMismatchException e) {
//		        	input = false;
//		        	System.out.println("You must insert a number (1-4).");
//		        }   
//	    	} while(input = false);
//	    	if (choice != 1 && choice != 2 && choice != 3 && choice != 4) {
 //       		System.out.println("Please insert 1, 2, 3 or 4. ");
//			}
//	    } while (choice != 1 && choice != 2 && choice != 3 && choice != 4);

	    return choice;

	}

	public static int dataByColumnMenu() {

//		System.out.println("\n\n");
//		System.out.println("--- FUNCTIONS MENU ---");
//		System.out.println("Press 1 to edit a category of this data element. \n"
//	    		         + "Press 2 to display a category of this data element. \n\n");
//		Scanner sc = new Scanner(System.in);
//		boolean input;

		JRadioButton button1 = new JRadioButton("Edit a category of this data element. \n");
		JRadioButton button2 = new JRadioButton("Display a category of this data element. \n\n");
		
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		JOptionPane.showMessageDialog(null,panel);
		
		int choice = 0;
		
		if (button1.isSelected()) {
			choice = 1;
		} else {
			choice = 2;
		}
		
//		do {
//	    	do {
//	    		try {
//	    			input = true;
//		            choice = sc.nextInt();
//		        } catch(InputMismatchException e) {
//		        	input = false;
//		        	System.out.println("You must insert a number (1 or 2).");
//		        }   
//	    	} while(input = false);
//	    	if (choice != 1 && choice != 2) {
 //       		System.out.println("Please insert 1 or 2. ");
//			}
//	    } while (choice != 1 && choice != 2);

		return choice;
	}

}



