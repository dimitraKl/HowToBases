package gr.aueb.dmst.HowToBases;

import java.util.Scanner;
import java.util.ArrayList;

public class Table {

	private String tableName;
	private String[] categoriesNames;
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
	
	public ArrayList<Data> getAllData() {
		return allData;
	}

	public void setAllData(ArrayList<Data> allData) {
		this.allData = allData;
	}

	public String getReferencePointName() {
		return referencePointName;
	}

	public void setReferencePointName(String referencePointName) {
		this.referencePointName = referencePointName;
	}

	public Table() {

	}

	public Table(String tableName, String[] categoriesNames) {

		this.tableName = tableName;
		this.categoriesNames = categoriesNames;
		this.referencePointName = this.askForReferencePoint(this.categoriesNames);

		Data d = new Data();
		Data newData = new Data(this.referencePointName,
				d.convertReferencePoint(this.referencePointName, this.categoriesNames),
				d.askForDataByColumn(this.categoriesNames));
		allData.add(newData);

	}

	public String askForName() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How would you like to name this table?");
		return sc.nextLine();
	}

	public String[] askForCategories() {
		Scanner sc = new Scanner(System.in);
		System.out.println("How many categories would you like?");
		int numberOfCategories = sc.nextInt();
		String[] categoriesNames = new String[numberOfCategories];

		categoriesNames[0] = sc.nextLine();
		for (int i = 0; i < categoriesNames.length; i++) {
			System.out.println("Give name of category " + (i+1) + ": ");
			categoriesNames[i] = sc.nextLine();
		}
		return categoriesNames;
	}

	public String askForReferencePoint(String[] categoriesNames) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Choose which category you want to be used as point of reference.");
		String referencePointName;
		boolean found = false;
		do {
			referencePointName = sc.nextLine();
			for(int i = 0; i < categoriesNames.length; i++) {
				if (referencePointName.equals(categoriesNames[i])) {
					found = true;
					break;
				}
			}
			if (found == false) {
				System.out.println("Invalid category name. Please try again.");
			}
		} while(found == false);

		return referencePointName;
	}

	public void chooseDataFunction() {
		int choice = Menu.dataMenu();
		Functions f = new Functions();

		switch (choice) {
		case 1: allData = f.addData(allData, referencePointName, categoriesNames);
	            break;

	    case 2: allData = f.deleteData(allData, chooseData());
	            break;

	    case 3: chooseData().chooseFunction(categoriesNames);
	    		break;

	    case 4: f.toDisplayData(allData);
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
				if (chosenData.equals(d.getDataByColumn()[d.getReferencePoint()])) {
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

	@Override
	public String toString() {
		return this.getTableName();
	}

}


