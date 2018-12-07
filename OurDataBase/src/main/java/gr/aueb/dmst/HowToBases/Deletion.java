package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Deletion {

	public ArrayList<Data> deleteData(ArrayList<Data> allData, Data givenData) {

		System.out.println("Are you sure you want to delete this element? Please type 'Yes' or 'No'. ");
 
		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();
		 
		boolean flag = true; /* A flag is used so that we can control the while statement */ 

		while (flag) {
			if (choice.equals("Yes") ) {

				Iterator<Data> it = allData.iterator();
				while (it.hasNext()) {
					Data d = it.next();
					if (givenData.getDataByColumn()[givenData.getReferencePoint()].equals
							(d.getDataByColumn()[d.getReferencePoint()])) {
						it.remove();
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
 		
		return allData;
	}

	public ArrayList<Table> deleteTable(ArrayList<Table> dataBase, Table givenTable  ) {

		System.out.println("You have chosen to delete the table " + givenTable.getTableName() 
					+ " Are you sure you want to proceed with the deletion? Please type 'Yes' or 'No'.  ");

		Scanner sc = new Scanner(System.in);
		String choice = sc.nextLine();

		boolean flag = true; /* A flag is used so that we can control the while statement */ 

		while (flag) {
			if (choice.equals("Yes") ) {

				Iterator<Table> it = dataBase.iterator();
				while (it.hasNext()) {
					Table t = it.next();
				 	if (givenTable.getTableName().equals(t.getTableName())) {
				 		it.remove();
				 	}
				}	
				flag  = false;

			} else if (choice.equals("No")) {
				System.out.println("You have chosen not to delete the table: " + givenTable.getTableName() + " ");
		 		flag = false;
		 	} else {
		 		System.out.println("Please type 'Yes' or 'No' to give your choice again. ");
		 		choice = sc.nextLine();
			}
		}

		return dataBase;
	}

}
