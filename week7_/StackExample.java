package ilkUygulama;

import java.util.Stack;

public class StackExample {

	public static void main(String[]args) {
		String[] data= {"elma","kiraz","çilek","karpuz","pizza"};
		
		Stack<String>s=new Stack<String>();
		for(String word: data) {
			s.push(word);
			
		}
	System.out.println("Stack="+s);	
	System.out.println(s.peek());
	System.out.println(s.pop());
	System.out.println("Stack="+s);
	System.out.println(s.size());
		
	}
}
