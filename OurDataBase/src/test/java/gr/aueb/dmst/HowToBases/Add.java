package gr.aueb.dmst.HowToBases;

public class Add {
	
	private String [] catNames;
	private int catNum;
	private String [] elements;
	
	public void values(String [] catNames, int catNum) {
		
		this.catNames = catNames;
		this.catNum = catNum;
	}
	
	public void set(int i, String el) {
		
		elements[i] = el;
		
	}

}
