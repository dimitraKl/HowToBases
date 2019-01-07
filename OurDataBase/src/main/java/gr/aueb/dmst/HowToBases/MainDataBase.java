package gr.aueb.dmst.HowToBases;

import javax.swing.JOptionPane;

public class MainDataBase {


	public static void main(String[] args) {
		
		int choice = Menu.chooseDataBaseMenu();

		DataBase myDataBase;
		CSVFile myFile;
		if (choice == 1) {
			myDataBase = new DataBase(new DataBase().askForDBName());
			JOptionPane.showMessageDialog(null, "It's time to create your first table!");
			myDataBase.setTables(new Functions().addTable(myDataBase.getTables()));
		} else {
			
			String file = JOptionPane.showInputDialog("Please give file name. For example: MyFile.csv");
			myFile = new CSVFile();
			myDataBase = myFile.readFromFile(file);
		}
		myFile = new CSVFile(myDataBase.getDataBaseName() + ".csv");

		for (;;) {
			myDataBase.chooseTablesFunction();
			myFile.deleteCSVFile();
			myFile.writeToFile(myDataBase);
		}
	}

}
