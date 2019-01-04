package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class ChooseTableFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseTableFrame frame = new ChooseTableFrame();
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
	public ChooseTableFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCurrentlyExistingTables = new JLabel("Currently existing tables:");
		lblCurrentlyExistingTables.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCurrentlyExistingTables.setBounds(10, 68, 151, 39);
		contentPane.add(lblCurrentlyExistingTables);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 21, 226, 146);
		contentPane.add(textField);
		
		JLabel lblChooseATable = new JLabel("Choose a table.");
		lblChooseATable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblChooseATable.setBounds(10, 192, 99, 30);
		contentPane.add(lblChooseATable);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(119, 194, 120, 30);
		contentPane.add(textField_1);
		
		JButton button = new JButton("Continue\r\n");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(277, 192, 120, 30);
		contentPane.add(button);
		
		
	}

}
