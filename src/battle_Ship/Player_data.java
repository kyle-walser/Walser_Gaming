package battle_Ship;

import java.util.Random;
import java.util.Vector;

public class Player_data{
	private String Name;
	private String[][] Miss;
	private String[][] Hits;
	private String[][] Ships_Location;
	private boolean turn;
	private static Vector<String> Ship_Desc = new Vector<String>();
	private static Vector<Integer> Ship_Size = new Vector<Integer>();
	
	public static int RandomNum(int num){
		Random rand = new Random();
		return (rand.nextInt(100) % num);
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
		Ship_Desc.add("Destroyer");
		Ship_Size.add(2);
		Ship_Desc.add("Destroyer");
		Ship_Size.add(2);
		Ship_Desc.add("Destroyer");
		Ship_Size.add(2);
		Ship_Desc.add("battleship");
		Ship_Size.add(3);
		Ship_Desc.add("battleship");
		Ship_Size.add(3);
		Ship_Desc.add("cruiser");
		Ship_Size.add(5);
		Ship_Desc.add("cruiser");
		Ship_Size.add(5);
		Ship_Desc.add("Submarine");
		Ship_Size.add(7);
		Ship_Desc.add("Aircraft Carrier");
		Ship_Size.add(9);
	}
	public void setBoard(){
		for (int x = 0; x < 100; x++ ){
			for (int y = 0; y < 100; y++){
				Hits[x][y] = "*"; 
				Miss[x][y] = "*";
			}
		}
	}
	public void print(){
		
		for (int x = 0; x < 100; x++ ){
			for (int y = 0; y < 100; y++){
				System.out.print(Hits[x][y]);
			}
			System.out.println();
		}
	}
	
	public void autoSetShip(){
		
		
		
	}
	
	
	
}
