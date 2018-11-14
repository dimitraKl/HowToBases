package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;

public class Delete {
	
    public static ArrayList<String> deleteObject(ArrayList<String> givenList, int givenInt) {

		 System.out.println("You have chosen to delete the element: " + givenObject + " from the list: " + givenList);

	     givenList.remove(givenInt);

		 ArrayList<String> newList = givenList;

         return newList;
         
         /* Second try for the deletion class were an  array list of string type as well as an integer are being used */
         
	}

}

