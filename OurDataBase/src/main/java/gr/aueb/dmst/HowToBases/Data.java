package gr.aueb.dmst.HowToBases;

public class Data {
	private String[] dataByColumn;
    
	public String[] getDataByColumn() {
		return dataByColumn;
	}

	public void setDataByColumn(String[] dataByColumn) {
		this.dataByColumn = dataByColumn;
	}

	public Data(String[] dataByColumn) {
		for (int i = 0; i < dataByColumn.length; i++) {
			this.dataByColumn[i] = dataByColumn[i];
			
		}
			
	}
	
  public void toMyString() {
		for (int i = 0; i < this.getDataByColumn().length; i++) {
			System.out.print(this.getDataByColumn()[i] + " ");
		
		}
		
		
	}
}
