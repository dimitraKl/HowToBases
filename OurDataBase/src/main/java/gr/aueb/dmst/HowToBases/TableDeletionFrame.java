package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class TableDeletionFrame extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TableDeletionFrame frame = new TableDeletionFrame();
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
	public TableDeletionFrame() {
	
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel referncePointLabel = new JLabel("You have chosen to delete the table:");
		referncePointLabel.setHorizontalAlignment(SwingConstants.LEFT);
		referncePointLabel.setBounds(103, 46, 234, 30);
		referncePointLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(referncePointLabel);
		
		textField = new JTextField();
		textField.setBounds(160, 94, 120, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblAreYouSure = new JLabel("Are you sure you want to delete this table?  If yes press continue.\r\n");
		lblAreYouSure.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblAreYouSure.setBounds(22, 150, 435, 30);
		contentPane.add(lblAreYouSure);
		
		JButton btnContinue = new JButton("Continue");
		btnContinue.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnContinue.setBounds(282,203,120,30);
		contentPane.add(btnContinue);
		
	}
}
