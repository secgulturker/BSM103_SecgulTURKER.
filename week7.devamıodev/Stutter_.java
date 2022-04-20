import java.util.*;
public class Stutter {

	public static void main(String[] args) {
  
	int data [] = {3,4,8,9,1};
        
		Queue<Integer> q = new LinkedList<Integer>();
		for(int n : data)
			q.add(n);
		System.out.println(q);
		
		Stack <Integer> s = new Stack<Integer> ();
		while(!q.isEmpty()) {
			s.push(q.remove());
		}
		
        while(!s.isEmpty()) {
        	q.add(s.pop());
        }
		System.out.println(q);
	    stutter(q);
	    System.out.println(q);
	

}

  public static void stutter(Queue<Integer> q) {
	
	int size = q.size();
	System.out.println(size);
	while(size>0) {
	    int temp = q.remove();
	    q.add(temp);
	    q.add(temp);
	    size--;
}
}

}
