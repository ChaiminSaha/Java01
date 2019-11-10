import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.text.Caret;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JCheckBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;

public class Menu02{

	JFrame frame;
	JFrame textField;
	public static String snuffU;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu02 window = new Menu02();
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
	public Menu02() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(211, 211, 211));
		frame.setBounds(100, 100, 860, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Menu");
		lblNewLabel.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblNewLabel.setBounds(366, 40, 175, 41);
		frame.getContentPane().add(lblNewLabel);
		
		JCheckBox checkBox_0 = new JCheckBox("\u0E23\u0E2A\u0E21\u0E30\u0E1E\u0E23\u0E49\u0E32\u0E27");
		buttonGroup.add(checkBox_0);
		checkBox_0.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_0.setBounds(83, 123, 160, 21);
		frame.getContentPane().add(checkBox_0);
		
		JCheckBox checkBox_1 = new JCheckBox("\u0E23\u0E2A\u0E21\u0E30\u0E19\u0E32\u0E27");
		buttonGroup.add(checkBox_1);
		checkBox_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_1.setBounds(291, 123, 160, 21);
		frame.getContentPane().add(checkBox_1);
		
		JCheckBox checkBox_2 = new JCheckBox("\u0E23\u0E2A\u0E41\u0E21\u0E07\u0E42\u0E01");
		buttonGroup.add(checkBox_2);
		checkBox_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_2.setBounds(510, 123, 160, 21);
		frame.getContentPane().add(checkBox_2);
		
		JCheckBox checkBox_3 = new JCheckBox("\u0E23\u0E2A\u0E01\u0E25\u0E49\u0E27\u0E22");
		buttonGroup.add(checkBox_3);
		checkBox_3.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_3.setBounds(83, 180, 160, 21);
		frame.getContentPane().add(checkBox_3);
		
		JCheckBox checkBox_4 = new JCheckBox("\u0E23\u0E2A\u0E23\u0E32\u0E2A\u0E1B\u0E4C\u0E40\u0E1A\u0E2D\u0E23\u0E35\u0E48");
		buttonGroup.add(checkBox_4);
		checkBox_4.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_4.setBounds(291, 183, 160, 21);
		frame.getContentPane().add(checkBox_4);
		
		JCheckBox checkBox_5 = new JCheckBox("\u0E23\u0E2A\u0E2A\u0E15\u0E23\u0E2D\u0E27\u0E4C\u0E40\u0E1A\u0E2D\u0E23\u0E4C\u0E23\u0E35\u0E48");
		buttonGroup.add(checkBox_5);
		checkBox_5.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_5.setBounds(510, 183, 160, 21);
		frame.getContentPane().add(checkBox_5);
		
		JCheckBox checkBox_6 = new JCheckBox("\u0E23\u0E2A\u0E27\u0E19\u0E34\u0E25\u0E25\u0E32");
		buttonGroup.add(checkBox_6);
		checkBox_6.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_6.setBounds(83, 239, 160, 21);
		frame.getContentPane().add(checkBox_6);
		
		JCheckBox checkBox_7 = new JCheckBox("\u0E23\u0E2A\u0E0A\u0E2D\u0E01\u0E42\u0E01\u0E41\u0E25\u0E47\u0E01");
		buttonGroup.add(checkBox_7);
		checkBox_7.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_7.setBounds(291, 242, 160, 21);
		frame.getContentPane().add(checkBox_7);
		
		JCheckBox checkBox_8 = new JCheckBox("\u0E23\u0E2A\u0E04\u0E23\u0E35\u0E21");
		buttonGroup.add(checkBox_8);
		checkBox_8.setFont(new Font("Tahoma", Font.PLAIN, 18));
		checkBox_8.setBounds(510, 242, 160, 21);
		frame.getContentPane().add(checkBox_8);
		
		JButton button = new JButton("\u0E22\u0E49\u0E2D\u0E19\u0E01\u0E25\u0E31\u0E1A");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu01 window = new Menu01();
				window.frame.setVisible(true);
			}
		});
		
		JButton button_1 = new JButton("\u0E15\u0E48\u0E2D\u0E44\u0E1B");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu03 window = new Menu03();
				window.frame.setVisible(true);
				if (checkBox_0.isSelected())
					snuffU = checkBox_0.getText();
				if (checkBox_1.isSelected())
					snuffU = checkBox_1.getText();
				if (checkBox_2.isSelected())
					snuffU = checkBox_2.getText();
				if (checkBox_3.isSelected())
					snuffU = checkBox_3.getText();
				if (checkBox_4.isSelected())
					snuffU = checkBox_4.getText();
				if (checkBox_5.isSelected())
					snuffU = checkBox_5.getText();
				if (checkBox_6.isSelected())
					snuffU = checkBox_6.getText();
				if (checkBox_7.isSelected())
					snuffU = checkBox_7.getText();
				if (checkBox_8.isSelected())
					snuffU = checkBox_8.getText();
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBackground(new Color(50, 205, 50));
		button_1.setBounds(301, 376, 103, 32);
		frame.getContentPane().add(button_1);
		
		JLabel label = new JLabel("\u0E23\u0E2A\u0E0A\u0E32\u0E15\u0E34\u0E17\u0E35\u0E48\u0E15\u0E49\u0E2D\u0E07\u0E01\u0E32\u0E23 :");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(56, 77, 160, 32);
		frame.getContentPane().add(label);
		
		
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.RED);
		button.setBounds(177, 376, 103, 32);
		frame.getContentPane().add(button);
	}
}
