package gr.aueb.dmst.HowToBases;

import java.util.Scanner;

public class Data {

	private String referencePointName;
	private int referencePoint;
	private String[] dataByColumn;
    
	public String getReferencePointName() {
		return referencePointName;
	}

	public void setReferencePointName(String referencePointName) {
		this.referencePointName = referencePointName;
	}

	public int getReferencePoint() {
		return referencePoint;
	}

	public void setReferencePoint(int referencePoint) {
		this.referencePoint = referencePoint;
	}

	public String[] getDataByColumn() {
		return dataByColumn;
	}

	public void setDataByColumn(String[] dataByColumn) {
		this.dataByColumn = dataByColumn;
	}

	public Data(String[] categoriesNames, String referencePointName) {

		this.referencePointName = referencePointName;
		for (int i = 0; i < categoriesNames.length; i++) {
			if (referencePointName.equals(categoriesNames[i])) {
				referencePoint = i;
			}
		}

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < categoriesNames.length; i++) {
			System.out.println("Give " + categoriesNames[i] + ": ");
			dataByColumn[i] = sc.nextLine();
			System.out.println("\n");
		}
			
	}
	
	public void chooseFunction(String[] categoriesNames) {

		int choice = Menu.dataByColumnMenu();

		Edit objEdit = new Edit();

		switch (choice) {

	    case 1: dataByColumn = objEdit.editData(dataByColumn, chooseData(categoriesNames));
	            break;
	            
	    case 2: System.out.println(this.dataByColumn[chooseData(categoriesNames)]);
	    		break;

	    }

	}
	
	public int chooseData(String[] categoriesNames) {
		
		System.out.println("Choose a category.\nCurrently existing categories: \n" 
				+ categoriesNames.toString() + "\n");
		Scanner sc = new Scanner(System.in);
		String chosenCategory = sc.nextLine();
		int returnValue = -1;
		do {
			for(int i = 0; i < categoriesNames.length; i++) {
				if (chosenCategory.equals(categoriesNames[i])) {
					returnValue = i;
					break;
				}
			}
			if (returnValue == -1) {
				System.out.println("The chosen data element does not exist.\n"
								 + "Please choose again.\nCurrently existing data: \n"
						         + categoriesNames.toString() + "\n");
				chosenCategory = sc.nextLine();
			}
		} while(returnValue == -1);
		
		return returnValue;

	}
	
	public void toMyString() {
		for (int i = 0; i < this.getDataByColumn().length; i++) {
			System.out.print(this.getDataByColumn()[i] + " ");

		}

	}

}
