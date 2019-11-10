import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Thanks {

	JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Thanks window = new Thanks();
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
	public Thanks() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(245, 222, 179));
		frame.setBounds(100, 100, 860, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("\u0E01\u0E23\u0E38\u0E13\u0E32\u0E01\u0E14\u0E22\u0E37\u0E19\u0E22\u0E31\u0E19\u0E23\u0E32\u0E22\u0E01\u0E32\u0E23\u0E17\u0E35\u0E48\u0E40\u0E25\u0E37\u0E2D\u0E01 \u0E2B\u0E23\u0E37\u0E2D \u0E22\u0E49\u0E2D\u0E19\u0E01\u0E25\u0E31\u0E1A\u0E40\u0E1E\u0E37\u0E48\u0E2D\u0E40\u0E25\u0E37\u0E2D\u0E01\u0E43\u0E2B\u0E21\u0E48");
		label.setForeground(Color.RED);
		label.setFont(new Font("Tahoma", Font.BOLD, 18));
		label.setBounds(191, 155, 476, 30);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0E01\u0E23\u0E38\u0E13\u0E32\u0E40\u0E25\u0E37\u0E2D\u0E01\u0E43\u0E2B\u0E49\u0E04\u0E23\u0E1A");
		label_1.setForeground(new Color(34, 139, 34));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_1.setBounds(295, 230, 200, 30);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("WIN-WIN (\u0E44\u0E2D\u0E28\u0E01\u0E23\u0E35\u0E21)");
		label_2.setForeground(new Color(138, 43, 226));
		label_2.setFont(new Font("Tahoma", Font.BOLD, 30));
		label_2.setBackground(SystemColor.menu);
		label_2.setBounds(249, 74, 305, 44);
		frame.getContentPane().add(label_2);
		
		JButton button = new JButton("\u0E22\u0E37\u0E19\u0E22\u0E31\u0E19");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				list01 window = new list01();
				window.frame.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(Color.BLUE);
		button.setBounds(451, 358, 103, 32);
		frame.getContentPane().add(button);
		
		JButton button_1 = new JButton("\u0E22\u0E49\u0E2D\u0E19\u0E01\u0E25\u0E31\u0E1A");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu03 window = new Menu03();
				window.frame.setVisible(true);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBackground(Color.RED);
		button_1.setBounds(255, 358, 103, 32);
		frame.getContentPane().add(button_1);
	}

}
