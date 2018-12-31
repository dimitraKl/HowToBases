package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;

public class AskForTableNameFrame extends JFrame {

	private JPanel contentPane;
	private JTextField tableName;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AskForTableNameFrame frame = new AskForTableNameFrame();
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
	public AskForTableNameFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTheNameTha = new JLabel("The name that you have chosen for your table is:");
		lblTheNameTha.setBounds(58, 0, 321, 142);
		lblTheNameTha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPane.add(lblTheNameTha);
		
		tableName = new JTextField();
		tableName.setBounds(86, 121, 253, 68);
		contentPane.add(tableName);
		tableName.setColumns(10);
	}

}
