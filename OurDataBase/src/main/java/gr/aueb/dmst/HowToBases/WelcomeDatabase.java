package gr.aueb.dmst.HowToBases;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class WelcomeDatabase {

	private JFrame frame;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeDatabase window = new WelcomeDatabase();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public WelcomeDatabase() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblWelcomeToYour = new JLabel("Welcome to your Database!");
		lblWelcomeToYour.setBounds(74, 30, 264, 22);
		lblWelcomeToYour.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(lblWelcomeToYour);
		
		JLabel lblHowWouldYou = new JLabel("How would you like to name it?");
		lblHowWouldYou.setBounds(74, 84, 264, 22);
		lblHowWouldYou.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(lblHowWouldYou);
		
		textField = new JTextField();
		textField.setBounds(74, 130, 144, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JButton btnContinue = new JButton("CONTINUE");
		btnContinue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				TablesMenu t = new TablesMenu();
				t.setVisible(true);
			}
		});
		btnContinue.setBounds(74, 178, 106, 23);
		frame.getContentPane().add(btnContinue);
	}
}
