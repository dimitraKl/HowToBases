package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class AskForTableNameFrame extends JFrame {

	
	private JPanel contentPane;
	private JTextField tableName;
	private String name;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskForTableNameFrame ask = new AskForTableNameFrame();
					ask.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public String getName() {
		return name;
	}
	public AskForTableNameFrame() {
		name = tableNameFrame();
	}
	/**
	 * Create the frame.
	 */
	public String tableNameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel askForNameLabel = new JLabel("How would you like to name this table?");
		askForNameLabel.setHorizontalAlignment(SwingConstants.LEFT);
		askForNameLabel.setBounds(25, 40, 300, 30);
		askForNameLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(askForNameLabel);
		
		tableName = new JTextField();
		tableName.setBounds(25, 100, 200, 30);
		contentPane.add(tableName);
		tableName.setColumns(10);
		
		
		JButton continueButton = new JButton("CONTINUE");
		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		continueButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		continueButton.setBounds(250, 100, 120, 30);
		getContentPane().add(continueButton);
		
		return tableName.getText();
	}

}
