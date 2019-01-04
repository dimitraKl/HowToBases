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

public class TableDoesNotExistFrame extends JFrame {

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
					TableDoesNotExistFrame frame = new TableDoesNotExistFrame();
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
	public TableDoesNotExistFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTheChosenTable = new JLabel("The chosen table does not exist!");
		lblTheChosenTable.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTheChosenTable.setBounds(109, 11, 207, 30);
		contentPane.add(lblTheChosenTable);
		
		JLabel lblCurrentlyExistingTables = new JLabel("Currently existing tables:\r\n");
		lblCurrentlyExistingTables.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCurrentlyExistingTables.setBounds(10, 93, 159, 39);
		contentPane.add(lblCurrentlyExistingTables);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 41, 226, 146);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Please choose again.");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 204, 125, 30);
		contentPane.add(label);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 206, 120, 30);
		contentPane.add(textField_1);
		
		JButton button = new JButton("Continue\r\n");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(277, 204, 120, 30);
		contentPane.add(button);
	}

}
