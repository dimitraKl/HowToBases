package gr.aueb.dmst.HowToBases;

import java.io.File;
import javax.swing.JOptionPane;

/**
 * Runs the database program.
 * @author annas
 *
 */

public class MainDataBase {
	
	/**
	 * Calls class Menu to chose if the user wants to create a new database or edit an existing
	 * database using CSV file.
	 * Creates the database and its CSV file.
	 * @param args
	 */

	public static void main(String[] args) {
		int choice = Menu.chooseDataBaseMenu();
		DataBase myDataBase;
		CSVFile myFile = new CSVFile();

		if (choice == 1) {
			myDataBase = new DataBase(new DataBase().askForDBName());
			JOptionPane.showMessageDialog(null, "It's time to create your first table!");
			myDataBase.setTables(new Functions().addTable(myDataBase.getTables()));
		} else {
			String filename;
			do {
				filename = JOptionPane.showInputDialog("Please give file name. For example: MyFile.csv");
			} while(!(new File(filename).exists()));
			myDataBase = myFile.readFromFile(filename);
		}
		myFile = new CSVFile(myDataBase.getDataBaseName() + ".csv");

		for (;;) {
			myDataBase.chooseTablesFunction();
			myFile.deleteCSVFile();
			myFile.writeToFile(myDataBase);
		}
	}

}
