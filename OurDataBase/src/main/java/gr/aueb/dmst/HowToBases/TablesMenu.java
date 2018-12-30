package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class TablesMenu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TablesMenu frame = new TablesMenu();
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
	public TablesMenu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMenu = new JLabel("-- Menu --");
		lblMenu.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblMenu.setBounds(163, 35, 110, 44);
		contentPane.add(lblMenu);
		
		JRadioButton rdbtnCreateATable = new JRadioButton("Create a table in your database");
		rdbtnCreateATable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnCreateATable.setBounds(97, 86, 242, 23);
		contentPane.add(rdbtnCreateATable);
		
		JRadioButton rdbtnDeleteATable = new JRadioButton("Delete a table from your database");
		rdbtnDeleteATable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnDeleteATable.setBounds(97, 112, 242, 23);
		contentPane.add(rdbtnDeleteATable);
		
		JRadioButton rdbtnEditATable = new JRadioButton("Edit a table of your database");
		rdbtnEditATable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnEditATable.setBounds(97, 138, 242, 23);
		contentPane.add(rdbtnEditATable);
		
		JRadioButton rdbtnDisplayAllThe = new JRadioButton("Display all the tables of your database");
		rdbtnDisplayAllThe.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnDisplayAllThe.setBounds(97, 164, 313, 23);
		contentPane.add(rdbtnDisplayAllThe);
		
		JButton btnContinue = new JButton("CONTINUE");
		btnContinue.setBounds(163, 206, 110, 23);
		contentPane.add(btnContinue);
	}
}
