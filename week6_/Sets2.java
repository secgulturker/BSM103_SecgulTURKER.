package ilkUygulama;

import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.io.File;

public class Sets2 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		Set<String>Words=new HashSet<String>();
		
		Words =read();
		System.out.println(Words);
		
		for(String words:read()) {
			Words.add(words);
			System.out.println(Words);
			
		}
		public static Set<String>() throws FileNotFoundException{
			System.out.println("okumak istediðiniz dosya ismi:");
			Scanner input=new Scanner(System.in);
			String file=input.next();
			
			Scanner in= new Scanner(new File(file));
			Set<String>temp=new HashSet<String>();
			while(in.hasNext()) {
				String.words=in.nextLine().toLowerCase();
				temp.add(word);		
				
				
				
				
			}
			return temp;
				
			}
		
		

	}

	private static Set<String> read() {
		// TODO Auto-generated method stub
		return null;
	}

	

	

}
