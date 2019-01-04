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

public class CategoryDoesNotExistFrame extends JFrame {

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
					CategoryDoesNotExistFrame frame = new CategoryDoesNotExistFrame();
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
	public CategoryDoesNotExistFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTheChosenCategorie = new JLabel("The chosen category does not exist!");
		lblTheChosenCategorie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTheChosenCategorie.setBounds(88, 11, 232, 30);
		contentPane.add(lblTheChosenCategorie);
		
		JLabel label = new JLabel("Currently existing categories:\r\n");
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		label.setBounds(10, 92, 178, 39);
		contentPane.add(label);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(198, 42, 226, 146);
		contentPane.add(textField);
		
		JLabel lblPleaseChooseAgain = new JLabel("Please choose again.");
		lblPleaseChooseAgain.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblPleaseChooseAgain.setBounds(10, 208, 125, 30);
		contentPane.add(lblPleaseChooseAgain);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(145, 208, 120, 30);
		contentPane.add(textField_1);
		
		JButton button = new JButton("Continue\r\n");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(284, 208, 120, 30);
		contentPane.add(button);
		
		
	}

}
