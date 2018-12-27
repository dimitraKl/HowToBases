package gr.aueb.dmst.HowToBases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;

public class DesignerTest {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DesignerTest window = new DesignerTest();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public DesignerTest() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 420, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TABLES MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(119, 11, 110, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Αdd an element to this table.");
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton.setBounds(79, 60, 300, 25);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Delete a table from your data base.");
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_1.setBounds(79, 90, 300, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Edit a table of your data base.");
		rdbtnNewRadioButton_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_2.setBounds(79, 120, 300, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_2);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("Display all the tables of your data base.");
		rdbtnNewRadioButton_3.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnNewRadioButton_3.setBounds(79, 150, 300, 25);
		frame.getContentPane().add(rdbtnNewRadioButton_3);
	}
}
