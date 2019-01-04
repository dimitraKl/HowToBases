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

public class ChooseCategoryFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField_1;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ChooseCategoryFrame frame = new ChooseCategoryFrame();
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
	public ChooseCategoryFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblCurrentlyExistingCategories = new JLabel("Currently existing categories:\r\n");
		lblCurrentlyExistingCategories.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblCurrentlyExistingCategories.setBounds(10, 68, 178, 39);
		contentPane.add(lblCurrentlyExistingCategories);
		
		JLabel lblChooseACategory = new JLabel("Choose a category.");
		lblChooseACategory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblChooseACategory.setBounds(10, 186, 125, 39);
		contentPane.add(lblChooseACategory);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(137, 192, 120, 30);
		contentPane.add(textField_1);
		
		JButton button = new JButton("Continue\r\n");
		button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		button.setBounds(286, 203, 120, 30);
		contentPane.add(button);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(198, 23, 226, 146);
		contentPane.add(textField);
	}

}
