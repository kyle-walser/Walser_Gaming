package hangMan;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Random;
import java.util.Vector;

import javax.swing.JOptionPane;

import javafx.*;

public class Getlist {
	public static void main(String[] args) {
		
		getList();
		System.exit(0);
	}
	private static void getList(){
		Vector<String> List= new Vector<String>();
		Vector<String> temp = new Vector<String>();
		FileReader fin = null;
		int o = 0;
		try {
			 fin = new FileReader("test.txt");
		} catch (FileNotFoundException e) {
			JOptionPane.showMessageDialog(null, "File Not Found");
		}
		BufferedReader in = new BufferedReader(fin);
		try {
			temp.add(in.readLine());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; temp.elementAt(i) != null;i++){
			
			try {
				temp.add(in.readLine());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}			
		}
		for ( int i = 0; i < temp.size() - 1 ;i++)
		{
			
			List = addToFile(List,temp.get(i).split(" "));
			
		}
		
		
			System.out.println(randomWord(List, List.size()));
		
	}
	private static String randomWord(Vector<String> in,int number){
		return in.elementAt(RandomNum(number));
	}
	private static Vector<String> addToFile(Vector<String> in, String[] out){
		for(String s : out){
			if (s.length() >= 4 && s.length() <= 9 && s.contains("/") == false && s.contains(":") == false && s.contains("0") == false ){
				
					in.add(s.toUpperCase());		
				
				 
			}
		   
		}
		
		
		return in;
	}
	public static int RandomNum(int num){
		Random rand = new Random();
		return (rand.nextInt(100) % num);
		
	}
	

}
