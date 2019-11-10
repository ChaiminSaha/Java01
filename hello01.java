import java.awt.EventQueue;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.event.AncestorListener;
import javax.swing.event.AncestorEvent;
import java.awt.Label;
import java.awt.TextField;
import java.awt.Button;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.event.InputMethodListener;
import java.awt.event.InputMethodEvent;
import java.awt.Choice;

public class hello01 {
	static Scanner my = new Scanner(System.in);
	JFrame frame;
	public static String nameU;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hello01 window = new hello01();
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
	public hello01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(250, 235, 215));
		frame.getContentPane().setForeground(new Color(0, 128, 0));
		frame.setBounds(100, 100, 860, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Label label = new Label("\u0E01\u0E23\u0E38\u0E13\u0E32\u0E01\u0E23\u0E2D\u0E01\u0E0A\u0E37\u0E48\u0E2D");
		label.setForeground(new Color(25, 25, 112));
		label.setFont(new Font("Dialog", Font.PLAIN, 16));
		label.setBounds(347, 202, 125, 44);
		frame.getContentPane().add(label);
		
		TextField textField = new TextField();
		textField.addInputMethodListener(new InputMethodListener() {
			public void caretPositionChanged(InputMethodEvent event) {
			}
			public void inputMethodTextChanged(InputMethodEvent event) {
			}
		});
		textField.setFont(new Font("Dialog", Font.PLAIN, 16));
		textField.setBounds(277, 264, 264, 30);
		textField.setName("txtName"); 
		frame.getContentPane().add(textField);
		textField.setName("txtName"); 
		
		JButton btnNewButton_1 = new JButton("\u0E15\u0E48\u0E2D\u0E44\u0E1B");
		btnNewButton_1.setForeground(new Color(255, 255, 255));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Menu01 window = new Menu01();
				window.frame.setVisible(true);
				nameU = textField.getText();
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btnNewButton_1.setBackground(new Color(50, 205, 50));
		btnNewButton_1.setBounds(420, 347, 111, 30);
		frame.getContentPane().add(btnNewButton_1);
		
		JLabel lblNewLabel = new JLabel("WIN-WIN (\u0E44\u0E2D\u0E28\u0E01\u0E23\u0E35\u0E21)");
		lblNewLabel.setForeground(new Color(138, 43, 226));
		lblNewLabel.setBackground(SystemColor.control);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		lblNewLabel.setBounds(261, 75, 305, 44);
		frame.getContentPane().add(lblNewLabel);
		
		JButton button = new JButton("\u0E22\u0E01\u0E40\u0E25\u0E34\u0E01");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Bye01 window = new Bye01();
				window.frame.setVisible(true);
			}
		});
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button.setBackground(new Color(255, 140, 0));
		button.setBounds(288, 346, 103, 32);
		frame.getContentPane().add(button);
		
		JLabel label_1 = new JLabel("\u0E22\u0E34\u0E19\u0E14\u0E35\u0E15\u0E49\u0E2D\u0E19\u0E23\u0E31\u0E1A\u0E04\u0E23\u0E31\u0E1A");
		label_1.setForeground(new Color(34, 139, 34));
		label_1.setFont(new Font("Tahoma", Font.BOLD, 22));
		label_1.setBounds(335, 146, 167, 30);
		frame.getContentPane().add(label_1);
	}
}
