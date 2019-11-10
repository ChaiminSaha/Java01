import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.SystemColor;
import java.awt.Font;
import java.awt.Color;

public class Thanks01 {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thanks01 window = new Thanks01();
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
	public Thanks01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(135, 206, 235));
		frame.setBounds(100, 100, 860, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("WIN-WIN (\u0E44\u0E2D\u0E28\u0E01\u0E23\u0E35\u0E21)");
		label.setForeground(new Color(138, 43, 226));
		label.setFont(new Font("Tahoma", Font.BOLD, 30));
		label.setBackground(SystemColor.menu);
		label.setBounds(265, 78, 305, 44);
		frame.getContentPane().add(label);
		
		JLabel lblThankYou = new JLabel("\u0E02\u0E2D\u0E02\u0E2D\u0E1A\u0E04\u0E38\u0E13\u0E17\u0E35\u0E48\u0E43\u0E0A\u0E49\u0E1A\u0E23\u0E34\u0E01\u0E32\u0E23\u0E04\u0E23\u0E31\u0E1A/\u0E04\u0E48\u0E30   >_<");
		lblThankYou.setForeground(new Color(34, 139, 34));
		lblThankYou.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblThankYou.setBackground(SystemColor.menu);
		lblThankYou.setBounds(182, 199, 509, 44);
		frame.getContentPane().add(lblThankYou);
	}

}
