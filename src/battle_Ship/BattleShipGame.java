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
	public BattleShipGame() {
		Player_data Player = new Player_data();
		
		Player.setBoard();
		Player.setShipInfo();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea JtextArea = new JTextArea();
		JtextArea.setEditable(false);
		Font f = new Font("TimesNewRoman", Font.PLAIN, 16);
		JtextArea.setFont(f);
		JtextArea.setBounds(25, 35, 157, 172);
		
		contentPane.add(JtextArea);
		JtextArea.setText( Player.print(Player.getMandH()));
		
		JTextArea Jtext = new JTextArea();
		Jtext.setFont(new Font("Dialog", Font.PLAIN, 16));
		Jtext.setEditable(false);
		Jtext.setBounds(219, 35, 157, 172);
		contentPane.add(Jtext);
		
		JLabel lblShotsFired = new JLabel("Shots Fired");
		lblShotsFired.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShotsFired.setBounds(49, 10, 84, 14);
		contentPane.add(lblShotsFired);
		
		JLabel lblShipLoaction = new JLabel("Ship Location");
		lblShipLoaction.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblShipLoaction.setBounds(236, 10, 128, 14);
		contentPane.add(lblShipLoaction);
		
		
		
		
	}
	private static void menu_Start(){
		boolean d = false;
		 
		while (d == false){
		//	JOptionPane.showInputDialog(null, arg1, arg2, arg3)			
		}
	}
}
