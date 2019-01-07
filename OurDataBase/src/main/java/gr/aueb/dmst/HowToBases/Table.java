package gr.aueb.dmst.HowToBases;

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Table {

	private String tableName;
	private String[] categoriesNames;
    private String referencePointName;
    private ArrayList<Data> allData = new ArrayList<Data>();

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

	public String getReferencePointName() {
		return referencePointName;
	}

	public void setReferencePointName(String referencePointName) {
		this.referencePointName = referencePointName;
	}

	public ArrayList<Data> getAllData() {
		return allData;
	}

	public void setAllData(ArrayList<Data> allData) {
		this.allData = new ArrayList<Data>(allData);
	}

	public Table() {

	}

	public Table(String tableName, String[] categoriesNames) {
		this.tableName = tableName;
		this.categoriesNames = categoriesNames;
		this.referencePointName = this.askForReferencePoint(this.categoriesNames);
	}

	public Table(String tableName, String[] categoriesNames, String referencePointName, ArrayList<Data> allData) {
		this.tableName = tableName;
		this.categoriesNames = categoriesNames;
		this.referencePointName = referencePointName;
		this.allData = new ArrayList<Data>(allData);
	}

	public String askForName() {
		
		tableName = JOptionPane.showInputDialog(null, "How would you like to name this table?");
		
		if (tableName == null || (tableName != null && ("".equals(tableName)))) {
			    System.exit(0);
		}
		
		return tableName;
	}

	public String[] askForCategories() {
		
		String catNumber = JOptionPane.showInputDialog(null,"How many categories would you like?");
		
		if (catNumber == null || (catNumber != null && ("".equals(catNumber)))) {
			    System.exit(0);
		}
		
		int numberOfCategories = Integer.parseInt(catNumber);
		
		String[] categoriesNames = new String[numberOfCategories];
		
		String nameOfCategory = JOptionPane.showInputDialog(null, "Give name of category 1 :");
		 
		if (nameOfCategory == null || (nameOfCategory != null && ("".equals(nameOfCategory)))) {
			    System.exit(0);
		}
		 
		categoriesNames[0] = nameOfCategory;
		
		for (int i = 1; i < categoriesNames.length; i++) {
			categoriesNames[i] = JOptionPane.showInputDialog(null, "Give name of category " + (i+1) + " : ");
			
			if (categoriesNames[i] == null || (categoriesNames[i] != null && ("".equals(categoriesNames[i])))) {
			    System.exit(0);
			}
		 
		}
		return categoriesNames;
	}

	public String askForReferencePoint(String[] categoriesNames) {

		String referencePointName = JOptionPane.showInputDialog(null, "Choose which category you want to be used \n as point of reference.");
		
		if (referencePointName == null || (referencePointName != null && ("".equals(referencePointName)))) {
		    System.exit(0);
		}
		
		boolean found = false;
		do {
			
			for(int i = 0; i < categoriesNames.length; i++) {
				if (referencePointName.equals(categoriesNames[i])) {
					found = true;
					break;
				}
			}
			if (found == false) {
				JOptionPane.showMessageDialog(null,"Invalid category name. Please try again." ,null, JOptionPane.ERROR_MESSAGE);
				referencePointName = JOptionPane.showInputDialog(null, "Choose which category you want to be used \n as point of reference.");
				
				if (referencePointName == null || (referencePointName != null && ("".equals(referencePointName)))) {
				    System.exit(0);
				}
				
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
		String chosenData = JOptionPane.showInputDialog("Choose an element of data.\n"
													   + "Currently existing data: \n"
													   + allData.toString() + "\n");
		
		if (chosenData == null || (chosenData != null && ("".equals(chosenData)))) {
		    System.exit(0);
		}
		
		Data returnValue = null;
		do {
			for(Data d : allData) {
				if (chosenData.equals(d.getDataByColumn()[d.getReferencePoint()])) {
					returnValue = d;
					break;
				}
			}
			if (returnValue == null) {
				chosenData = JOptionPane.showInputDialog("The chosen data element does not exist.\n"
														+ "Please choose again.\n"
														+ "Currently existing data: \n"
														+ allData.toString() + "\n"); //jFrame not finished
			}
			
			if (chosenData == null || (chosenData != null && ("".equals(chosenData)))) {
			    System.exit(0);
			}
			
		} while(returnValue == null);

		return returnValue;
	}

	@Override
	public String toString() {
		return this.getTableName();
	}

}


