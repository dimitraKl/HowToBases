package gr.aueb.dmst.HowToBases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TablesMenuFrame {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablesMenuFrame window = new TablesMenuFrame();
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
	public TablesMenuFrame() {
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
		final int choosen = 0;
		JLabel lblNewLabel = new JLabel("TABLES MENU");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setBounds(119, 11, 110, 31);
		frame.getContentPane().add(lblNewLabel);
		
		JRadioButton addButton = new JRadioButton("Αdd an element to this table.");
		addButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//opening new frame ask for name
			}
		});
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addButton.setBounds(79, 60, 300, 25);
		frame.getContentPane().add(addButton);
		
		JRadioButton deleteButton = new JRadioButton("Delete a table from your data base.");
		deleteButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		deleteButton.setBounds(79, 90, 300, 25);
		frame.getContentPane().add(deleteButton);
		
		JRadioButton editButton = new JRadioButton("Edit a table of your data base.");
		editButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		editButton.setBounds(79, 120, 300, 25);
		frame.getContentPane().add(editButton);
		
		JRadioButton displayButton = new JRadioButton("Display all the tables of your data base.");
		displayButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		displayButton.setBounds(79, 150, 300, 25);
		frame.getContentPane().add(displayButton);
	}
}
