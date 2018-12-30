package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;

public class AskForNameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskForNameFrame frame = new AskForNameFrame();
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
	public AskForNameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel welcomeLabel = new JLabel("Welcome to your data base.\r\n");
		welcomeLabel.setHorizontalAlignment(SwingConstants.CENTER);
		welcomeLabel.setVerticalAlignment(SwingConstants.TOP);
		welcomeLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 16));
		welcomeLabel.setBounds(0, 26, 434, 30);
		contentPane.add(welcomeLabel);
		
		textField = new JTextField();
		textField.setBounds(236, 78, 176, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		textField.getText();
		//we can send back the name of the database by giving it as a parameter to askForName method 
		//DataBase nameOfDataBase = new DataBase();
		//nameOfDataBase.askForName(textField); 
		
		JLabel lblNewLabel = new JLabel("How would you like to name it?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(0, 76, 238, 20);
		contentPane.add(lblNewLabel);
	}
}
