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

	public Data() {

	}

	public Data(String referencePointName, int referencePoint, String[] dataByColumn) {
		this.referencePointName = referencePointName;
		this.referencePoint = referencePoint;
		this.dataByColumn = dataByColumn;
	}

	public int convertReferencePoint(String referencePointName, String[] categoriesNames) {
		int referencePoint = -1;
		for (int i = 0; i < categoriesNames.length; i++) {
			if (referencePointName.equals(categoriesNames[i])) {
				referencePoint = i;
				break;
			}
		}
		return referencePoint;
	}

	public String[] askForDataByColumn(String[] categoriesNames) {
		String[] dataByColumn = new String[categoriesNames.length];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < categoriesNames.length; i++) {
			System.out.println("Give " + categoriesNames[i] + ": ");
			dataByColumn[i] = sc.nextLine();
		}
		return dataByColumn;
	}

	public void chooseFunction(String[] categoriesNames) {
		int choice = Menu.dataByColumnMenu();

		switch (choice) {
	    case 1: Functions f = new Functions();
	    		dataByColumn = f.editData(dataByColumn, chooseData(categoriesNames));
	            break;

	    case 2: System.out.println(this.dataByColumn[chooseData(categoriesNames)]);
	    		break;
	    }
	}

	public int chooseData(String[] categoriesNames) {
		System.out.println("Choose a category.\nCurrently existing categories: \n");
		for (int i = 0; i < categoriesNames.length; i++) {
			System.out.println(categoriesNames[i]);
		}
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
								 + "Please choose again.\nCurrently existing data: ");
				for (int i = 0; i < categoriesNames.length; i++) {
					System.out.println(categoriesNames[i]);
				}
				chosenCategory = sc.nextLine();
			}
		} while(returnValue == -1);

		return returnValue;
	}

	@Override
	public String toString() {
		return this.dataByColumn[getReferencePoint()];
	}

	public void toMyString() {
		for (int i = 0; i < this.getDataByColumn().length; i++) {
			System.out.print(this.getDataByColumn()[i] + " ");
		}
	}

}
