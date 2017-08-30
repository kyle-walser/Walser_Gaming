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
import javax.swing.JOptionPane;

import java.awt.Font;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	private String[] mark = {"",""};
	private boolean playerTurn = false;
	private String[] board = {"","","","","","","","",""};
	

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
	
		JButton btn1 = new JButton("");
		JButton btn2 = new JButton("");
		JButton btn3 = new JButton("");
		JButton btn4 = new JButton("");
		JButton btn5 = new JButton("");
		JButton btn6 = new JButton("");
		JButton btn7 = new JButton("");
		JButton btn8 = new JButton("");
		JButton btn9 = new JButton("");
		setMarkChoice();
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
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setEnabled(false);
				board[0]=getMarkChoice();
				btn1.setText(board[0]);
				System.out.println(aIChoice());
				 switch(aIChoice()){
				 case 1:
					 btn1.setEnabled(false);
					 btn1.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 2:
					 btn2.setEnabled(false);
					 btn2.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 3: 
					 btn3.setEnabled(false);
					 btn3.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 4:
					 btn4.setEnabled(false);
					 btn4.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 5:
					 btn5.setEnabled(false);
					 btn5.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 6:
					 btn6.setEnabled(false);
					 btn6.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 7: 
					 btn7.setEnabled(false);
					 btn7.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 8:
					 btn8.setEnabled(false);
					 btn8.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 9:
					 btn9.setEnabled(false);
					 btn9.setText(aIMark());
					 playerTurn = false;
					 break;
					 
				 }
				// checkBoard(mark[0]);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(10, 34, 76, 45);
		contentPane.add(btn1);
		
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn2.setEnabled(false);
				board[1]=getMarkChoice();
				btn2.setText(board[1]);
				 switch(aIChoice()){
				 case 1:
					 btn1.setEnabled(false);
					 btn1.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 2:
					 btn2.setEnabled(false);
					 btn2.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 3: 
					 btn3.setEnabled(false);
					 btn3.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 4:
					 btn4.setEnabled(false);
					 btn4.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 5:
					 btn5.setEnabled(false);
					 btn5.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 6:
					 btn6.setEnabled(false);
					 btn6.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 7: 
					 btn7.setEnabled(false);
					 btn7.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 8:
					 btn8.setEnabled(false);
					 btn8.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 9:
					 btn9.setEnabled(false);
					 btn9.setText(aIMark());
					 playerTurn = false;
					 break;
					 
				 }
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(96, 34, 76, 45);
		contentPane.add(btn2);
		
	
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn3.setEnabled(false);
				board[2]=getMarkChoice();
				btn3.setText(board[2]);
				 switch(aIChoice()){
				 case 1:
					 btn1.setEnabled(false);
					 btn1.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 2:
					 btn2.setEnabled(false);
					 btn2.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 3: 
					 btn3.setEnabled(false);
					 btn3.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 4:
					 btn4.setEnabled(false);
					 btn4.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 5:
					 btn5.setEnabled(false);
					 btn5.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 6:
					 btn6.setEnabled(false);
					 btn6.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 7: 
					 btn7.setEnabled(false);
					 btn7.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 8:
					 btn8.setEnabled(false);
					 btn8.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 9:
					 btn9.setEnabled(false);
					 btn9.setText(aIMark());
					 playerTurn = false;
					 break;
					 
				 }
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(182, 34, 76, 45);
		contentPane.add(btn3);
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn4.setEnabled(false);
				board[3]=getMarkChoice();
				btn4.setText(board[3]);
				 switch(aIChoice()){
				 case 1:
					 btn1.setEnabled(false);
					 btn1.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 2:
					 btn2.setEnabled(false);
					 btn2.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 3: 
					 btn3.setEnabled(false);
					 btn3.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 4:
					 btn4.setEnabled(false);
					 btn4.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 5:
					 btn5.setEnabled(false);
					 btn5.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 6:
					 btn6.setEnabled(false);
					 btn6.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 7: 
					 btn7.setEnabled(false);
					 btn7.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 8:
					 btn8.setEnabled(false);
					 btn8.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 9:
					 btn9.setEnabled(false);
					 btn9.setText(aIMark());
					 playerTurn = false;
					 break;
					 
				 }
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(10, 90, 76, 45);
		contentPane.add(btn4);
		
	
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn5.setEnabled(false);
				board[4]=getMarkChoice();
				btn5.setText(board[4]);
				 switch(aIChoice()){
				 case 1:
					 btn1.setEnabled(false);
					 btn1.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 2:
					 btn2.setEnabled(false);
					 btn2.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 3: 
					 btn3.setEnabled(false);
					 btn3.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 4:
					 btn4.setEnabled(false);
					 btn4.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 5:
					 btn5.setEnabled(false);
					 btn5.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 6:
					 btn6.setEnabled(false);
					 btn6.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 7: 
					 btn7.setEnabled(false);
					 btn7.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 8:
					 btn8.setEnabled(false);
					 btn8.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 9:
					 btn9.setEnabled(false);
					 btn9.setText(aIMark());
					 playerTurn = false;
					 break;
					 
				 }
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(96, 90, 76, 45);
		contentPane.add(btn5);
		
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn6.setEnabled(false);
				board[5] = getMarkChoice();
				btn6.setText(board[5]);
				 switch(aIChoice()){
				 case 1:
					 btn1.setEnabled(false);
					 btn1.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 2:
					 btn2.setEnabled(false);
					 btn2.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 3: 
					 btn3.setEnabled(false);
					 btn3.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 4:
					 btn4.setEnabled(false);
					 btn4.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 5:
					 btn5.setEnabled(false);
					 btn5.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 6:
					 btn6.setEnabled(false);
					 btn6.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 7: 
					 btn7.setEnabled(false);
					 btn7.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 8:
					 btn8.setEnabled(false);
					 btn8.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 9:
					 btn9.setEnabled(false);
					 btn9.setText(aIMark());
					 playerTurn = false;
					 break;
					 
				 }
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(182, 90, 76, 45);
		contentPane.add(btn6);
		
	
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn7.setEnabled(false);
				board[6] = getMarkChoice();
				btn7.setText(board[6]);
				 switch(aIChoice()){
				 case 1:
					 btn1.setEnabled(false);
					 btn1.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 2:
					 btn2.setEnabled(false);
					 btn2.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 3: 
					 btn3.setEnabled(false);
					 btn3.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 4:
					 btn4.setEnabled(false);
					 btn4.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 5:
					 btn5.setEnabled(false);
					 btn5.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 6:
					 btn6.setEnabled(false);
					 btn6.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 7: 
					 btn7.setEnabled(false);
					 btn7.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 8:
					 btn8.setEnabled(false);
					 btn8.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 9:
					 btn9.setEnabled(false);
					 btn9.setText(aIMark());
					 playerTurn = false;
					 break;
					 
				 }
			}
			
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(10, 146, 76, 45);
		contentPane.add(btn7);
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn8.setEnabled(false);
				board[7] = getMarkChoice();
				btn8.setText(board[7]);
				switch(aIChoice()){
				 case 1:
					 btn1.setEnabled(false);
					 btn1.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 2:
					 btn2.setEnabled(false);
					 btn2.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 3: 
					 btn3.setEnabled(false);
					 btn3.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 4:
					 btn4.setEnabled(false);
					 btn4.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 5:
					 btn5.setEnabled(false);
					 btn5.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 6:
					 btn6.setEnabled(false);
					 btn6.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 7: 
					 btn7.setEnabled(false);
					 btn7.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 8:
					 btn8.setEnabled(false);
					 btn8.setText(aIMark());
					 playerTurn = false;
					 break;
				 case 9:
					 btn9.setEnabled(false);
					 btn9.setText(aIMark());
					 playerTurn = false;
					 break;
					 
				 }
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(96, 146, 76, 45);
		contentPane.add(btn8);
		
	
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn9.setEnabled(false);
				board[8] = getMarkChoice();
				btn9.setText(board[8]);
				aIChoice();
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn9.setBounds(182, 146, 76, 45);
		contentPane.add(btn9);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(0, 202, 283, 2);
		contentPane.add(separator);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(182, 228, 89, 23);
		contentPane.add(btnExit);
	}
	private void setMarkChoice(){
		boolean set = false;
		do{
		mark[0] = JOptionPane.showInputDialog(null, "Choose your marker: X or O ", "Marker Choice", JOptionPane.INFORMATION_MESSAGE).toUpperCase();
	
		
		if (mark[0].equals("X") == true){
			mark[1] = "O";
			set = true;
		}else if( mark[0].equals("O") == true){
			mark[1] = "X";
			set = true;
		}else
		{
			JOptionPane.showMessageDialog(null, mark[0] + " This is not a valid marker.\n Please try again", "Marker Choice Error", JOptionPane.ERROR_MESSAGE);
			
		}
	
		
		} while (set == false);
	}
	private void resetBoard(){
		for(int i= 0; i < 9; i++){
			board[i] = "";
			
		}
	}
	private String getMarkChoice(){
		if (playerTurn == true){ 
			playerTurn = false;
			return mark[0];
			
		}else{
			playerTurn = true;
			return mark[1];
		}
		
	}
	private int aIChoice(){
		
		boolean found = false;
		int num = 0;
		for(int i = 0; i < 9; i++){
			if (board[i].equals("") == true){
				
				found = true;
				break;
			}
		}
		if (found == false){
			JOptionPane.showMessageDialog(null, "Stale Mate" );
			
		}else{
			found = false;
			
			while(false == found){
				num = RandomNum();
				if (board[num] == ""){
					board[num] = mark[1];
				}
			}
		}
		
		
		return num;
		
	}
	private String aIMark(){
		return mark[1];
	}
	public int RandomNum(){
		Random rand = new Random();
		return (rand.nextInt(100) % 9) + 1;
		
	}
	private void checkBoard(String M){
		boolean w = false;
		for (int i = 0; i > 3 && w == false; i++){
			if (board[0+(i * 1)].equals(M) == true && board[3+(i * 1)].equals(M) == true && board[6+(i*1)].equals(M) == true){
				w = true;
				break;
			}
		}
		for (int i = 0; i > 3 && w == false; i++){
			if (board[0+(i*3)].equals(M) == true && board[1+(i*3)].equals(M) == true && board[2+(i*3)].equals(M) == true){
				w = true;
				break;
			}
		}
		if (w == false && board[0].equals(M) == true && board[4].equals(M) == true && board[8].equals(M) == true){
			w = true;
		}
		if (w == false && board[2].equals(M) == true && board[4].equals(M) == true && board[6].equals(M) == true){
			w = true;
		}
		
		if (w == true){
			if(playerTurn == true){
				
				JOptionPane.showMessageDialog(null, "Congrats you won", "Winner", JOptionPane.INFORMATION_MESSAGE);
			}else{
				JOptionPane.showMessageDialog(null, "Sorry, you lost", "Lost", JOptionPane.INFORMATION_MESSAGE);
			}
		}
	}
	
	
}
