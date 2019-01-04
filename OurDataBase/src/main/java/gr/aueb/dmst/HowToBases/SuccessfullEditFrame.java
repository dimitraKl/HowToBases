package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;

public class SuccessfullEditFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SuccessfullEditFrame frame = new SuccessfullEditFrame();
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
	public SuccessfullEditFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblChangesHaveBeen = new JLabel("Changes have been successfully made!");
		lblChangesHaveBeen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblChangesHaveBeen.setBounds(86, 95, 251, 30);
		contentPane.add(lblChangesHaveBeen);
		
		JButton btnNewButton = new JButton("Continue\r\n");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnNewButton.setBounds(272, 185, 120, 30);
		contentPane.add(btnNewButton);
		
	}

}
