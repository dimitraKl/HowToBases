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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AskForCategoriesFrame extends JFrame {

	private JPanel contentPane;
	private JTextField numOfCatField;
	private int number;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskForCategoriesFrame frame = new AskForCategoriesFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public int getNumber() {
		return number;
	}
	/**
	 * Create the frame.
	 */
	public AskForCategoriesFrame() {
		number = numCategoriesFrame();
	}
	public int numCategoriesFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel askForCategoriesLabel = new JLabel("How many categories would you like?");
		askForCategoriesLabel.setHorizontalAlignment(SwingConstants.LEFT);
		askForCategoriesLabel.setBounds(25, 40, 300, 30);
		askForCategoriesLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(askForCategoriesLabel);
		
		numOfCatField = new JTextField();
		numOfCatField.setBounds(25, 100, 200, 30);
		contentPane.add(numOfCatField);
		numOfCatField.setColumns(10);
	
		number = Integer.parseInt(numOfCatField.getText());
		
		JButton continueButton = new JButton("CONTINUE");
		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		continueButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		continueButton.setBounds(250, 100, 120, 30);
		getContentPane().add(continueButton);
		
		return number;
	}
}
