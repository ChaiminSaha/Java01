import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JList;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;

public class list01 {

	static final String Lable_1 = null;
	JFrame frame;
	private JTable table;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					list01 window = new list01();
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
	public list01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(255, 222, 173));
		frame.setBounds(100, 100, 860, 480);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblYourList = new JLabel("Your List");
		lblYourList.setFont(new Font("Sylfaen", Font.BOLD, 30));
		lblYourList.setBounds(341, 50, 175, 41);
		frame.getContentPane().add(lblYourList);
		
		JLabel label = new JLabel("\u0E23\u0E32\u0E22\u0E01\u0E32\u0E23");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(108, 104, 160, 32);
		frame.getContentPane().add(label);
		
		JLabel label_1 = new JLabel("\u0E23\u0E32\u0E04\u0E32");
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_1.setBounds(592, 104, 160, 32);
		frame.getContentPane().add(label_1);
		
		JLabel label_2 = new JLabel("\u0E23\u0E27\u0E21");
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_2.setBounds(457, 329, 46, 32);
		frame.getContentPane().add(label_2);
		
		JList list = new JList();
		list.setBounds(176, 209, -15, -22);
		frame.getContentPane().add(list);
		
		table = new JTable();
		table.setBounds(176, 189, -23, -15);
		frame.getContentPane().add(table);
		
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
		button.setBounds(144, 373, 103, 32);
		frame.getContentPane().add(button);
		
		
		
		textField = new JTextField();
		textField.setText(String.valueOf(Menu03.sunU)+".-");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 16));
		textField.setBounds(507, 332, 146, 30);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel label_3 = new JLabel("\u0E1A\u0E32\u0E17");
		label_3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_3.setBounds(663, 329, 46, 32);
		frame.getContentPane().add(label_3);
		
		JLabel label_4 = new JLabel("\u0E42\u0E15\u0E4A\u0E30\u0E17\u0E35\u0E48 :");
		label_4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_4.setBounds(20, 22, 55, 32);
		frame.getContentPane().add(label_4);
		
		JLabel label_6 = new JLabel("\u0E04\u0E38\u0E13");
		label_6.setForeground(new Color(0, 0, 0));
		label_6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label_6.setBounds(648, 23, 40, 30);
		frame.getContentPane().add(label_6);
		
		JLabel Label_1 = new JLabel("");
		Label_1.setText(Menu01.tableU);
		Label_1.setFont(new Font("Tahoma", Font.BOLD, 18));
		Label_1.setBounds(85, 27, 90, 26);
		frame.getContentPane().add(Label_1);
		
		JLabel label_5 = new JLabel((String) null);
		label_5.setText(hello01.nameU);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 18));
		label_5.setBounds(693, 22, 132, 32);
		frame.getContentPane().add(label_5);
		
		JButton button_1 = new JButton("\u0E22\u0E37\u0E19\u0E22\u0E31\u0E19");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Thanks01 window = new Thanks01();
				window.frame.setVisible(true);
			}
		});
		button_1.setForeground(Color.WHITE);
		button_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		button_1.setBackground(new Color(0, 0, 255));
		button_1.setBounds(274, 373, 103, 32);
		frame.getContentPane().add(button_1);
		
		textField_1 = new JTextField();
		textField_1.setDropMode(DropMode.INSERT);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		textField_1.setText(Menu01.sizeU+"\t"+Menu02.snuffU+"\t"+Menu03.fruitU+"\t\t\t"+String.valueOf(Menu03.sunU)+".-");
		//String[] textField_1 = new String[ ];
		textField_1.setBounds(120, 146, 570, 41);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		/*JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setText(Menu01.sizeU+"\t"+Menu02.snuffU+"\t"+Menu03.fruitU+"\t\t\t"+String.valueOf(Menu03.sunU)+".-");
		lblNewLabel.setBounds(120, 209, 568, 41);
		frame.getContentPane().add(lblNewLabel);*/
		
	}
}
//		lblNewLabel.setText(Menu01.sizeU);
//		label_7.setText(Menu02.snuffU);
//		label_9.setText(Menu03.fruitU);