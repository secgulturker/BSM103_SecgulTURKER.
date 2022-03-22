package uygulama;

public class pointMain {

	public static void main(String[] args) {
	 
		Point p1=new Point(8,24);
		Point p2=new Point(3,12);
		
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzakligi="+p1.distanceFromOrigin());
		
		System.out.println("p2("+p2.getX()+","+p2.getY()+")");
		System.out.println("orijine uzakligi="+p2.distanceFromOrigin());
		
		p1.translate(5,6 );
		System.out.println("p1("+p1.getX()+","+p1.getY()+")");
		System.out.println("orijine uzakligi="+p1.distanceFromOrigin());
		System.out.println("p1="+p1);
		
		p2.translate(11, 4);
		System.out.println("p2("+p2.getX()+","+p2.getY()+")");
		System.out.println("orijine uzakligi="+p2.distanceFromOrigin());
		System.out.println("p2="+p2);
		
		

	}

}
