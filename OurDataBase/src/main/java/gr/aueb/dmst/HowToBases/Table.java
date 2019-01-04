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
	}

	public String askForName() {
		AskForTableNameFrame ask = new AskForTableNameFrame();
		
		tableName = ask.getName();
		return tableName;
	}

	public String[] askForCategories() {
		
		AskForCategoriesFrame ask = new AskForCategoriesFrame();
	//	ask.setVisible(true);
		int numberOfCategories = ask.getNumber();
		
		String[] categoriesNames = new String[numberOfCategories];
		
		NameOfCategoryFrame name = new NameOfCategoryFrame();
		name.askCategorieNameFrame();
		name.setVisible(true);
		//categoriesNames[0] = sc.nextLine(); 
		categoriesNames[0] = name.getNameOfCat();
		for (int i = 0; i < categoriesNames.length; i++) {
			name.askCategorieNameFrame();
			name.setVisible(true);
			categoriesNames[i] = name.getNameOfCat();
		}
		return categoriesNames;
	}

	public String askForReferencePoint(String[] categoriesNames) {
		AskForReferencePointFrame rp = new AskForReferencePointFrame();
		rp.setVisible(true);
		String referencePointName;
		boolean found = false;
		do {
			referencePointName = rp.getReferencePoint();
			for(int i = 0; i < categoriesNames.length; i++) {
				if (referencePointName.equals(categoriesNames[i])) {
					found = true;
					break;
				}
			}
			if (found == false) {
				InvalidRefPointFrame inv = new InvalidRefPointFrame();
				inv.setVisible(true);
				rp = new AskForReferencePointFrame();
				rp.setVisible(true);
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
						         + allData.toString() + "\n"); // Frame not finished"
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


