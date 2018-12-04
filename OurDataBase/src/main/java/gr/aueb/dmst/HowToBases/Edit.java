package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import java.util.Scanner;

public class Edit {

	public String[] editData(String[] dataByColumn, int givenPosition) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Change element " + dataByColumn[givenPosition] + "to : \n (Insert the new name)");
		String newElement = sc.nextLine();
		dataByColumn[givenPosition] = newElement;
		System.out.println("Changes have been successfully made.");
		return dataByColumn;
		
	}

}
