import java.util.*;
public class StackExample {
	public static void main(String[]args) {
		
		String data[]= {"java","php","python","C","c++"};
		
		Stack<String> s= new Stack<String>();
		for(String word:data) {
			s.push(word);
			
		}
		System.out.println("Stack = " +s);
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println(s.peek());
		System.out.println(s.pop());
		System.out.println("Stack = " +s);
		System.out.println(s.size());
		
		while(!s.isEmpty())
			System.out.println(s.pop());
		    System.out.println("Stack = " +s);
		
	}

}
