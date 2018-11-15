package gr.aueb.dmst.HowToBases;
import java.util.ArrayList;
import java.util.Scanner;

public class Edit {
	
	public String editElement(ArrayList<String> elements, int columns, String [] catNames) {
		System.out.println("The element you wish to edit belongs to category: ");
		int i = 1, j=0;
		do {
			System.out.println(i + ": " + catNames[j]); // prints all the categories of the database
			i++;
			j++;
		}while(j<columns);
		System.out.println("Please insert the number of the category.");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println("Name of element you wish to change: " );
		String old_element = input.nextLine();
		System.out.println("Change element " + old_element + "to : \n (Insert the new name)");
		String new_element = input.nextLine();
		int rows = elements.size()/columns; //calculating how many rows the database has
		int k = number;
		boolean found = false;
		do {
			if (elements.get(k).equals(old_element)) {
				elements.set(k, new_element);
				found = true;
			} else {
				k = k + number;
			}
		}while(k<rows && found == false);
		if (found == true) {
			return new_element;
		} else {
			return "The element you are looking for does not exist in this database.";
		}
	}
}
