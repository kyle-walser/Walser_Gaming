package TicTacToe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ttt_Welcome_Screen extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ttt_Welcome_Screen frame = new ttt_Welcome_Screen();
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
	public ttt_Welcome_Screen() {
		setTitle("TicTacToe");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblWelcomeTo = new JLabel("Welcome to Tic-Tac-Toe");
		lblWelcomeTo.setFont(new Font("Tahoma", Font.PLAIN, 29));
		lblWelcomeTo.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcomeTo.setBounds(34, 30, 362, 38);
		contentPane.add(lblWelcomeTo);
		
		JButton btnEnter = new JButton("Enter");
		btnEnter.requestFocus();
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
				TicTacToe tic = new TicTacToe();
				tic.setVisible(true);
				}
		});
		btnEnter.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnEnter.setBounds(166, 183, 98, 38);
		contentPane.add(btnEnter);
	}
}
