package gr.aueb.dmst.HowToBases;

import javax.swing.JOptionPane;

public class MainDataBase {

	public static void main(String[] args) {
		
		DataBase myDataBase = new DataBase(new DataBase().askForDBName());
		JOptionPane.showMessageDialog(null, "It's time to create your first table!");
		myDataBase.setTables(new Functions().addTable(myDataBase.getTables()));
		for (;;) {
			myDataBase.chooseTablesFunction();
		}
	}

}
