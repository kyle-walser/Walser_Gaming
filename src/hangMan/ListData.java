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
	protected static Vector<String> List = new Vector<String>();
	protected static String wordChoice = new String(); 
	protected static String UserWord = new String();
	protected static Vector<String> UserCorLet = new Vector<String>();
	protected static Vector<String> UserInCorLet = new Vector<String>();
	
	public static void main(String[] args){
		
	}

	@SuppressWarnings("resource")
	/*ListData(){
		setList();
	}*/
	protected void setList(){
		
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
	protected void SetWord(){
		 wordChoice = List.elementAt(RandomNum(List.size())).toUpperCase();
	}
	protected static String GetWord(){
		return wordChoice;
	}
	protected void checkWord(String in){
		if (GetWord().contains(in) == true){
			
		}else{
			addWrongCharList(in);
		}
	}

	public static int RandomNum(int num){
		Random rand = new Random();
		return (rand.nextInt(100) % num);
		
	}
	protected static void addWrongCharList(String in){
		UserInCorLet.add(in);
	}
	protected static int getWrongNumber(){
		return UserInCorLet.size();
	}
	protected static void resetWrongList(){
		UserInCorLet.clear();
	}
	protected static void resetRightList(){
		UserCorLet.clear();
	}
	protected static void addRightList(String in){
		UserCorLet.add(in);
	}
	protected void setIniUserWord(){
		for (int i = 0; i <GetWord().length();i++){
			
		}
	}
	protected static String replaceChar(String in){
		
		char[] myNameChars = in.toCharArray();
		myNameChars[4] = 'x';
		return String.valueOf(myNameChars);
	}
	protected static String getListSize(){
		return Integer.toString(List.size());
	}
	protected static void setUserWord(String in){
		UserWord = in;
	}
	protected static String getUserWord(){
		return UserWord;
	}
	
	
	

}
