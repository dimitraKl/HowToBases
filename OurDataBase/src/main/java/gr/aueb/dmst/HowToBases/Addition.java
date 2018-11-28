package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import java.util.Scanner;

public class Additon {

	private String [] elements; //Instance variables for each element
	
	public void setElements(String input, int i) {
		elements[i] = input;
	}

	public String getElements(int i) {
		return elements[i];
	}

	public void addElement(String[] categoriesNames) {

		Menu objMenu = new Menu(); //object for class Menu
		ArrayList<Object> data = new ArrayList<Object>(); //Array list data
		data = objMenu.getData(); //for adding the element to the updated array 
		System.out.println("Would you like to add one or more elements in your data base? /n"+
								"Press 1 for one element or 2 for more." );
		Scanner sc = new Scanner(System.in);
		int choice;

		//Make sure choice is 1 or 2.
		do {
			choice = sc.nextInt();
			if (choice != 1 || choice != 2) {
				System.out.println("Please press 1 or 2.");
			}
		} while (choice != 1 || choice != 2);
		String input; //value given to our instance variables

		if (choice == 1) { //if we chose to add 1 element

			Add obj = new Add();
			//objMenu.setCounter(objMenu.getCounter()++);

			for (int i = 0; i < categoriesNames.length; i++) { //as many times as the categories

				System.out.println("Give " + categoriesNames[i] + " for your element.");
				input = sc.nextLine();
				obj.setElements(input,i);

			}
    		
			data.add(obj); //updating our array list

		} else { //if we choose to add more than one elements

			do {

				Add obj = new Add();
				for (int i = 0; i < categoriesNames.length; i++) {

					System.out.println("Give "+categoriesNames[i]+" for your element.");
					input = sc.nextLine();
					obj.setElements(input,i);

				}
				data.add(obj);
				System.out.println("Do you want to add another element? (Yes/No)");

				//Make sure answer is Yes or No.
				do {
					input = sc.nextLine();
					if (!(input.equals("Yes") || input.equals("No"))) {
						System.out.println("Please answer Yes or No.");
					}	
				} while (!(input.equals("Yes") || input.equals("No")));

			} while (input.equals("Yes")); //until user types no

		}//end else

		objMenu.setData(data); //updating the whole array for the other classes

	}

}