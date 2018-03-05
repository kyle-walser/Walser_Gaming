package battle_Ship;

import java.awt.BorderLayout;
import java.awt.EventQueue;


import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;

public class BattleShipGame extends JFrame {

	private JPanel contentPane;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					
					BattleShipGame frame = new BattleShipGame();
					frame.setVisible(false);
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public BattleShipGame() {
		setTitle("BattleShip: The Game");
		
		Player_data Player = new Player_data();
		
		Player.setBoard();
		Player.setShipInfo();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 506, 563);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnFile = new JMenu("File");
		menuBar.add(mnFile);
		
		JMenuItem mntmNew = new JMenuItem("New");
		mnFile.add(mntmNew);
		
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea JtextArea = new JTextArea();
		JtextArea.setBackground(Color.WHITE);
		JtextArea.setForeground(Color.BLACK);
		JtextArea.setLineWrap(true);
		JtextArea.setEditable(false);
		Font f = new Font("TimesNewRoman", Font.PLAIN, 16);
		JtextArea.setFont(f);
		JtextArea.setBounds(36, 75, 200, 200);
		
		contentPane.add(JtextArea);
		JtextArea.setText( Player.print(Player.getMandH()));
		
		JTextArea Jtext = new JTextArea();
		Jtext.setFont(new Font("Dialog", Font.PLAIN, 16));
		Jtext.setEditable(false);
		Jtext.setBounds(265, 75, 198, 213);
		contentPane.add(Jtext);
		
		JLabel lblShotsFired = new JLabel("Shots Fired");
		lblShotsFired.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShotsFired.setBounds(86, 26, 84, 14);
		contentPane.add(lblShotsFired);
		
		JLabel lblShipLoaction = new JLabel("Ship Location");
		lblShipLoaction.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShipLoaction.setBounds(294, 26, 128, 14);
		contentPane.add(lblShipLoaction);
		
		JLabel lblA = new JLabel("A");
		lblA.setBounds(23, 75, 16, 14);
		contentPane.add(lblA);
		
		JLabel lblB = new JLabel("B");
		lblB.setBounds(23, 100, 16, 14);
		contentPane.add(lblB);
		
		JLabel lblC = new JLabel("C");
		lblC.setBounds(23, 125, 16, 14);
		contentPane.add(lblC);
		
		JLabel lblD = new JLabel("D");
		lblD.setBounds(23, 150, 16, 14);
		contentPane.add(lblD);
		
		JLabel lblE = new JLabel("E");
		lblE.setBounds(23, 175, 16, 14);
		contentPane.add(lblE);
		
		
		
		
	}
	private static String setLocation(String x,String y){
		return x;
	}
}
