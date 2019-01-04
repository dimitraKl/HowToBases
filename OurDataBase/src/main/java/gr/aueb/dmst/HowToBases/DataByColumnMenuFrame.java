package gr.aueb.dmst.HowToBases;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import javax.swing.JButton;

public class DataByColumnMenuFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DataByColumnMenuFrame frame = new DataByColumnMenuFrame();
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
	public DataByColumnMenuFrame() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblFunctionsMenu = new JLabel("FUNCTIONS MENU");
		lblFunctionsMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblFunctionsMenu.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblFunctionsMenu.setBounds(119, 20, 150, 30);
		contentPane.add(lblFunctionsMenu);
		
		JRadioButton rdbtnEditACategory = new JRadioButton("Edit a category of this data element.\r\n");
		rdbtnEditACategory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnEditACategory.setBounds(79, 60, 300, 25);
		contentPane.add(rdbtnEditACategory);
		
		JRadioButton rdbtnDisplayACategory = new JRadioButton("Display a category of this data element.\r\n");
		rdbtnDisplayACategory.setFont(new Font("Tahoma", Font.PLAIN, 14));
		rdbtnDisplayACategory.setBounds(79, 90, 300, 25);
		contentPane.add(rdbtnDisplayACategory);
		
		JButton button = new JButton("CONTINUE");
		button.setFont(new Font("Tahoma", Font.PLAIN, 12));
		button.setBounds(250, 200, 120, 30);
		contentPane.add(button);
	}

}
