package ilkUygulama;
import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class Test {
public static void main(String[]args) {
	int data[]= {8,5,3,4,7,9};
	Queue<Integer>q=new LinkedList<Integer>(); 
	for(int n: data) {
		q.add(n);
		
		System.out.println("queue ="+q);
		removeAll(3);
		System.out.println("queue="+q);
		
	}
		
	public static void removeAll(Queue<Integer> q, int value )	{
		int size=q.size();
		for(int i=0; i<size ;i++) {
			int n=q.remove();
			System.out.println(n+"elemaný çýkartýldý");
			System.out.println("current queue=+q");
			int value;
			if(n!=value) {
				q.add(n);
				
				System.out.println(n+"elemaný eklendi");
			}
		}
	
}

	
	

}
