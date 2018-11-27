package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import java.util.Scanner;
 class Delete {
	

    public ArrayList<Object> deleteElement(ArrayList<Object> givenList, int givenInt) {

		 System.out.println("You have chosen to delete the element: " + givenInt + " from your database. Are you sure you want to delete it? Please type 'Yes' or 'No'. ");
		 				 	//maybe instead of just an int you could print the name of the element//
		 
		 Scanner sc = new Scanner(System.in);
		 String choice = sc.nextLine();
		 
		 boolean flag = true; /* A flag is used so that we can control the while statement */ 

		 while (flag) {
			 if (choice.equals("Yes") ) {
			 		givenList.remove(givenInt);
			 		flag = false;
		 		} else if (choice.equals("No")) {
		 			System.out.println("You have chosen not to delete the element " + givenInt + " from your database. ");
		 			flag = false;
		 		} else {
		    	 System.out.println("Please type 'Yes' or 'No' to continue, give your choice again. ");
		    	 choice = sc.nextLine();
		        }
		 }
		 		
		return givenList;
	}
   
    public ArrayList<Object> deleteTable(ArrayList<Object> givenList) {
	
    	 System.out.println("You have chosen to delete this table. Are you sure you want to proceed with the deletion? Please type 'Yes' or 'No'.  ");
    	 
    	 Scanner sc = new Scanner(System.in);
		 String choice = sc.nextLine();
		 
		 boolean flag = true; /* A flag is used so that we can control the while statement */ 
	
		 while (flag) {
			 if (choice.equals("Yes") ) {
				 	givenList.clear();
				 	flag  = false;
			 	} else if (choice.equals("No")) {
			 		System.out.println("You have chosen not to proceed with the deletion: " + givenList);
		 			flag = false;
		 		} else {
		    	 System.out.println("Please type 'Yes' or 'No' to give your choice again. ");
		    	 choice = sc.nextLine();
			 	}
		 }
		 
    	return givenList;
    }

    
}

