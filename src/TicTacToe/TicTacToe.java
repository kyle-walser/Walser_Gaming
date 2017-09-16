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
import java.util.Vector;

public class TicTacToe extends JFrame {

	private JPanel contentPane;
	private String[] mark = {"",""};
	private boolean playerTurn = true;
	private String[] playerName = {"",""};
	private String[] board = {"*","*","*","*","*","*","*","*","*","*"};
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
	Vector<Integer> v = new Vector<Integer>();
	private final JMenu mnEdit = new JMenu("Edit");
	private final JMenuItem mntmOfPlayers = new JMenuItem("# of Players");
	
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
	
		setNumOfPlayers();
		setName(); 
		setMarkChoice();
		
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
				if(getNumOfPlayers() == 0){
					if (RandomNum(2) + 1 == 2){
						playerTurn = false;
						caseSwitch(RandomNum(9));
					}
				}
			}
		});
		
		mnFile.add(mntmReset);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		
		menuBar.add(mnEdit);
		
		JMenu mnChange = new JMenu("Change");
		mnEdit.add(mnChange);
		
		JMenuItem mntmName = new JMenuItem("Name");
		mntmName.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				setName();
				resetBoard();
			}
		});
		mnChange.add(mntmName);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("Marker");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setMarkChoice(); 
				resetBoard();
			}
		});
		mnChange.add(mntmNewMenuItem_1);
		mntmOfPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setNumOfPlayers();
				setName();
				resetBoard();
			}
		});
		
		mnChange.add(mntmOfPlayers);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caseSwitch(1);
				if (getNumOfPlayers() == 0 && gameWon == false){
					caseSwitch(aIChoice());
				}
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn1.setBounds(10, 34, 76, 45);
		contentPane.add(btn1);
		
		
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caseSwitch(2);
				if (getNumOfPlayers() == 0 && gameWon == false){
					caseSwitch(aIChoice());
					
				}
				
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn2.setBounds(96, 34, 76, 45);
		contentPane.add(btn2);
		
	
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caseSwitch(3);
	
				if (getNumOfPlayers() == 0 && gameWon == false){
					caseSwitch(aIChoice());
					
				}
				
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn3.setBounds(182, 34, 76, 45);
		contentPane.add(btn3);
		
		
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caseSwitch(4);
				if (getNumOfPlayers() == 0 && gameWon == false){
					caseSwitch(aIChoice());
					
				}
				
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn4.setBounds(10, 90, 76, 45);
		contentPane.add(btn4);
		
	
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caseSwitch(5);
				if (getNumOfPlayers() == 0 && gameWon == false){
					caseSwitch(aIChoice());
				}
				
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn5.setBounds(96, 90, 76, 45);
		contentPane.add(btn5);
		
		
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caseSwitch(6);
				if (getNumOfPlayers() == 0 && gameWon == false){
					caseSwitch(aIChoice());
					
				}
				
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn6.setBounds(182, 90, 76, 45);
		contentPane.add(btn6);
		
	
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caseSwitch(7);
				if (getNumOfPlayers() == 0 && gameWon == false){
					caseSwitch(aIChoice());
					
				}
				
			}
			
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn7.setBounds(10, 146, 76, 45);
		contentPane.add(btn7);
		
		
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caseSwitch(8);
				if (getNumOfPlayers() == 0 && gameWon == false){
					caseSwitch(aIChoice());
					
				}
				
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn8.setBounds(96, 146, 76, 45);
		contentPane.add(btn8);
		
	
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				caseSwitch(9);
				if (getNumOfPlayers() == 0 && gameWon == false){
					caseSwitch(aIChoice());
					
				}
				
				
				
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
		if(getNumOfPlayers() == 0){
			if (RandomNum(2) + 1 == 2){
				playerTurn = false;
				caseSwitch(RandomNum(9));
			}
		}
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
		for(int i= 1; i < 10; i++){
			board[i] = "*";
			
		}
		playerTurn = true;
		
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
		
	 
		int num = 0;
		v.clear();
		for(int i = 1; i < 10; i++){
			if (board[i].equals("*") == true){
			
				
				v.addElement(i);
			}
		}
		
		
		if (v.size()  < 1){
			JOptionPane.showMessageDialog(null, "Stale Mate" );
			return 0;
			
		}else{
			
			
			/*while(found == false){
				num = RandomNum(v.size());
				if (board[num] == "*"){
					board[num] = mark[1];
					found = true;
				}
			}*/
			return v.elementAt(RandomNum(v.size()));
			 
		}
		
		
		
		
		
	}
	private String aIMark(){
		return mark[1];
	}
	public int RandomNum(int num){
		Random rand = new Random();
		return (rand.nextInt(100) % num);
		
	}
	private void checkBoard(){
		String M  = "";
		if (playerTurn == true){
			M = mark[0];  
		}else{
			M = mark[1];
		}
		boolean w = false;
		
		for (int i = 0; i < 3 && w == false; i++){// this checks vertically if player has won
				if (board[1+(i * 1)] == M && board[4+(i * 1)] == M && board[7+(i*1)] == M){
				w = true;
				break;
			}						
		}
		for (int i = 0; i < 3 && w == false; i++){ // this checks horizontally if player has won
			if (board[1+(i*3)] == M && board[2+(i*3)] == M && board[3+(i*3)] == M){
				w = true;
				break;
			}
		}
		if (w == false && board[1].equals(M) == true && board[5].equals(M) == true && board[9].equals(M) == true){
			w = true;
		}
		if (w == false && board[3].equals(M) == true && board[5].equals(M) == true && board[7].equals(M) == true){
			w = true;
			
		}
		
		if (w == true){
			gameWon = true;
			winButtons();
			if(playerTurn == true){
				
				JOptionPane.showMessageDialog(null, "Congrats "+ playerName[0] + " you won", "Winner", JOptionPane.INFORMATION_MESSAGE);
			}else{
				if (numOfPlayers == 0){
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
			}
		}
	}
	
	public void caseSwitch(int num){
		if (gameWon == false){
			String mark;
			
			if (playerTurn == true){
				mark= getMarkChoice();
			}else{
				mark = aIMark();
			}
			
			
			
			 switch(num){
			 case 1:
				 
				 btn1.setEnabled(false);
				 btn1.setText(mark);
				 board[num] = mark;
				 break;
				 
			 case 2:
				 btn2.setEnabled(false);
				 btn2.setText(mark);
				 board[num] = mark;
				 break;
			 case 3: 
				 btn3.setEnabled(false);
				 btn3.setText(mark);
				 board[num] = mark;
				 break;
			 case 4:
				 btn4.setEnabled(false);
				 btn4.setText(mark);
				 board[num] = mark;
				 break;
			 case 5:
				 btn5.setEnabled(false);
				 btn5.setText(mark);
				 board[num] = mark;
				 break;
			 case 6:
				 btn6.setEnabled(false);
				 btn6.setText(mark);
				 board[num] = mark;
				 break;
			 case 7: 
				 btn7.setEnabled(false);
				 btn7.setText(mark);
				 board[num] = mark;
				 break;
			 case 8:
				 btn8.setEnabled(false);
				 btn8.setText(mark);
				 board[num] = mark;
				 break;
			 case 9:
				 btn9.setEnabled(false);
				 btn9.setText(mark);
				 board[num] = mark;
				 break;
				 
			 }
			 
			 checkBoard();
			
			
		
		}
	}
	public void setName(){
		while(playerName[0].length()<1){
			playerName[0] = JOptionPane.showInputDialog(null,"Please enter your name","").toUpperCase();
			if (playerName[0].length()<1){
				JOptionPane.showMessageDialog(null, "Please a name", "No Name error", JOptionPane.ERROR_MESSAGE);
			}
		 }
		 
		 switch(getNumOfPlayers()){
		 
		 case 0:
			 setName2("Computer");
			 
			 break;
		 case 1:
			 
			 setPlayerSecondName();
			 
			 break;
			 
		 	 }
		 
		
	}
	private void setNumOfPlayers(){
		Object[] options1 = { "1", "2"};

		 JPanel panel = new JPanel();
		 panel.add(new JLabel("Please select how many players"));
		
		 numOfPlayers =  JOptionPane.showOptionDialog(null, panel, "Number of Players",
		         JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.PLAIN_MESSAGE,null, options1, null);
		 
		 
		 
		
	}
	private void setPlayerSecondName()
	{
		
	/*	while(playerName[1].length()<1){
			 playerName[1] = JOptionPane.showInputDialog(null,"Please Enter Second Player's Name","").toUpperCase();
				if (playerName[1].length()<1){
					JOptionPane.showMessageDialog(null, "Please a name", "No Name error", JOptionPane.ERROR_MESSAGE);
				}
			}*/
			
		do{
			setName2(JOptionPane.showInputDialog(null,"Please Enter Second Player's Name",""));
			
			if (getName2().length() < 1){
				JOptionPane.showMessageDialog(null, "Please a name", "No Name error", JOptionPane.ERROR_MESSAGE);
			}
		}while(getName2().length()<1);
	}
	private int getNumOfPlayers(){
		return numOfPlayers;
	}
	
	private void setName2(String in){
		playerName[1] = in.toUpperCase();
	}
	private String getName2(){
		return playerName[1];
	}
	
}
