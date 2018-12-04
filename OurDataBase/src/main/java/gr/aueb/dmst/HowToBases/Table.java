package gr.aueb.dmst.HowToBases;

import java.util.Scanner;
import java.util.ArrayList;

public class Table {

	private String tableName;
	private static int NUMBER_OF_CATEGORIES;
	private String[] categoriesNames = new String[NUMBER_OF_CATEGORIES];
    private ArrayList<Data> allData = new ArrayList<Data>();
    private String referencePointName;
    
	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String[] getCategoriesNames() {
		return categoriesNames;
	}

	public void setCategoriesNames(String[] categoriesNames) {
		this.categoriesNames = categoriesNames;
	}

	public Table() {

		System.out.println("How would you like to name this table?");
		Scanner sc = new Scanner(System.in);
		tableName = sc.nextLine();
		System.out.println("How many categories would you like?");
		NUMBER_OF_CATEGORIES = sc.nextInt();

		categoriesNames[0] = sc.nextLine();
		for (int i = 0; i < categoriesNames.length; i++) {
			System.out.println("Give name of category " + (i+1) + ": ");
			categoriesNames[i] = sc.nextLine();
			System.out.println("\n");
		}
		
		System.out.println("Choose which category you want to be used as point of reference.");
		referencePointName = sc.nextLine();
		//make sure category exists
		
		Data newData = new Data(categoriesNames, referencePointName);
		allData.add(newData);

	}

	public void chooseDataFunction() {
			
		int choice = Menu.dataMenu();
		
		//make objects for each class so that they can be called
	    //Addition objAdd = new Addition();
		Deletion objDelete = new Deletion();
		Edit objEdit = new Edit();
		    
		switch (choice) {
	   
		case 1: //allData = objAdd.addData(allData);
				Data newData = new Data(categoriesNames, referencePointName);
				allData.add(newData);
	            break;

	    case 2: allData = objDelete.deleteData(allData, chooseData());
	            break;

	    case 3: chooseData().chooseFunction(categoriesNames);
	    		break;

	    case 4: Display.toDisplayData(allData);
	    		break;

	    }

	}

	public Data chooseData() {
		
		System.out.println("Choose an element of data.\nCurrently existing data: \n" 
				+ allData.toString() + "\n");
		Scanner sc = new Scanner(System.in);
		String chosenData = sc.nextLine();
		Data returnValue = null;
		do {
			for(Data d : allData) {
				if (chosenData.equals(d.getReferencePointName())) {
					returnValue = d;
					break;
				}
			}
			if (returnValue == null) {
				System.out.println("The chosen data element does not exist.\n"
								 + "Please choose again.\nCurrently existing data: \n"
						         + allData.toString() + "\n");
				chosenData = sc.nextLine();
			}
		} while(returnValue == null);
		
		return returnValue;

	}

	@Override public String toString() {
		return this.getTableName();
	}

}

