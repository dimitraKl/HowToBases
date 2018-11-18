package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import java.util.Scanner;

public class Delete {
	
    public ArrayList<Object> deleteElement(ArrayList<Object> givenList, int givenInt) {

		 System.out.println("You have chosen to delete the element: " + givenInt + " from the list: " + givenList + "Are you sure you want to delete it? PLease type 'Yes' or 'No'. ");
		 
		 Scanner sc = new Scanner(System.in);
		 String choice = sc.nextLine();
		 
		 boolean flag = true; /* A flag is used so that we can control the while statement */ 

		 while (flag) {
			 if (choice.equals("Yes") ) {
			 		givenList.remove(givenInt);
			 		flag = false;
		 		} else if (choice.equals("No")){
		 			System.out.println("You have chosen not to delete the " + givenInt + " element from your list. ");
		 			flag = false;
		 		} else {
		    	 System.out.println("Please type 'Yes' or 'No' to continue, give your choice again. ");
		    	 choice = sc.nextLine();
		        }
		 }
		 		
		return givenList;
	}
    
    public ArrayList<Object> deleteList(ArrayList<Object> givenList) {
    	
    	 System.out.println("You have chosen to delete the list " + givenList + "Are you sure you want to delete it? PLease type 'Yes' or 'No'.  ");
    	 
    	 Scanner sc = new Scanner(System.in);
		 String choice = sc.nextLine();
		 
		 boolean flag = true; /* A flag is used so that we can control the while statement */ 
	
		 while (flag) {
			 if (choice.equals("Yes") ) {
				 	givenList.clear();
				 	flag  = false;
			 	} else if (choice.equals("No")) {
			 		System.out.println("You have chosen not to delete the list: " + givenList);
		 			flag = false;
		 		} else {
		    	 System.out.println("Please type 'Yes' or 'No' to give your choice again. ");
		    	 choice = sc.nextLine();
			 	}
		 }
		 
    	return givenList;
    }

    
}

