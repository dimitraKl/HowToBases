package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class DataDoesNotExistFrame extends JFrame {

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
					DataDoesNotExistFrame frame = new DataDoesNotExistFrame();
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
	public DataDoesNotExistFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("The chosen data element does not exist!");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(78, 11, 259, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(158, 47, 266, 146);
		contentPane.add(textField);
		
		JLabel label = new JLabel("Currently existing data:\r\n");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 99, 150, 39);
		contentPane.add(label);
		
		JLabel lblPleaseChooseAgain = new JLabel("Please choose again.");
		lblPleaseChooseAgain.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseChooseAgain.setBounds(10, 198, 132, 39);
		contentPane.add(lblPleaseChooseAgain);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(158, 204, 120, 30);
		contentPane.add(textField_1);
		
		JButton button = new JButton("Continue\r\n");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(293, 204, 120, 30);
		contentPane.add(button);
		
	}

}
