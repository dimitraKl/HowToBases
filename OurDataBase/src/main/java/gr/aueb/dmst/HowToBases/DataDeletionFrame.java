package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class DataDeletionFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataDeletionFrame frame = new DataDeletionFrame();
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
	public DataDeletionFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblYouHaveChosen = new JLabel("You have chosen to delete the element:");
		lblYouHaveChosen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblYouHaveChosen.setBounds(85, 46, 283, 30);
		contentPane.add(lblYouHaveChosen);
		
		textField = new JTextField();
		textField.setBounds(152, 101, 120, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAreYouSure = new JLabel("Are you sure you want to delete this element?  If yes press continue.");
		lblAreYouSure.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAreYouSure.setBounds(10, 154, 435, 30);
		contentPane.add(lblAreYouSure);
		
		JButton btnNewButton = new JButton("Continue");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(281, 206, 120, 30);
		contentPane.add(btnNewButton);
			
	}
	
}
