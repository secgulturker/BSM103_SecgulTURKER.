package ilkUygulama;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {
	public static void main(String[]args) throws FileNotFoundException{
		countWords();
		
		
	}

public static void countWords() throws FileNotFoundException{
	Scanner input=new Scanner(new File("test.txt"));
	Set<String>words=new HashSet<String>();
	
	while(input.hasNext()) {
		
		String Words=input.next().toLowerCase();
		
		words.add(Words);
		
	}
System.out.println("Kelimeler:"+words);	
System.out.println("Kelime sayisi:" +words.size());


for(String word:words) {
	System.out.println();
}
	}

	
	
	
}
