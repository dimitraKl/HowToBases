package gr.aueb.dmst.HowToBases;

public class MainDataBase {

	public static void main(String[] args) {
		DataBase myDataBase = new DataBase(new DataBase().askForName());
		myDataBase.setTables(new Functions().addTable(myDataBase.getTables()));
		for (;;) {
			myDataBase.chooseTablesFunction();
		}
	}

}
