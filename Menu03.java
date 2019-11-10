import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Menu03 {

	JFrame frame;
	public static String fruitU;
	public static int sunU;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu03 window = new Menu03();
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
	public Menu03() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(175, 238, 238));
		frame.setBounds(100, 100, 860, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblMenu = new JLabel("Fruit");
		lblMenu.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblMenu.setBounds(360, 40, 175, 41);
		frame.getContentPane().add(lblMenu);
		
		JLabel label = new JLabel("\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E1C\u0E25\u0E44\u0E21\u0E49 (+5.-) :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(74, 95, 160, 32);
		frame.getContentPane().add(label);
		
		JCheckBox checkBox_00 = new JCheckBox("\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E01\u0E25\u0E49\u0E27\u0E22");
		buttonGroup.add(checkBox_00);
		checkBox_00.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_00.setBounds(111, 151, 160, 21);
		frame.getContentPane().add(checkBox_00);
		
		JCheckBox checkBox_01 = new JCheckBox("\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E2A\u0E49\u0E21");
		buttonGroup.add(checkBox_01);
		checkBox_01.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_01.setBounds(346, 154, 160, 21);
		frame.getContentPane().add(checkBox_01);
		
		JCheckBox checkBox_02 = new JCheckBox("\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E2A\u0E15\u0E23\u0E2D\u0E27\u0E4C\u0E40\u0E1A\u0E2D\u0E23\u0E35\u0E48");
		buttonGroup.add(checkBox_02);
		checkBox_02.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_02.setBounds(561, 154, 160, 21);
		frame.getContentPane().add(checkBox_02);
		
		JCheckBox checkBox_03 = new JCheckBox("\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E41\u0E2D\u0E1B\u0E40\u0E1B\u0E34\u0E49\u0E25");
		buttonGroup.add(checkBox_03);
		checkBox_03.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_03.setBounds(111, 222, 160, 21);
		frame.getContentPane().add(checkBox_03);
		
		JCheckBox checkBox_04 = new JCheckBox("\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E21\u0E30\u0E21\u0E48\u0E27\u0E07");
		buttonGroup.add(checkBox_04);
		checkBox_04.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_04.setBounds(346, 222, 160, 21);
		frame.getContentPane().add(checkBox_04);
		
		JCheckBox checkBox_05 = new JCheckBox("\u0E40\u0E1E\u0E34\u0E48\u0E21\u0E21\u0E30\u0E1E\u0E23\u0E49\u0E32\u0E27");
		buttonGroup.add(checkBox_05);
		checkBox_05.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_05.setBounds(561, 222, 160, 21);
		frame.getContentPane().add(checkBox_05);
		
		JCheckBox checkBox = new JCheckBox("\u0E44\u0E21\u0E48\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23");
		checkBox.setForeground(Color.RED);
		checkBox.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox.setBounds(111, 289, 160, 21);
		frame.getContentPane().add(checkBox);
		
		
		
		JButton button = new JButton("\u0E22\u0E49\u0E2D\u0E19\u0E01\u0E25\u0E31\u0E1A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu02 window = new Menu02();
				window.frame.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.RED);
		button.setBounds(178, 381, 103, 32);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0E15\u0E48\u0E2D\u0E44\u0E1B");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thanks window = new Thanks();
				window.frame.setVisible(true);
				if (checkBox_00.isSelected()) {
					fruitU = checkBox_00.getText();
					sunU = 5+Menu01.sizeN;
				}

				if (checkBox_01.isSelected()) {
					fruitU = checkBox_01.getText();
					sunU = 5+Menu01.sizeN;
				}
				if (checkBox_02.isSelected()) {
					fruitU = checkBox_02.getText();
					sunU = 5+Menu01.sizeN;
				}
				if (checkBox_03.isSelected()) {
					fruitU = checkBox_03.getText();
					sunU = 5+Menu01.sizeN;
				}
				if (checkBox_04.isSelected()) {
					fruitU = checkBox_04.getText();
					sunU = 5+Menu01.sizeN;
				}
				if (checkBox_05.isSelected()) {
					fruitU = checkBox_05.getText();
					sunU = 5+Menu01.sizeN;
				}
				if (checkBox.isSelected()) {
					fruitU = " ";
					sunU = Menu01.sizeN;
				}
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBackground(new Color(50, 205, 50));
		button_1.setBounds(309, 381, 103, 32);
		frame.getContentPane().add(button_1);
		

	}
}
