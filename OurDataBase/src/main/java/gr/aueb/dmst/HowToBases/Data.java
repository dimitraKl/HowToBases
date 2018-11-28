package gr.aueb.dmst.HowToBases;

import java.util.Scanner;

public class Data {

	private int primaryKey;
	private String[] dataByColumn;
    
	public int getPrimaryKey() {
		return primaryKey;
	}

	public void setPrimaryKey(int primaryKey) {
		this.primaryKey = primaryKey;
	}

	public String[] getDataByColumn() {
		return dataByColumn;
	}

	public void setDataByColumn(String[] dataByColumn) {
		this.dataByColumn = dataByColumn;
	}

	public Data(String[] categoriesNames, String primaryKeyName) {

		for (int i = 0; i < categoriesNames.length; i++) {
			if (primaryKeyName.equals(categoriesNames[i])) {
				primaryKey = i;
			}
		}

		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < categoriesNames.length; i++) {
			System.out.println("Give " + categoriesNames[i] + ": ");
			dataByColumn[i] = sc.nextLine();
			System.out.println("\n");
		}
			
	}
	
	public void chooseFunction() {

		int choice = Menu.dataByColumnMenu();

		Edit objEdit = new Edit();

		switch (choice) {

	    case 1: dataByColumn = objEdit.editData(dataByColumn, NUMBER_OF_CATEGORIES);
	            break;
	            
	    case 2: Display.toDisplayAll(dataByColumn);

	    }

	}
	
	public void toMyString() {
		for (int i = 0; i < this.getDataByColumn().length; i++) {
			System.out.print(this.getDataByColumn()[i] + " ");

		}

	}

}
