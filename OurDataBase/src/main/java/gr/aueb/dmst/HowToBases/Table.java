package gr.aueb.dmst.HowToBases;

import java.util.Scanner;
//import java.util.ArrayList;

public class Table {

	private String tableName;
	private static int NUMBER_OF_CATEGORIES;
	private String[] categoriesNames = new String[NUMBER_OF_CATEGORIES];

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

		//Fill table categoriesNames with elements
		categoriesNames[0] = sc.nextLine();
		for (int i = 0; i < categoriesNames.length; i++) {
			System.out.println("Give name of category " + (i+1) + ":");
			categoriesNames[i] = sc.nextLine();
		}


	}

	

}
