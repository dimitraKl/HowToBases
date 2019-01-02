package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AskForReferencePointFrame extends JFrame {

	private JPanel contentPane;
	private JTextField referencePointField;
	private String referencePoint;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskForReferencePointFrame frame = new AskForReferencePointFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public String getReferencePoint() {
		return referencePoint;
	}
	/**
	 * Create the frame.
	 */
	public AskForReferencePointFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 425, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel referncePointLabel = new JLabel("Choose which category you want to be used");
		referncePointLabel.setHorizontalAlignment(SwingConstants.LEFT);
		referncePointLabel.setBounds(25, 30, 300, 30);
		referncePointLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(referncePointLabel);
		
		JLabel referncePointLabel2 = new JLabel(" as point of reference.");
		referncePointLabel2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		referncePointLabel2.setBounds(25, 60, 300, 30);
		contentPane.add(referncePointLabel2);
		
		referencePointField = new JTextField();
		referencePointField.setBounds(25, 100, 200, 30);
		contentPane.add(referencePointField);
		referencePointField.setColumns(10);
		
		JButton continueButton = new JButton("CONTINUE");
		continueButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		continueButton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		continueButton.setBounds(250, 100, 120, 30);
		getContentPane().add(continueButton);
	}

}
