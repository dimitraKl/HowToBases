package gr.aueb.dmst.HowToBases;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

public class CSVFile {

	private File myFile;
	private static final String DELIMITER = ";";
	public static final String LINE_SEPARATOR = "\n";
	String[] categoriesNames;
	private ArrayList<Table> tables = new ArrayList<Table>();
	private ArrayList<Data> allData = new ArrayList<Data>();

	public CSVFile() {

	}

	public CSVFile(String filename) {
		this.myFile = new File(filename);
	}

	public void writeToFile(DataBase myDataBase) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter(myFile));
			bw.write(myDataBase.getDataBaseName());
			bw.write(LINE_SEPARATOR);
			bw.write(" " + LINE_SEPARATOR);
			for (Table t : myDataBase.getTables()) {
				bw.write(t.getTableName() + DELIMITER + " " + DELIMITER
						+ "Reference Point:" + DELIMITER + t.getReferencePointName());
				bw.write(LINE_SEPARATOR);
				writeCategories(bw, t.getCategoriesNames());
				for (Data d : t.getAllData()) {
					writeData(bw, d.getDataByColumn());
				}
				bw.write(" " + LINE_SEPARATOR);
			}
			bw.close();
		} catch (IOException e) {
			System.err.println("Something occured while creating CSV file. " +e.getMessage());
		}
	}

	public void writeCategories(BufferedWriter bw, String[] categoriesNames) throws IOException {
		for (int i = 0; i < categoriesNames.length; i++) {
			bw.write(categoriesNames[i]);
			if (i < categoriesNames.length - 1) {
				bw.write(DELIMITER);
			} else {
				bw.write(LINE_SEPARATOR);
			}
		}
	}

	public void writeData(BufferedWriter bw, String[] dataByColumn) throws IOException {
		for (int i = 0; i < dataByColumn.length; i++) {
			bw.write(dataByColumn[i]);
			if (i < dataByColumn.length - 1) {
				bw.write(DELIMITER);
			} else {
				bw.write(LINE_SEPARATOR);
			}
		}
	}

	public void deleteCSVFile() {
		myFile.delete();
	}

	public DataBase readFromFile(String filename){
		String dataBaseName = "";
		int numberOfLine = 0;
		try{
			BufferedReader br = new BufferedReader(new FileReader(filename));
		    String line;
		    while ((line = br.readLine()) != null) {
				numberOfLine++;
				if(numberOfLine == 1) {
					dataBaseName = line;
				} else if (line.equals(" ")) {
					br = readTable(br);
					if (br.readLine() != null) {
						br.reset();
					}
				}
			}
			br.close();
		} catch (IOException e) {
			System.err.println("Something occured while reading from CSV file.");
			return null;
		}
		return new DataBase(dataBaseName, tables);
	}

	public BufferedReader readTable(BufferedReader br) throws IOException {
		String tableName = "";
		String referencePointName = "";
		int numberOfLine = 0;
		String line;
		while ((line = br.readLine()) != null && !(line.equals(" "))) {
			numberOfLine++;
			if(numberOfLine == 1) {
				String[] s = line.split(DELIMITER);
				tableName = s[0];
				referencePointName = s[3];
			} else if (numberOfLine == 2) {
		       	categoriesNames = line.split(DELIMITER);
			} else {
				br = readData(br, referencePointName);
				br.reset();
			}
			br.mark(0);
		}
		tables.add(new Table(tableName, categoriesNames, referencePointName, allData));
		allData.clear();
		return br;
    }

	public BufferedReader readData(BufferedReader br, String referencePointName) throws IOException {
		String[] dataByColumn;
		String line;
		br.reset();
		while ((line = br.readLine()) != null && !(line.equals(" "))) {
			dataByColumn = line.split(DELIMITER);
			allData.add(new Data(referencePointName,
								new Data().convertReferencePoint(referencePointName, categoriesNames),
								dataByColumn));
			br.mark(0);
		}
		return br;
	}

}

