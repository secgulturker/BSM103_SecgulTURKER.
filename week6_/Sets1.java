package ilkUygulama;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class Sets1 {
	public static void main(String[]args) {
		ArrayList<String>lists=new ArrayList<String>();

		
		
		lists.add("bilgisayar");
		lists.add("kitap");
		lists.add("meyve");
		lists.add("defter");
		lists.add(3,"çikolata");
		lists.add("kiraz");
		
		Set<String>sets=new TreeSet<String>();
		sets.add("bilgisayar");
		sets.add("kitap");
		sets.add("meyve");
		System.out.println(sets);
		System.out.println(sets.size());
		System.out.println(sets.contains("su"));
		sets.clear();
		System.out.println(sets);
		sets.addAll(lists);
		
		System.out.println(sets);
		System.out.println(lists.get(2));
		
		
		
	}

}
