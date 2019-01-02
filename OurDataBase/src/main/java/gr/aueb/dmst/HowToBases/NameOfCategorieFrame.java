package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class NameOfCategorieFrame extends JFrame {

	private JPanel contentPane;
	private JTextField nameOfCatField;
	private String nameOfCat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NameOfCategorieFrame frame = new NameOfCategorieFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public String getNameOfCat() {
		return nameOfCat;
	}

	/**
	 * Create the frame.
	 */
	public NameOfCategorieFrame() { 
	}
	public void askCategorieNameFrame() { // could show num of cat if it is received as parameter
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel askForCategoriesLabel = new JLabel("Give name of categorie :");
		askForCategoriesLabel.setBounds(10, 50, 180, 30);
		askForCategoriesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		askForCategoriesLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(askForCategoriesLabel);
		
		nameOfCatField = new JTextField();
		nameOfCatField.setBounds(199, 50, 200, 30);
		contentPane.add(nameOfCatField);
		nameOfCatField.setColumns(10);
		nameOfCat = nameOfCatField.getText();
		
		JButton continueButton = new JButton("CONTINUE");
		continueButton.setBounds(250, 100, 120, 30);
		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		continueButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		getContentPane().add(continueButton);
		
		
	}

}
