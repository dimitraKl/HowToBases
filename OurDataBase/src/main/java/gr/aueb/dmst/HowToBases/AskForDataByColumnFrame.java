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

public class AskForDataByColumnFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskForDataByColumnFrame frame = new AskForDataByColumnFrame();
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
	public AskForDataByColumnFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblInsertDataFor = new JLabel("Insert data for column");
		lblInsertDataFor.setBounds(10, 133, 148, 30);
		lblInsertDataFor.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblInsertDataFor);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(155, 135, 28, 30);
		contentPane.add(textField);
		
		JLabel lblCategoryName = new JLabel("Category name:");
		lblCategoryName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCategoryName.setBounds(20, 18, 110, 30);
		contentPane.add(lblCategoryName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(152, 20, 120, 30);
		contentPane.add(textField_1);
		
		JLabel lblNumberOfColumns = new JLabel("Number of columns:");
		lblNumberOfColumns.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNumberOfColumns.setBounds(10, 70, 148, 30);
		contentPane.add(lblNumberOfColumns);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(152, 70, 120, 30);
		contentPane.add(textField_2);
		
		JLabel lblHere = new JLabel("here:");
		lblHere.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHere.setBounds(193, 133, 39, 30);
		contentPane.add(lblHere);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(236, 133, 120, 30);
		contentPane.add(textField_3);
		
		JButton button = new JButton("Continue\r\n");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(276, 196, 120, 30);
		contentPane.add(button);
		
		
		
	}

}
