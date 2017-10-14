package hangMan;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;

public class HangMan extends JFrame {

	private JPanel contentPane;
	ListData list = new ListData();
	private JTextField txtword;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HangMan frame = new HangMan();
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
	public HangMan() {
		list.setList();
		setTitle("HangMan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("_____________________________________________");
		lblNewLabel.setBounds(62, 233, 285, 14);
		contentPane.add(lblNewLabel);
		
		JLabel label = new JLabel("|");
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setFont(new Font("Tahoma", Font.PLAIN, 92));
		label.setBounds(79, 137, 40, 96);
		contentPane.add(label);
		
		txtword = new JTextField();
		txtword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtword.setEditable(false);
		txtword.setHorizontalAlignment(SwingConstants.CENTER);
		txtword.setBounds(62, 258, 280, 71);
		txtword.setText(list.GetWord());
		contentPane.add(txtword);
		txtword.setColumns(10);
		
		JLabel label_1 = new JLabel("|");
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 92));
		label_1.setBounds(79, 51, 40, 96);
		contentPane.add(label_1);
		
		JLabel label_2 = new JLabel("----");
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 92));
		label_2.setBounds(106, 27, 83, 62);
		contentPane.add(label_2);
	}
}
