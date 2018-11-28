package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import java.util.Scanner;

public class Edit {
	
	public ArrayList<Data> editData(ArrayList<Data> elements, int categories_number, String [] catNames) {
		System.out.println("The element you wish to edit belongs to category: ");
		int i = 0;
		
		do {
			
			System.out.println((i+1) + ": " + catNames[i]); // prints all the categories of the database
			i++;
		} while(i < categories_number);
		
		System.out.println("Please insert the number of the category.");
		Scanner input = new Scanner(System.in);
		int number;
		boolean answer = true;
		do {
			number = input.nextInt();
			if (number < 1 || number > categories_number) {
				answer = false;
				System.out.println("Invalid input. Please try again.");
			}
		}while(answer == false);
		System.out.println("Name of element you wish to change: " );
		String old_element = input.nextLine();
		System.out.println("Change element " + old_element + "to : \n (Insert the new name)");
		String new_element = input.nextLine();
		boolean found = false;
		for(Object el: elements) {
			if(el.getElements(number-1).equals(old_element)) {
				el.setElements(new_element, number);
				found = true;
			}
		}
		if (found == true) {
			System.out.println("Changes have been successfully made.");
		} else {
			System.out.println("The element you are looking for does not exist in this database.");
		}
		return elements;
	}
}
