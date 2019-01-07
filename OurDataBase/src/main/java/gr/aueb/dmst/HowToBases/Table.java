package gr.aueb.dmst.HowToBases;

// import java.util.Scanner;

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
		this.allData = allData;
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
		this.allData = allData;
	}

	public String askForName() {
	//	AskForTableNameFrame ask = new AskForTableNameFrame();
	//	ask.setVisible(true);
	//	tableName = ask.getName();
		
		tableName = JOptionPane.showInputDialog(null, "How would you like to name this table?");
		
		if (2 == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "You pressed cancel");
		} else if (tableName == null || (tableName != null && ("".equals(tableName)))) {
			    System.exit(0);
		}
		
		return tableName;
	}

	public String[] askForCategories() {
		
	//	AskForCategoriesFrame ask = new AskForCategoriesFrame();
	//	ask.setVisible(true);
		String catNumber = JOptionPane.showInputDialog(null,"How many categories would you like?");
		
		if (2 == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "You pressed cancel");
		} else if (catNumber == null || (catNumber != null && ("".equals(catNumber)))) {
			    System.exit(0);
		}
		
		int numberOfCategories = Integer.parseInt(catNumber);
		
		String[] categoriesNames = new String[numberOfCategories];
		
	//	NameOfCategoryFrame name = new NameOfCategoryFrame(1);
		//categoriesNames[0] = sc.nextLine(); 
		 String nameOfCategorie = JOptionPane.showInputDialog(null, "Give name of category 1 :");
		 
		 if (2 == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "You pressed cancel");
		} else if (nameOfCategorie == null || (nameOfCategorie != null && ("".equals(nameOfCategorie)))) {
			    System.exit(0);
		}
		 
		categoriesNames[0] = nameOfCategorie;
		
		for (int i = 0; i < categoriesNames.length; i++) {
		//	name.askCategorieNameFrame(i+1);
		//	name.setVisible(true);
			categoriesNames[i] = JOptionPane.showInputDialog(null, "Give name of category " + (i+1) + " : ");
			
			if (2 == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "You pressed cancel");
			} else if (categoriesNames[i] == null || (categoriesNames[i] != null && ("".equals(categoriesNames[i])))) {
			    System.exit(0);
			}
		 
		}
		return categoriesNames;
	}

	public String askForReferencePoint(String[] categoriesNames) {
	//	AskForReferencePointFrame rp = new AskForReferencePointFrame();
	//	rp.setVisible(true);
		String referencePointName = JOptionPane.showInputDialog(null, "Choose which category you want to be used \n as point of reference.");
		
		if (2 == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "You pressed cancel");
		} else if (referencePointName == null || (referencePointName != null && ("".equals(referencePointName)))) {
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
			//	InvalidRefPointFrame inv = new InvalidRefPointFrame();
			//	inv.setVisible(true);
			//	rp = new AskForReferencePointFrame();
			//	rp.setVisible(true);
				JOptionPane.showMessageDialog(null,"Invalid category name. Please try again." ,null, JOptionPane.ERROR_MESSAGE);
				referencePointName = JOptionPane.showInputDialog(null, "Choose which category you want to be used \n as point of reference.");
				
				if (2 == JOptionPane.CANCEL_OPTION) {
					JOptionPane.showMessageDialog(null, "You pressed cancel");
				} else if (referencePointName == null || (referencePointName != null && ("".equals(referencePointName)))) {
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
		
		if (2 == JOptionPane.CANCEL_OPTION) {
			JOptionPane.showMessageDialog(null, "You pressed cancel");
		} else if (chosenData == null || (chosenData != null && ("".equals(chosenData)))) {
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
			
			if (2 == JOptionPane.CANCEL_OPTION) {
				JOptionPane.showMessageDialog(null, "You pressed cancel");
			} else if (chosenData == null || (chosenData != null && ("".equals(chosenData)))) {
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


