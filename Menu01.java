import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.SwingConstants;
import javax.swing.event.AncestorListener;
import javax.swing.text.Caret;
import javax.swing.event.AncestorEvent;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Menu01 {

	JFrame frame;
	JTextField tabel_01;
	public Caret textField1;
	public static String tableU;
	public static String sizeU;
	public static int sizeN;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu01 window = new Menu01();
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
	public Menu01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 0, 128));
		frame.setForeground(new Color(0, 0, 255));
		frame.getContentPane().setBackground(new Color(238, 232, 170));
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Size");
		lblNewLabel_1.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel_1.setBounds(394, 37, 151, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel table_1 = new JLabel("\u0E42\u0E15\u0E4A\u0E30\u0E17\u0E35\u0E48 :");
		table_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		table_1.setBounds(71, 76, 55, 32);
		frame.getContentPane().add(table_1);
		
		tabel_01 = new JTextField();
		tabel_01.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tabel_01.setBounds(136, 79, 114, 30);
		frame.getContentPane().add(tabel_01);
		tabel_01.setColumns(10);
		
		JCheckBox chckbx01 = new JCheckBox("\u0E16\u0E49\u0E27\u0E22\u0E40\u0E25\u0E47\u0E01 ");
		buttonGroup.add(chckbx01);
		chckbx01.setFont(new Font("Tahoma", Font.PLAIN, 18));
		chckbx01.setBounds(90, 236, 84, 21);
		frame.getContentPane().add(chckbx01);
		
		JCheckBox checkBox02 = new JCheckBox("\u0E16\u0E49\u0E27\u0E22\u0E1B\u0E32\u0E19\u0E01\u0E25\u0E32\u0E07");
		buttonGroup.add(checkBox02);
		checkBox02.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox02.setBounds(268, 236, 127, 21);
		frame.getContentPane().add(checkBox02);
		
		JCheckBox checkBox03 = new JCheckBox("\u0E16\u0E49\u0E27\u0E22\u0E43\u0E2B\u0E0D\u0E48");
		buttonGroup.add(checkBox03);
		checkBox03.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox03.setBounds(494, 236, 91, 21);
		frame.getContentPane().add(checkBox03);
		
		JLabel label_2 = new JLabel("\u0E02\u0E19\u0E32\u0E14\u0E17\u0E35\u0E48\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23 :");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(71, 165, 160, 32);
		frame.getContentPane().add(label_2);
		
		JButton btnNewButton = new JButton("\u0E22\u0E49\u0E2D\u0E19\u0E01\u0E25\u0E31\u0E1A");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hello01 window = new hello01();
				window.frame.setVisible(true);
			}
		});
		btnNewButton.setForeground(new Color(255, 255, 255));
		btnNewButton.setBackground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton.setBounds(165, 376, 103, 32);
		frame.getContentPane().add(btnNewButton);
		
		JButton button = new JButton("\u0E15\u0E48\u0E2D\u0E44\u0E1B");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu02 window = new Menu02();
				window.frame.setVisible(true);
				tableU = (tabel_01.getText());
				if (chckbx01.isSelected()) {
					sizeU = chckbx01.getText();
					sizeN = 15;
				}
				if (checkBox02.isSelected()) {
					sizeU = checkBox02.getText();
					sizeN = 30;
				}
				if (checkBox03.isSelected()) {
					sizeU = checkBox03.getText();
					sizeN = 45;
				}
			}
		});
		button.setForeground(new Color(255, 255, 255));
		button.setBackground(new Color(50, 205, 50));
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBounds(292, 376, 103, 32);
		frame.getContentPane().add(button);
		
		JLabel label_3 = new JLabel("15.-");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_3.setBounds(180, 230, 33, 32);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("30.-");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_4.setBounds(405, 230, 33, 32);
		frame.getContentPane().add(label_4);
		
		JLabel label_5 = new JLabel("45.-");
		label_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		label_5.setBounds(591, 230, 33, 32);
		frame.getContentPane().add(label_5);
		frame.setBackground(SystemColor.activeCaption);
		frame.setBounds(100, 100, 860, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
