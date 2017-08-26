package TicTacToe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JSeparator;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TicTacToe extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe frame = new TicTacToe();
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
	public TicTacToe() {
		setTitle("TIC TAC TOE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 322);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btn1 = new JButton("");
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(10, 34, 76, 45);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("");
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(96, 34, 76, 45);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("");
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(182, 34, 76, 45);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("");
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(10, 90, 76, 45);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("");
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(96, 90, 76, 45);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("");
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(182, 90, 76, 45);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("");
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(10, 146, 76, 45);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("");
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(96, 146, 76, 45);
		contentPane.add(btn8);
		
		JButton button = new JButton("");
		button.setFont(new Font("Tahoma", Font.PLAIN, 20));
		button.setBounds(182, 146, 76, 45);
		contentPane.add(button);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 202, 283, 2);
		contentPane.add(separator);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnExit.setBounds(182, 228, 89, 23);
		contentPane.add(btnExit);
	}
}
