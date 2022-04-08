package ilkUygulama;




		import java.util.HashMap;
		import java.util.Map;
		import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Set;
		 public class Maps2{

			public static  void main(String[]args ) {
				Map<Integer,String> citys=new TreeMap<Integer,String>();
				
				citys.put(34, "Istanbul");
				citys.put(6," Ankara");
				citys.put(35, "Ýzmir");
				citys.put(58, "Sivas");
				
				System.out.println(citys);
				System.out.println("Ýndeksler-Keys"+citys.keySet());
				System.out.println(citys.values());
				System.out.println(citys.get(35));
				Map<Integer,Set<String>>citys2=new HashMap<Integer,Set<String>>();
				
			

			citys2.put(34,new TreeSet<String>());
			citys2.get(34).add("Istanbul");
			citys2.get(34).add("Sultangazi");
			citys2.get(34).add("Besiktas");
			citys2.get(34).add("Fatih");
				
			}
				
				
				
				
			
			
}
