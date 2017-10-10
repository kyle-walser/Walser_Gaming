package hangMan;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Vector;




import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import javafx.*;

public class Getlist {
	static Vector<String> List = new Vector<String>();
	public static void main(String[] args) {
		
		getList();
		System.exit(0);
	}
	private static void getList(){
		
		
		
		List = FillVector();
		
		
		
		
	}

	@SuppressWarnings("resource")
	private static Vector<String> FillVector(){
		Vector<String> out = new Vector<String>();
		FileReader fin = null;
		try {
			fin = new FileReader("WordList.txt");
			BufferedReader read = new BufferedReader(fin);
			String temp = "";
			temp = read.readLine();
			do{
			
				out.add(temp);
				temp = read.readLine();
			} while (temp != null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (int i = 0; i < out.size(); i++){
			
			List = addToFile(List,out.elementAt(i).split(" "));	
		}
		List.sort(null);
		
		for (int i = 1; i < List.size(); i++){
			
			if (List.elementAt(i).equals( List.elementAt(i - 1)) == true){
				List.removeElementAt(i);
				i = 1;
			}
		}
		
		try {
			FileWriter fn = new FileWriter("test.txt");
			PrintWriter o =  new PrintWriter(fn);
			for ( int i = 0; i < List.size();i++){
				o.println(List.elementAt(i));
			}
			o.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
		
	}
	private static String randomWord(Vector<String> in,int number){
		return in.elementAt(RandomNum(number));
	}
	private static Vector<String> addToFile(Vector<String> in, String[] out){
		
		for(String s : out){
			if (s.length() >= 4 && s.length() <= 9){
			
					in.add(s.toUpperCase());
			}
		   
		}
		
		for (int i = 0; i < in.size(); i++){
			
			for (int o = 0; o < in.elementAt(i).length(); o++){
				if ((in.elementAt(i).charAt(o) < 65 || in.elementAt(i).charAt(o) > 90)){

					o = in.elementAt(i).length();
					in.remove(i);
					i--;
				}
				
			}
			
			
		}
		
		
		return in;
	}
	public static int RandomNum(int num){
		Random rand = new Random();
		return (rand.nextInt(100) % num);
		
	}
	

}
