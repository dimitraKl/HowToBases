package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import org.junit.Test;

public class FunctionsTest {

    @Test
    public void testAddTable() {
    	
        DataBase objDataBase = new DataBase();
        Table dataobj1 = new Table();
        Table dataobj2 = new Table();
        ArrayList<Table> tables = new ArrayList<Table>();
        tables.add(dataobj1);
        tables.add(dataobj2);
        int size1 = tables.size();
        Functions functionsObj = new Functions();
        tables = functionsObj.addTable(tables);
        int size2 = tables.size();
        assert size1 + 1 == size2 : "Error in AddTable" +
                                "The new table was not added succeflully"; 
        
    }

    @Test
    public void testAddData() {
    	
        Data d1 = new Data();
        Data d2 = new Data();
        ArrayList<Data> allData = new ArrayList<Data>();
        allData.add(d1);
        allData.add(d2);
        int size1  = allData.size();
        Functions functionsObj = new Functions();
        String [] categoriesNames = {"name", "surname"};
        allData = functionsObj.addData(allData, "name", categoriesNames);
        int size2 = allData.size();
        assert size1 + 1 == size2 : "Error in AddData" +
        							"Data was not added successfully";
        
    }

    @Test
    public void testDeleteData() {
    	
    	String [] dataByColumn = {"Fani", "Sakellariou"};
    	Data d1 = new Data("name", 0, dataByColumn);
    	ArrayList<Data> allData = new ArrayList<Data>();
    	allData.add(d1);
    	Functions functionsObj = new Functions();
    	int size1 = allData.size();
    	allData = functionsObj.deleteData(allData, d1);
    	int size2 = allData.size();
    	assert size1 - 1 == size2 : "Table was not deleted successfully. " +
    	                            "Make sure you have chosen 'Yes' when asked if you are sure you want to" +
                                    "proceed with the deletion." +
                                    "If so, there is an error in DeleteTable. ";
    	
    }


    @Test
    public void testEditData() {
    	
    	String [] dataByColumn = {"Anna", "Samouri"} ;
    	int pos = 0;
    	String initialValue = dataByColumn[0];
    	Functions functionsObj = new Functions();
    	dataByColumn = functionsObj.editData(dataByColumn, pos);
    	String finalValue = dataByColumn[0];
    	assert !(initialValue.equals(finalValue)) : "No changes made. Make sure you typed something " +
                                                    "else than 'Anna'. If so, there is an error in EditData";
    	
    }
    
}