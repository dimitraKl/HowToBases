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
import javax.swing.SwingConstants;

public class WelcomeDatabaseFrame { //implements Runnable {

	private JFrame frame;
	private JTextField nameTextField;
	private String name;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WelcomeDatabaseFrame window = new WelcomeDatabaseFrame();
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
	public WelcomeDatabaseFrame() {
		name = initialize();
	}
	public String getName() {
		return name;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	public String initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 260);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome to your Database!");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setBounds(95, 25, 260, 30);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		frame.getContentPane().add(welcomeLabel);
		
		JLabel askForNameLabel = new JLabel("How would you like to name it?");
		askForNameLabel.setBounds(30, 100, 200, 30);
		askForNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		frame.getContentPane().add(askForNameLabel);
		
		nameTextField = new JTextField();
		nameTextField.setBounds(230, 100, 150, 30);
		frame.getContentPane().add(nameTextField);
		nameTextField.setColumns(10);
		name = nameTextField.getText();
		
		JButton continueButton = new JButton("CONTINUE");
		continueButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		continueButton.setBounds(250, 175, 120, 30);
		frame.getContentPane().add(continueButton);
	
		return name;
	}
}
