package ilkUygulama;

import java.util.HashSet;
import java.util.Set;

public class pointMain {
	public static void main(String[]args) {
		
		Set<point> points=new HashSet<point>();
		Set<Integer>intss=new HashSet<Integer>();
		point p2=new point(5,6);
		points.add(p2);
		points.add(new point( 3,4));
		points.add(new point (3,4));
		points.add(new point(5,7));
		System.out.println(points);
		for(point p: points) {
			System.out.println("("+p.getx()+","+p.gety()+")");
		}
		
		
	}

}
