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

public class DataEditionFrame extends JFrame {

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
					DataEditionFrame frame = new DataEditionFrame();
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
	public DataEditionFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("You have chosen to change the name of the element:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(44, 28, 349, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(143, 69, 120, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblInsertNewName = new JLabel("Insert new name:");
		lblInsertNewName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblInsertNewName.setBounds(153, 110, 120, 30);
		contentPane.add(lblInsertNewName);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(143, 151, 120, 30);
		contentPane.add(textField_1);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnContinue.setBounds(279, 198, 120, 30);
		contentPane.add(btnContinue);
		
		
	}

}
