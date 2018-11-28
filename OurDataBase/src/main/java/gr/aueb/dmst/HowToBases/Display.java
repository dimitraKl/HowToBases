package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;

public class Display {
	
  public static void toDisplayAll (ArrayList<Table> a) {
		for (Table i:a) {
			System.out.println(i.toString());
			
		}
  }   
}
