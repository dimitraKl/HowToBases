package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import java.util.Scanner;

public class Deletion {

	public ArrayList<Object> deleteData(ArrayList<Object> data, Object givenObject) {

		System.out.println("Are you sure you want to delete this element? Please type 'Yes' or 'No'. ");
 
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		 
		boolean flag = true; /* A flag is used so that we can control the while statement */ 

		while (flag) {
			if (choice.equals("Yes") ) {
				for (int i=0; i < data.size(); i++) {
					if (givenObject == data.get(i) ) {
						data.remove(i);
				    }
				}
			 	flag = false;
		 	} else if (choice.equals("No")) {
		 		System.out.println("You have chosen not to delete this element. ");
		 		flag = false;
		 	} else {
		    	System.out.println("Please type 'Yes' or 'No' to continue, give your choice again. ");
		    	choice = sc.nextLine();
		 	}
		}
 		
		return data;
	}

	public ArrayList<Table> deleteTable(ArrayList<Table> dataBase, Table givenTable  ) {

		System.out.println("You have chosen to delete the table " + givenTable.getTableName() 
					+ "Are you sure you want to proceed with the deletion? Please type 'Yes' or 'No'.  ");

		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();

		boolean flag = true; /* A flag is used so that we can control the while statement */ 

		while (flag) {
			if (choice.equals("Yes") ) {

				for (int i=0; i < dataBase.size(); i++) {
				 	if (givenTable == dataBase.get(i)) {
				 		dataBase.remove(i);
				 	}
				}	
				flag  = false;
			} else if (choice.equals("No")) {
				System.out.println("You have chosen not to delete the table: " + givenTable.getTableName() );
		 		flag = false;
		 	} else {
		 		System.out.println("Please type 'Yes' or 'No' to give your choice again. ");
		 		choice = sc.nextLine();
			}
		}

		return dataBase;
	}

}
