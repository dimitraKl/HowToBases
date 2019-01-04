package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.SwingConstants;

public class TablesMenuFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablesMenuFrame frame = new TablesMenuFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * Create the frame.
	 */
	public TablesMenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel tablesMenuLabel = new JLabel("TABLES MENU");
		tablesMenuLabel.setHorizontalAlignment(SwingConstants.CENTER);
		tablesMenuLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		tablesMenuLabel.setBounds(119, 20, 150, 30);
		getContentPane().add(tablesMenuLabel);

		JRadioButton addButton = new JRadioButton("Create a new table in your data base.");
		addButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		addButton.setBounds(79, 60, 300, 25);
		getContentPane().add(addButton);

		JRadioButton deleteButton = new JRadioButton("Delete a table from your data base.");
		deleteButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		deleteButton.setBounds(79, 90, 300, 25);
		getContentPane().add(deleteButton);

		JRadioButton editButton = new JRadioButton("Edit a table of your data base.");
		editButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		editButton.setBounds(79, 120, 300, 25);
		getContentPane().add(editButton);
		
		JRadioButton displayButton = new JRadioButton("Display all the tables of your data base.");
		displayButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		displayButton.setBounds(79, 150, 300, 25);
		getContentPane().add(displayButton);
		
		JButton continueButton = new JButton("CONTINUE");
		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		continueButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		continueButton.setBounds(250, 200, 120, 30);
		getContentPane().add(continueButton);
		
	}
}
