package gr.aueb.dmst.HowToBases;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Menu {
	
	public static int chooseDataBaseMenu() {
		
		JRadioButton button1 = new JRadioButton("Create a new Data Base.");
		JRadioButton button2 = new JRadioButton("Open a Data Base which is saved in your computer.");
		
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		JOptionPane.showMessageDialog(null,panel,"What would you like to do?",JOptionPane.PLAIN_MESSAGE );
		int choice = 0;
		if (button1.isSelected()) {
			choice = 1;
		}else if (button2.isSelected()) {
			choice = 2;
		}else { 
			System.exit(1);
		}
		return choice;
	}


	public static int tablesMenu() {
			
		JRadioButton button1 = new JRadioButton("Create a new table in your data base. \n");
		JRadioButton button2 = new JRadioButton("Delete a table from your data base. \n");
		JRadioButton button3 = new JRadioButton("Edit a table of your data base. \n");
		JRadioButton button4 = new JRadioButton("Display all the tables of your data base. \n\n");
		
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		JOptionPane.showMessageDialog(null, panel, "TABLES MENU",JOptionPane.PLAIN_MESSAGE);
		
		
		int choice = 0;
		if (button1.isSelected()) {
			choice = 1;
		} else if(button2.isSelected()) {
			choice = 2;
		} else if(button3.isSelected()) {
			choice = 3;
		} else if(button4.isSelected()) {
			choice = 4;
		} else {
			System.exit(0);
		}
		
	    return choice;

	}

	public static int dataMenu() {
	    
	    JRadioButton button1 = new JRadioButton("Add an element to this table. \n");
		JRadioButton button2 = new JRadioButton("Delete an element from this table. \n");
		JRadioButton button3 = new JRadioButton("Edit an element in this table. \n");
		JRadioButton button4 = new JRadioButton("Display the elements of this table. \n\n");
		
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		JOptionPane.showMessageDialog(null,panel,"FUNCTIONS MENU", JOptionPane.PLAIN_MESSAGE);
		
		int choice = 0;
		if (button1.isSelected()) {
			choice = 1;
		} else if(button2.isSelected()) {
			choice = 2;
		} else if(button3.isSelected()) {
			choice = 3;
		} else if (button4.isSelected()){
			choice = 4;
		} else {
			System.exit(0);
		} 
		
	    return choice;

	}

	public static int dataByColumnMenu() {

		JRadioButton button1 = new JRadioButton("Edit a category of this data element. \n");
		JRadioButton button2 = new JRadioButton("Display a category of this data element. \n\n");
		
		JPanel panel = new JPanel();
		panel.add(button1);
		panel.add(button2);
		JOptionPane.showMessageDialog(null,panel,"FUCTIONS MENU",JOptionPane.PLAIN_MESSAGE);
		
		int choice = 0;
		
		if (button1.isSelected()) {
			choice = 1;
		} else if (button2.isSelected()) {
			choice = 2;
		} else {
			System.exit(0);
		}
		
		return choice;
	}

}



