package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;

public class Delete {
	
    public static ArrayList<String> deleteObject(ArrayList<String> givenList, Object givenObject) {

		 System.out.println("You have chosen to delete the element: " + givenObject + " from the list: " + givenList);

	     givenList.remove(givenObject);

		 ArrayList<String> newList = givenList;

         return newList ;
         
         /* First try for the deletion class were an  array list of string type as well as an object are being used */
         /* No use of Maven till we sort it out team!!! */
         
	}

}

