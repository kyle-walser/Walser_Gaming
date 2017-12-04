package battle_Ship;

import java.util.Random;
import java.util.Vector;

import javax.swing.JOptionPane;

public class Player_data{
	private String Name;
	private char[][] MandH = new char[10][10];
	private static char[][] Ships_Location = new char[10][10];
	private boolean turn;
	private static Vector<String> Ship_Desc = new Vector<String>();
	private static Vector<Integer> Ship_Size = new Vector<Integer>();
	private static Vector<Character> Ship_Char = new Vector<Character>();
	public char[][] MandH(){
		return MandH;
	}
	
	public char[][] getShipLoca(){
		return Ships_Location;
	}
	public Player_data ComShipGuess(Player_data play){
		int x,y;
		do{
			x = RandomNum(10);
			y = RandomNum(10);
		}while(MandH[x][y] != '*');
		
		if (play.checkShipLocation(x, y) == false)
		{
			
		}
		return play;
	}
	public boolean checkShipLocation(int x, int y){
		if (Ships_Location[x][y] == '*'){
			return false;
		}else{
			return true;
		}
	}
	public void comShipPlacement(){
		int x,y,d = 0;
		for(int i = 0; i < Ship_Size.size(); i++)
		{
			
			for(int o = 0; o < Ship_Size.elementAt(i); o++){
				do{
					x = RandomNum(10);
					y = RandomNum(10);
					d = RandomNum(4);
				}while (findValidValue(x,y,d,Ship_Size.elementAt(i)) == false);
			}
		}
	}
	private static void setComShip(int x,int y,int d,int s, char c ){
		switch(d){
		case 0:
			for(int o = 0; o < s; o++ ){
				Ships_Location[x-o][y] = c ;
			}
			break;
		case 1:
			for(int o = 0; o < s; o++ ){
				Ships_Location[x+o][y] = c ;
			}
			break;
		case 2: 
			for(int o = 0; o < s; o++ ){
				Ships_Location[x][y-o] = c ;
			}
			break;
		case 3:
			for(int o = 0; o < s; o++ ){
				Ships_Location[x][y+o] = c ;
			}
			break;
		}
	}
	private static boolean findValidValue(int x,int y,int d,int s ){
		if (d == 0 && y - s >= 0  ){
			for(int i = 0; i < s; i++){
				if(Ships_Location[x][y-i] != '*'){
					return false;
				}
			}
			return true;
		}
		if (d == 1 && y + s <= 9  ){
			for(int i = 0; i < s; i++){
				if(Ships_Location[x][y+i] != '*'){
					return false;
				}
			}
			return true;
		}
		if (d == 2 && x - s >= 0  ){
			for(int i = 0; i < s; i++){
				if(Ships_Location[x-i][y] != '*'){
					return false;
				}
			}
			return true;
		}
		if (d == 3 && x + s <= 9  ){
			for(int i = 0; i < s; i++){
				if(Ships_Location[x+i][y] != '*'){
					return false;
				}
			}
			return true;
		}
		
		
		
		
			return false;
	}
	public  int getDirection(){
		Object[] options1 = {"Up","Down","Back","Forward"};

		return JOptionPane.showOptionDialog(null,
            "Choose ",
            "Enter a Number",
            JOptionPane.YES_NO_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE,
            null,
            options1,
            null);
		
	}
	public static int RandomNum(int i){
		Random rand = new Random();
		return (rand.nextInt(100) % i);
	}
	public void setName(String input){
		Name = input;
	}
	public String getName(){
		return Name;
	}
	public void setTurn(boolean in){
		turn = in;
	}
	public boolean getTurn(){
		return turn;
	}
	
	public void setShipInfo(){
		Ship_Desc.clear();
		Ship_Size.clear();
		Ship_Char.clear();
		Ship_Desc.add("Destroyer");
		Ship_Size.add(2);
		Ship_Char.add('A');
		Ship_Desc.add("Destroyer");
		Ship_Size.add(2);
		Ship_Char.add('B');
		Ship_Desc.add("Destroyer");
		Ship_Size.add(2);
		Ship_Char.add('C');
		Ship_Desc.add("battleship");
		Ship_Size.add(3);
		Ship_Char.add('D');
		Ship_Desc.add("battleship");
		Ship_Size.add(3);
		Ship_Char.add('E');
		Ship_Desc.add("cruiser");
		Ship_Size.add(5);
		Ship_Char.add('F');
		Ship_Desc.add("cruiser");
		Ship_Size.add(5);
		Ship_Char.add('G');
		Ship_Desc.add("Submarine");
		Ship_Size.add(7);
		Ship_Char.add('H');
		Ship_Desc.add("Aircraft Carrier");
		Ship_Size.add(9);
		Ship_Char.add('I');
	}

	public void setBoard(){
		for (int x = 0; x < 10; x++ ){
			for (int y = 0; y < 10; y++){
				MandH[x][y] = '*'; 
				Ships_Location[x][y] = '*';
			}
		}
	}
	
	public void setMandH(int y,int x , char z){
		MandH[x][y] = z;
	}
	public void setshplc(int y,int x , char z){
		Ships_Location[x][y] = z;
	}
	public void print(char h[][]){
		
		for (int x = 0; x < 10; x++ ){
			for (int y = 0; y < 10; y++){
				System.out.print(h[x][y]);
			}
			System.out.println();
		}
	}
	
	
	
	
	
}
