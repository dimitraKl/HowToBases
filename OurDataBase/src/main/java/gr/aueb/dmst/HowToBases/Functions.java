package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import java.util.Iterator;
//import java.util.Scanner;

import javax.swing.JOptionPane;

public class Functions {

	public ArrayList<Table> addTable(ArrayList<Table> tables) {
		Table t = new Table();
		Table newTable = new Table(t.askForName(), t.askForCategories());
		tables.add(newTable);
		newTable.setAllData(new Functions().addData(newTable.getAllData(),
				newTable.getReferencePointName(),
				newTable.getCategoriesNames()));
		return tables;
	}

	public ArrayList<Data> addData(ArrayList<Data> allData, String referencePointName, String[] categoriesNames) {
		Data d = new Data();
		Data newData = new Data(referencePointName,
				d.convertReferencePoint(referencePointName, categoriesNames),
				d.askForDataByColumn(categoriesNames));
		allData.add(newData);
		return allData;
	}

	public ArrayList<Data> deleteData(ArrayList<Data> allData, Data givenData) {

		String choice = JOptionPane.showInputDialog("Are you sure you want to delete this element? Please type 'Yes' or 'No'. ");
 
		 
		boolean flag = true; /* A flag is used so that we can control the while statement */ 

		while (flag) {
			if (choice.equals("Yes") ) {

				Iterator<Data> it = allData.iterator();
				while (it.hasNext()) {
					Data d = it.next();
					if (givenData.getDataByColumn()[givenData.getReferencePoint()].equals
							(d.getDataByColumn()[d.getReferencePoint()])) {
						it.remove();
					}
				}
			 	flag = false;

		 	} else if (choice.equals("No")) {
		 		JOptionPane.showMessageDialog(null,"You have chosen not to delete this element. ");
		 		flag = false;
		 	} else {
		    	JOptionPane.showInputDialog("Please type 'Yes' or 'No' to continue, give your choice again. ");
		 	}
		}
 		
		return allData;
	}

	public ArrayList<Table> deleteTable(ArrayList<Table> dataBase, Table givenTable ) {

		String choice = JOptionPane.showInputDialog("You have chosen to delete the table " + givenTable.getTableName() 
					+ " Are you sure you want to proceed with the deletion? Please type 'Yes' or 'No'. ");


		boolean flag = true; /* A flag is used so that we can control the while statement */ 

		while (flag) {
			if (choice.equals("Yes") ) {

				Iterator<Table> it = dataBase.iterator();
				while (it.hasNext()) {
					Table t = it.next();
				 	if (givenTable.getTableName().equals(t.getTableName())) {
				 		it.remove();
				 	}
				}	
				flag  = false;

			} else if (choice.equals("No")) {
				JOptionPane.showMessageDialog(null,"You have chosen not to delete the table: " + givenTable.getTableName() + " ");
		 		flag = false;
		 	} else {
		 		choice = JOptionPane.showInputDialog("Please type 'Yes' or 'No' to give your choice again. ");
			}
		}

		return dataBase;
	}
	
	public String[] editData(String[] dataByColumn, int givenPosition) {
		
		String newElement = JOptionPane.showInputDialog("Change element " + dataByColumn[givenPosition] + " to : \n (Insert the new name)");
		
		dataByColumn[givenPosition] = newElement;
		JOptionPane.showMessageDialog(null,"Changes have been successfully made.");
		return dataByColumn;	
	}
	
	public void toDisplayTable(ArrayList<Table> a) {
		for (Table i:a) {
			JOptionPane.showMessageDialog(null, i.toString());
		}
	}

	public void toDisplayData(ArrayList<Data> a) {
		for (Data i:a) {
			JOptionPane.showMessageDialog(null,i.toMyString());
		}
	}

}

