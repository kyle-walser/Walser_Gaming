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

public class ListData {
	private static Vector<String> List = new Vector<String>();
	private static String wordChoice = new String(); 
	private static String UserWord = new String();
	private static Vector<String> UserCorLet = new Vector<String>();
	private static Vector<String> UserInCorLet = new Vector<String>();
	public static void Main(String[] args) {
		setList();
		
	}

	@SuppressWarnings("resource")
	private static void setList(){
		
		FileReader fin = null;
		try {
			fin = new FileReader("WordList.txt");
			BufferedReader read = new BufferedReader(fin);
			String temp = "";
			temp = read.readLine();
			do{
			
				List.add(temp);
				temp = read.readLine();
			} while (temp != null);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	private static String randomWord(Vector<String> in,int number){
		return in.elementAt(RandomNum(number));
	}

	public static int RandomNum(int num){
		Random rand = new Random();
		return (rand.nextInt(100) % num);
		
	}
	

}
