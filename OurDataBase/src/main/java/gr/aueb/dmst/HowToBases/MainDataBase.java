package gr.aueb.dmst.HowToBases;

import javax.swing.JOptionPane;

public class MainDataBase {

	public static int chooseDataBase() {
		Scanner sc = new Scanner(System.in);
		System.out.println("What would you like to do?\n"
						 + "1. Create a new Data Base.\n"
						 + "2. Open a Data Base which is saved in your computer.");
		return sc.nextInt();
	}

	public static void main(String[] args) {
		int choice = chooseDataBase();

		DataBase myDataBase;
		CSVFile myFile;
		if (choice == 1) {
			myDataBase = new DataBase(new DataBase().askForDBName());
			JOptionPane.showMessageDialog(null, "It's time to create your first table!");
			myDataBase.setTables(new Functions().addTable(myDataBase.getTables()));
		} else {
			System.out.println("Please give file name. For example: MyFile.csv");
			Scanner sc = new Scanner(System.in);
			String file = sc.nextLine();
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
