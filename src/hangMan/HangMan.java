package hangMan;

import java.awt.BorderLayout;
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
	JLabel lblNewLabel = new JLabel("_____________________________________________");
	JLabel label = new JLabel("|");
	JLabel label_1 = new JLabel("|");
	JLabel label_2 = new JLabel("----");
	JButton btnExit = new JButton("Exit");
	JLabel lblO = new JLabel("O");
	private final JLabel label_3 = new JLabel("|");
	private final JLabel label_4 = new JLabel("/\\");
	private final JLabel label_5 = new JLabel("_");
	private final JLabel label_6 = new JLabel("_");
	private final JButton btnSubmit = new JButton("Submit");
	private JTextField t;
	
	
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
		setBounds(100, 100, 450, 450);
		
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
				if (t.getText().length() >= 1 ) // limit textfield to 3 characters
	            e.consume(); 
				
			}
		});
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		lblNewLabel.setBounds(62, 233, 285, 14);
		contentPane.add(lblNewLabel);
		
		
		label.setVerticalAlignment(SwingConstants.BOTTOM);
		label.setFont(new Font("Tahoma", Font.PLAIN, 92));
		label.setBounds(79, 137, 40, 96);
		contentPane.add(label);
		
		txtword = new JTextField();
		txtword.setFont(new Font("Tahoma", Font.PLAIN, 30));
		txtword.setEditable(false);
		txtword.setHorizontalAlignment(SwingConstants.CENTER);
		txtword.setBounds(62, 258, 280, 71);
		txtword.setText(list.getUserWord());
		contentPane.add(txtword);
		txtword.setColumns(10);
		
		
		label_1.setVerticalAlignment(SwingConstants.BOTTOM);
		label_1.setFont(new Font("Tahoma", Font.PLAIN, 92));
		label_1.setBounds(79, 51, 40, 96);
		contentPane.add(label_1);
		
		
		label_2.setVerticalAlignment(SwingConstants.BOTTOM);
		label_2.setFont(new Font("Tahoma", Font.PLAIN, 92));
		label_2.setBounds(106, 27, 83, 62);
		contentPane.add(label_2);
		
		
		lblO.setFont(new Font("Tahoma", Font.BOLD, 44));
		lblO.setHorizontalAlignment(SwingConstants.CENTER);
		lblO.setBounds(153, 76, 46, 42);
		contentPane.add(lblO);
		label_3.setFont(new Font("Tahoma", Font.BOLD, 48));
		label_3.setHorizontalAlignment(SwingConstants.CENTER);
		label_3.setBounds(153, 97, 46, 71);
		
		contentPane.add(label_3);
		label_4.setVerticalAlignment(SwingConstants.TOP);
		label_4.setFont(new Font("Tahoma", Font.BOLD, 42));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(129, 150, 95, 59);
		
		contentPane.add(label_4);
		label_5.setFont(new Font("Tahoma", Font.BOLD, 38));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(132, 85, 59, 46);
		
		contentPane.add(label_5);
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setFont(new Font("Tahoma", Font.BOLD, 38));
		label_6.setBounds(163, 85, 59, 46);
		
		contentPane.add(label_6);
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (t.getText().length() == 1){
					list.checkWord(t.getText());
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
		t.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				if (t.getText().length() >= 1 ) // limit textfield to 3 characters
		            e.consume(); 
			}
		});
		
		
		t.setBounds(218, 341, 22, 20);
		
		contentPane.add(t);
		t.setColumns(10);
		
		
		JLabel lblCharacterToTry = new JLabel("Character to try:");
		lblCharacterToTry.setBounds(106, 344, 102, 14);
		contentPane.add(lblCharacterToTry);
		
	}
}
