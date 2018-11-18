package gr.aueb.dmst.HowToBases;
import java.util.Scanner;
import java.util.ArrayList;

public class Menu {

	private ArrayList<Object> data; //make both of them instance vars so that we can change them
	//private int counter; we don't know yet if we will need a counter

	public void setData(ArrayList<Object> data) { //keep our arraylist up to date any class needed
		this.data = data;
	}

	public ArrayList<Object> getData(){ //get an up to date arraylist from any class needed
		return data;
	}

	//we don't know if we will need a counter for objs in arraylist

	//public void setCounter(int counter){
		//this.counter = counter;
	//}

	//public int getCounter() {
		//return counter;
	//}

	public void menu(String [] categoriesNames) { //take catNames as a parameter so that it can be
		                                   //tranfered to other methods and classes 
		
	    System.out.println("Press 1 to add an element to your data base. /n"
	    		         + "Press 2 to delete an element from your data base. /n"
	    		         + "Press 3 to edit an element in your data base.");
	    Scanner sc = new Scanner(System.in);
	    int choice;
	    
	    //Make sure choice is 1, 2 or 3.
	    do {
	        choice = sc.nextInt();
	        if (choice < 1 || choice > 3 ) {
	        	System.out.println("Please insert 1,2 or 3.");
	        }
	    }
	    while (choice < 1 || choice > 3);
	    
	    //make objs for each class so that they can be called
	    Add objAdd = new Add();
	    Delete objDelete = new Delete();
	    Edit objEdit = new Edit();
	    
	    switch (choice) {
   
	    case 1: objAdd.addElement(categoriesNames);
	            break;
       
	    case 2: objDelete.deleteElement();
	            break;

	    case 3: objEdit.editElement();
	            break;
	            
	    }//end switch
	    
	}//end menu method
	
}//end menu class
