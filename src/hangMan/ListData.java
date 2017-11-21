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
	protected boolean checkRightList(String in){
		for (int i = 0; i < UserCorLet.size(); i++){
			System.out.println(in + "  "  + UserCorLet.elementAt(i));
			if (in == UserCorLet.elementAt(i) ){
				return true;
			}
		}
		return false;
	}
	protected boolean checkWrongList(String in){
		for (int i = 0; i < UserInCorLet.size(); i++){
			if (in == UserInCorLet.elementAt(i) ){
				return true;
			}
		}
		return false;
	}
	protected void SetWord(){
		 wordChoice = List.elementAt(RandomNum(List.size())).toUpperCase();
	}
	protected String GetWord(){
		return wordChoice;
	}
	
	protected boolean checkWord(String in){
		if (GetWord().contains(in) == true){
			
			for (int i = 0; i < GetWord().length();i++){
				if (in.charAt(0) == GetWord().charAt(i)){
					setUserWord(replaceChar(getUserWord(), i, in));
				}
			}
			return true;
		}else{
			//addWrongCharList(in);
			return false;
			
		}
	}

	public static int RandomNum(int num){
		Random rand = new Random();
		return (rand.nextInt(100) % num);
		
	}
	protected String getCharUserChoice(){
		return  UserCorLet.elementAt(UserCorLet.size());
	}
	protected static void addWrongCharList(String in){
		UserInCorLet.add(in);
	}
	protected int getWrongNumber(){
		return UserInCorLet.size();
	}
	protected static void resetWrongList(){
		UserInCorLet.clear();
	}
	protected static void resetRightList(){
		UserCorLet.clear();
	}
	protected void addRightList(String in){
		UserCorLet.add(in);
	}
	protected static String getCharItem(int in){
		return UserCorLet.elementAt(in);
	}
	protected void setIniUserWord(){
		for (int i = 0; i < GetWord().length();i++){
			setUserWord(getUserWord() + "*");
		}
	}
	protected boolean checkUserWin(){
		if (getUserWord().contains("*") == true){
			return false;
		}else{
			return true;
		}
	}
	protected static String replaceChar(String in, int x, String c){
		
		char ch = c.charAt(0);
		char[] myNameChars = in.toCharArray();
		myNameChars[x] = ch;
		return String.valueOf(myNameChars);
	}
	protected static String getListSize(){
		return Integer.toString(List.size());
	}
	protected static void setUserWord(String in){
		UserWord = in;
	}
	protected String getUserWord(){
		return UserWord;
	}
	protected static void resetUserWord(){
		UserWord = "";
	}
	protected void resetGame(){
		resetUserWord();
		SetWord();
		setIniUserWord();
		resetRightList();
		resetWrongList();
		
	}
	
	
	

}
