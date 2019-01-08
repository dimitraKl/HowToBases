package gr.aueb.dmst.HowToBases;

import javax.swing.JOptionPane;

/**
 * Creates and manages Data.
 * @author annas
 */

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
	
	/**
	 * Constructor for class Data.
	 * @param referencePointName the name of reference point of array list Data.
	 * @param referencePoint the reference point of array list Data.
	 * @param dataByColumn the columns of Data.
	 */

	public Data(String referencePointName, int referencePoint, String[] dataByColumn) {
		this.referencePointName = referencePointName;
		this.referencePoint = referencePoint;
		this.dataByColumn = dataByColumn;
	}
	
	/**
	 * Initializes a reference point and compares the name of the reference point
	 * with each of the categories names in order to find and return its index in 
	 * the categoriesNames table.
	 * Once they are equal, the for loop stops.
	 * @param referencePointName the name of reference point of array list Data.
	 * @param categoriesNames a table with the names of the categories of Data.
	 * @return referencePoint the reference point of array list Data.
	 */

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
	
	/**
	 * Asks the user to insert data into each category of table categoriesNames
	 * and returns the new table dataByColumn.
	 * @param categoriesNames a table with the names of the categories of Data.
	 * @return dataByColumn data of each category of the database.
	 */
	
	public String[] askForDataByColumn(String[] categoriesNames) {
		String[] dataByColumn = new String[categoriesNames.length];
		for (int i = 0; i < categoriesNames.length; i++) {
			dataByColumn[i] = JOptionPane.showInputDialog(null, "Give " + categoriesNames[i] + ": ");
			if (dataByColumn[i] == null || (dataByColumn[i] != null && ("".equals(dataByColumn[i])))) {
				    System.exit(0);
			}
		}
		return dataByColumn;
	}
	
	/**
	 * Asks the user to choose to edit or display table dataByColumn by calling class Menu.
	 * @param categoriesNames a table with the names of the categories of Data.
	 */

	public void chooseFunction(String[] categoriesNames) {
		int choice = Menu.dataByColumnMenu();

		switch (choice) {
	    case 1: Functions f = new Functions();
	    		dataByColumn = f.editData(dataByColumn, chooseData(categoriesNames));
	            break;

	    case 2: JOptionPane.showMessageDialog(null,this.dataByColumn[chooseData(categoriesNames)]);
	    		break;
	    }
	}
	
	/**
	 * Displays the existing categories and asks the user which one they 
	 * want to chose.
	 * If the category exists, it returns the index of the category name
	 * from table categoriesNames, if not they are asked to chose again.
	 * @param categoriesNames a table with the names of the categories of Data.
	 * @return returnValue the index of the chosen category name that 
	 * exists in table categoriesNames.
	 */

	public int chooseData(String[] categoriesNames) {
		String message = "Choose a category.\nCurrently existing categories: \n";
		for (int i = 0; i < categoriesNames.length; i++) {
			message += (categoriesNames[i] + "\n");
		} 
		String chosenCategory = JOptionPane.showInputDialog(message);
		if (chosenCategory == null || (chosenCategory != null && ("".equals(chosenCategory)))) {
			    System.exit(0);
		}

		int returnValue = -1;
		do {
			for(int i = 0; i < categoriesNames.length; i++) {
				if (chosenCategory.equals(categoriesNames[i])) {
					returnValue = i;
					break;
				}
			}
			if (returnValue == -1) {
				message = "The chosen category does not exist.\n"
								 + "Please choose again.\nCurrently existing categories: ";
				for (int i = 0; i < categoriesNames.length; i++) {
					message += (categoriesNames[i] + "\n");
				}
				chosenCategory = JOptionPane.showInputDialog(message);
				if (chosenCategory == null || (chosenCategory != null && ("".equals(chosenCategory)))) {
					    System.exit(0);
				}
			}
		} while(returnValue == -1);

		return returnValue;
	}

	@Override
	public String toString() {
		return this.dataByColumn[getReferencePoint()];
	}
	
	/**
	 * Displays elements of dataByColumn.
	 * @return message a string with the elements of dataByColumn.
	 */

	public String toMyString() {
		String message= "";
		for (int i = 0; i < this.getDataByColumn().length; i++) {
			message += (this.getDataByColumn()[i] + " ");
		}
		message += "\n";
		return message;
	}

}
