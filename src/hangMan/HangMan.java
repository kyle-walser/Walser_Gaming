package hangMan;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class HangMan extends JFrame {

	private JPanel contentPane;
	ListData list = new ListData();
	private JTextField txtword;
	static JLabel lbl_0 = new JLabel("_____________________________________________");
	static JLabel lbl1 = new JLabel("|");
	static JLabel label_1 = new JLabel("|");
	static JLabel label_2 = new JLabel("----");
	JButton btnExit = new JButton("Exit");
	static JLabel lblO = new JLabel("O");
	static JLabel label_3 = new JLabel("|");
	static JLabel label_4 = new JLabel("/");
	static JLabel label_5 = new JLabel("_");
	static JLabel label_6 = new JLabel("_");
	public final JButton btnSubmit = new JButton("Submit");
	static JTextField t;
	static JLabel label_7 = new JLabel("\\");
	
	
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
		setFont(new Font("Dialog", Font.BOLD, 12));
		list.setList();
		list.SetWord();
		list.setIniUserWord();
		setTitle("HangMan");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 403, 450);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmGiveUp = new JMenuItem("Give Up");
		mnFile.add(mntmGiveUp);
		
		JMenuItem mntmBack = new JMenuItem("Back");
		mnFile.add(mntmBack);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if (t.getText().length() > 1 ) // limit textfield to 3 characters
	            e.consume(); 
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lbl_0.setBounds(62, 233, 285, 14);
		lbl_0.setVisible(false);
		contentPane.add(lbl_0);
		
		
		lbl1.setVerticalAlignment(SwingConstants.BOTTOM);
		lbl1.setFont(new Font("Tahoma", Font.PLAIN, 92));
		lbl1.setBounds(79, 137, 40, 96);
		lbl1.setVisible(false);
		contentPane.add(lbl1);
		
		txtword = new JTextField();
		txtword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtword.setEditable(false);
		txtword.setHorizontalAlignment(SwingConstants.CENTER);
		txtword.setBounds(62, 258, 280, 71);
		txtword.setText(list.getUserWord()); // here is where i changed the code
		contentPane.add(txtword);
		txtword.setColumns(10);
		
		
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 92));
		label_1.setVisible(false);
		label_1.setBounds(79, 51, 40, 96);
		contentPane.add(label_1);
		
		
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 92));
		label_2.setVisible(false);
		label_2.setBounds(106, 27, 83, 62);
		contentPane.add(label_2);
		
		
		lblO.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(153, 76, 46, 42);
		lblO.setVisible(false);
		contentPane.add(lblO);
		
		label_3.setFont(new Font("Tahoma", Font.BOLD, 48));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(153, 97, 46, 71);
		label_3.setVisible(false);
		contentPane.add(label_3);
		
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 42));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setVisible(false);
		label_4.setBounds(142, 149, 59, 59);
		contentPane.add(label_4);
		
		label_5.setFont(new Font("Tahoma", Font.BOLD, 38));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(132, 85, 59, 46);
		label_5.setVisible(false);
		contentPane.add(label_5);
		
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 38));
		label_6.setBounds(163, 85, 59, 46);
		label_6.setVisible(false);
		contentPane.add(label_6);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if (t.getText().length() == 1){
					if (list.checkRightList(t.getText().toUpperCase()) == false){
						list.addRightList(t.getText().toUpperCase());
						list.checkWord(t.getText().toUpperCase());
						switchOut(list.getWrongNumber());
						t.setText("");
						txtword.setText(list.getUserWord());
					}else{
						JOptionPane.showMessageDialog(null, "You have already submitted a " + t.getText().toUpperCase() + " /n Please select a different letter", "Duplicate character selected error", JOptionPane.ERROR_MESSAGE);
						t.requestFocus();
						t.setText("");
					}
				}else{
					JOptionPane.showMessageDialog(null, "You must enter one character.","Too Many Characters Error", JOptionPane.ERROR_MESSAGE);
					t.requestFocus();
					t.setText("");
				}
			}
		});
		btnSubmit.setBounds(258, 340, 89, 23);
		
		contentPane.add(btnSubmit);
		
		t = new JTextField();
	/*	t.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (t.getText().length() > 1 ) // limit textfield to 3 characters
		            e.consume(); 
			}
		});*/
		
		
		t.setBounds(218, 341, 22, 20);
		
		contentPane.add(t);
		t.setColumns(10);
		
		
		JLabel lblCharacterToTry = new JLabel("Character to try:");
		lblCharacterToTry.setBounds(106, 344, 102, 14);
		contentPane.add(lblCharacterToTry);
		
		label_7.setVerticalAlignment(SwingConstants.TOP);
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setFont(new Font("Tahoma", Font.BOLD, 42));
		label_7.setVisible(false);
		label_7.setBounds(153, 149, 59, 59);
		
		contentPane.add(label_7);
		
	}
	private static void switchOut(int i){
		
		switch(i){
		case 1: 
			lbl_0.setVisible(true);
			
			break;
		case 2: 
			lbl1.setVisible(true);
			label_1.setVisible(true);
			break;
		case 3:
			label_2.setVisible(true);
			break;
		case 4:
			lblO.setVisible(true);
			break;
		case 5: 
			label_3.setVisible(true);
			break;
		case 6:
			label_4.setVisible(true);
			break;
		case 7:
			label_5.setVisible(true);
			break;
		case 8:
			label_6.setVisible(true);
			break;
		case 9:
			
			label_7.setVisible(true);
		
			break;
		case 10:
			t.setEnabled(false);
			label_7.setBackground(Color.RED);
		default:
			boolean d = false;
			lbl_0.setVisible(d);
			lbl1.setVisible(d);
			label_1.setVisible(d);
			label_2.setVisible(d);
			lblO.setVisible(d);
			label_3.setVisible(d);
			label_4.setVisible(d);
			label_5.setVisible(d);
			label_6.setVisible(d);
			label_7.setVisible(d);
			break;
		}
		
	}
}
