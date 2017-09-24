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
	public static void main(String[] args) {
		
		getList();
		System.exit(0);
	}
	private static void getList(){
		Vector<String> List = new Vector<String>();
		JLabel lblL1 = new JLabel();
		List = FillVector();
		
		JFrame frame = new JFrame("HangMan");
		frame.setVisible(true);
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
		
		System.out.println(out.size());
		
		return out;
		
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
