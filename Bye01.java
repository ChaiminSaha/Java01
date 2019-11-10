import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Bye01 {
	

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Bye01 window = new Bye01();
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
	public Bye01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 218, 185));
		frame.setBounds(100, 100, 860, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0E2A\u0E27\u0E31\u0E2A\u0E14\u0E35\u0E04\u0E23\u0E31\u0E1A/\u0E04\u0E48\u0E30");
		label.setForeground(new Color(34, 139, 34));
		label.setFont(new Font("Tahoma", Font.BOLD, 22));
		label.setBounds(349, 193, 161, 30);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("WIN-WIN (\u0E44\u0E2D\u0E28\u0E01\u0E23\u0E35\u0E21)");
		label_1.setForeground(new Color(138, 43, 226));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_1.setBackground(SystemColor.menu);
		label_1.setBounds(270, 78, 305, 44);
		frame.getContentPane().add(label_1);
		
		JButton button = new JButton("\u0E23\u0E32\u0E22\u0E01\u0E32\u0E23\u0E43\u0E2B\u0E21\u0E48");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hello01 window = new hello01();
				window.frame.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(new Color(50, 205, 50));
		button.setBounds(349, 327, 130, 30);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0E1B\u0E34\u0E14");
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBackground(Color.RED);
		button_1.setBounds(349, 367, 130, 30);
		frame.getContentPane().add(button_1);
	}
}
