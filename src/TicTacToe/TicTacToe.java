package TicTacToe;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import java.awt.Font;

import javax.swing.JSeparator;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.Random;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	private String[] mark = {"",""};
	private boolean playerTurn = true;
	private String[] playerName = {"",""};
	private String[] board = {"*","*","*","*","*","*","*","*","*"};
	JButton btn1 = new JButton("");
	JButton btn2 = new JButton("");
	JButton btn3 = new JButton("");
	JButton btn4 = new JButton("");
	JButton btn5 = new JButton("");
	JButton btn6 = new JButton("");
	JButton btn7 = new JButton("");
	JButton btn8 = new JButton("");
	JButton btn9 = new JButton("");
	private final JMenuItem mntmReset = new JMenuItem("Reset");
	boolean gameWon = false;
	int numOfPlayers;

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
	
		/*JButton btn1 = new JButton("");
		JButton btn2 = new JButton("");
		JButton btn3 = new JButton("");
		JButton btn4 = new JButton("");
		JButton btn5 = new JButton("");
		JButton btn6 = new JButton("");
		JButton btn7 = new JButton("");
		JButton btn8 = new JButton("");
		JButton btn9 = new JButton("");*/
		setMarkChoice();
		setName();
		setTitle("TIC TAC TOE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 322);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		mntmReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetBoard();
			}
		});
		
		mnFile.add(mntmReset);
		
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
				checkBoard();
				
				caseSwitch(aIChoice());
				 
				
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
				checkBoard();
				caseSwitch(aIChoice());
				
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
				checkBoard();
				caseSwitch(aIChoice());
				
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
				checkBoard();
				caseSwitch(aIChoice());
				
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
				checkBoard();
				caseSwitch(aIChoice());
				
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
				checkBoard();
				caseSwitch(aIChoice());
				
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
				checkBoard();
				caseSwitch(aIChoice());
				
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
				checkBoard();
				caseSwitch(aIChoice());
				
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
				checkBoard();
				caseSwitch(aIChoice());
				
				
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
			board[i] = "*";
			
		}
		resetButtons();
	}
	public void winButtons(){
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);
		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);
		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);
	}
	public void resetButtons(){
		btn1.setEnabled(true);
		btn1.setText("");
		btn2.setEnabled(true);
		btn2.setText("");
		btn3.setEnabled(true);
		btn3.setText("");
		btn4.setEnabled(true);
		btn4.setText("");
		btn5.setEnabled(true);
		btn5.setText("");
		btn6.setEnabled(true);
		btn6.setText("");
		btn7.setEnabled(true);
		btn7.setText("");
		btn8.setEnabled(true);
		btn8.setText("");
		btn9.setEnabled(true);
		btn9.setText("");
		gameWon = false;
	}
	private String getMarkChoice(){
		
			
			return mark[0];
			
		
		
	}	
	private int aIChoice(){
		
		boolean found = false;
		int num = 0;
		for(int i = 0; i < 9 && found == false; i++){
			if (board[i].equals("*") == true){
			
				found = true;
				i=9;
			}
		}
		
		if (found == false){
			JOptionPane.showMessageDialog(null, "Stale Mate" );
			
		}else{
			found = false;
			
			while(found == false){
				num = RandomNum();
				if (board[num] == "*"){
					board[num] = mark[1];
					found = true;
				}
			}
		}
		
		
		
		return num + 1;
		
	}
	private String aIMark(){
		return mark[1];
	}
	
	public int RandomNum(){
		Random rand = new Random();
		return (rand.nextInt(100) % 8);
		
	}
	private void checkBoard(){
		String M  = "";
		if (playerTurn == true){
			M = mark[0];  
		}else{
			M = mark[1];
		}
		boolean w = false;
		
		for (int i = 0; i < 3 && w == false; i++){// this checks vertically if player had won.
				if (board[0+(i * 1)] == M && board[3+(i * 1)] == M && board[6+(i*1)] == M){
				w = true;
				break;
			}
		}
		for (int i = 0; i < 3 && w == false; i++){
			if (board[0+(i*3)] == M && board[1+(i*3)] == M && board[2+(i*3)] == M){
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
			gameWon = true;
			winButtons();
			if(playerTurn == true){
				
				JOptionPane.showMessageDialog(null, "Congrats "+ playerName[0] + " you won", "Winner", JOptionPane.INFORMATION_MESSAGE);
			}else{
				if (numOfPlayers == 1){
					JOptionPane.showMessageDialog(null, "Sorry, you lost", "Lost", JOptionPane.INFORMATION_MESSAGE);
				}else{
					JOptionPane.showMessageDialog(null,  "Congrats "+ playerName[1] + " you won", "Winner", JOptionPane.INFORMATION_MESSAGE);
				}
			}
		}
		if (gameWon == false){
			if (playerTurn == false){
				playerTurn = true;
			}else{
				playerTurn = false;
				// turn this to false
			}
		}
	}
	
	public void caseSwitch(int num){
		if (gameWon == false){
			 switch(num){
			 case 1:
				 
				 btn1.setEnabled(false);
				 btn1.setText(aIMark());
				 board[num - 1] = aIMark();
				 break;
				 
			 case 2:
				 btn2.setEnabled(false);
				 btn2.setText(aIMark());
				 board[num - 1] = aIMark();
				 break;
			 case 3: 
				 btn3.setEnabled(false);
				 btn3.setText(aIMark());
				 board[num - 1] = aIMark();
				 break;
			 case 4:
				 btn4.setEnabled(false);
				 btn4.setText(aIMark());
				 board[num - 1] = aIMark();
				 break;
			 case 5:
				 btn5.setEnabled(false);
				 btn5.setText(aIMark());
				 board[num - 1] = aIMark();
				 break;
			 case 6:
				 btn6.setEnabled(false);
				 btn6.setText(aIMark());
				 board[num - 1] = aIMark();
				 break;
			 case 7: 
				 btn7.setEnabled(false);
				 btn7.setText(aIMark());
				 board[num - 1] = aIMark();
				 break;
			 case 8:
				 btn8.setEnabled(false);
				 btn8.setText(aIMark());
				 board[num - 1] = aIMark();
				 break;
			 case 9:
				 btn9.setEnabled(false);
				 btn9.setText(aIMark());
				 board[num - 1] = aIMark();
				 break;
				 
			 }
			 checkBoard();
		}
	}
	public void setName(){
		while(playerName[0].length()<1){
			playerName[0] = JOptionPane.showInputDialog(null,"Please enter your name","");
			if (playerName[0].length()<1){
				JOptionPane.showMessageDialog(null, "Please a name", "No Name error", JOptionPane.ERROR_MESSAGE);
			}
		}
		 Object[] options1 = { "1", "2"};

		 JPanel panel = new JPanel();
		 panel.add(new JLabel("Please select how many players"));
		// JTextField textField = new JTextField(10);
		// panel.add(textField);
		
		 switch( JOptionPane.showOptionDialog(null, panel, "Number of Players",
		         JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,
		         null, options1, null)){
		 
		 case 0:
			 playerName[1] = "Computer";
			 numOfPlayers = 1;
			 break;
		 case 1:
			 numOfPlayers = 2;
			 while(playerName[1].length()<1){
				 playerName[1] = JOptionPane.showInputDialog(null,"Please Enter Second Player's Name","");
					if (playerName[1].length()<1){
						JOptionPane.showMessageDialog(null, "Please a name", "No Name error", JOptionPane.ERROR_MESSAGE);
					}
				}
			 
			 break;
			 
		 	 }
		 
		// if (result == JOptionPane.YES_OPTION){
		 //    JOptionPane.showMessageDialog(null, textField.getText());
		// }
	}
}
