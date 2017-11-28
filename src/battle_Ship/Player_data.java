package battle_Ship;

import java.util.Random;
import java.util.Vector;

public class Player_data{
	private String Name;
	private char[][] Miss = new char[10][10];
	private char[][] Hits = new char[10][10];
	private char[][] Ships_Location = new char[10][10];
	private boolean turn;
	private static Vector<String> Ship_Desc = new Vector<String>();
	private static Vector<Integer> Ship_Size = new Vector<Integer>();
	private static Vector<Character> Ship_Char = new Vector<Character>();
	public char[][] getMiss(){
		return Miss;
	}
	public char[][] getHit(){
		return Hits;
	}
	public char[][] getShpLoca(){
		return Ships_Location;
	}
	
	public static int RandomNum(){
		Random rand = new Random();
		return (rand.nextInt(100) % 100);
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
				Hits[x][y] = '*'; 
				Miss[x][y] = '*';
			}
		}
	}
	public void print(char h[][]){
		
		for (int x = 0; x < 10; x++ ){
			for (int y = 0; y < 10; y++){
				System.out.print(h[x][y]);
			}
			System.out.println();
		}
	}
	
	public void autoSetShip(){
		
		
		
	}
	
	
	
}
