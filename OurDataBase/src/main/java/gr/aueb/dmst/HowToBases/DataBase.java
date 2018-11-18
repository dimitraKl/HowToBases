package gr.aueb.dmst.HowToBases;

import java.util.ArrayList;
import java.util.Scanner;

public class DataBase {
public static void main(String [] args) {
		
		System.out.println("Welcome to your data base. How would you like to name it?");
		Scanner sc = new Scanner(System.in);
		String dbName = sc.nextLine();
		System.out.println("How many categories would you like?");
		int catNum = sc.nextInt();
		String [] catNames = new String[catNum];
		catNames[0] = sc.nextLine();
		for (int i = 0; i < catNum; i++) {
			
			System.out.println("Give name of category "+ (i+1) +":");
			catNames[i] = sc.nextLine();
		}
		
		
		Add obj0 = new Add();
		obj0.values(catNames, catNum);
		System.out.println("Now you can create your data base. Please insert your data." );
		ArrayList <Object> data = new ArrayList <Object>();
		int i = 0;
		//δυο επαναληψεις η μια μεσα στην αλλη
		do {
			ArrayList<String> obj1 = new ArrayList<String>();
			Add obj2 = new Add();
			System.out.println("Add your number " +(i+1)+ " element for category "+catNames[i]);
			String el = sc.nextLine();
			obj1.add(i,el);
			obj2.set(i, el);
			i++;
			
			
			
		} while (i<=10);
	
		
	}
}
