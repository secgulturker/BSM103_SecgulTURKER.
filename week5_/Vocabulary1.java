import java.io.*;
import java.util.*;
public class Vocabulary {

	public static void main(String[] args) throws FileNotFoundException {
	
     Scanner input = new Scanner (new File("test.txt"));
     
     ArrayList<String> list = new ArrayList<String>();
     
     list = getWords(input);
     System.out.println(list);
	}
	public static ArrayList<String> getWords(Scanner input) {
		
		ArrayList<String> words = new ArrayList<String>();
		while(input.hasNext()) {
		words.add(input.next().toLowerCase());
		}
		return words;
		
		
	}

}
