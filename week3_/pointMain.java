
public class pointMain {

	public static void main(String[] args) {

		Point point1 = new Point();
		point1.x = 4;
		point1.y = -9;
		
		Point point2 = new Point ();
		point2.x = -3;
		point2.y = 3;
		
		System.out.println("point1 = ("+point1.x+","+point1.y+")");
		double dist1 = Math.sqrt(point1.x * point1.x + point1.y * point1.y);
		System.out.println("distance from orijin = " + dist1);
		
		
		System.out.println("point2 = ("+point2.x+","+point2.y+")");	
		double dist2 = Math.sqrt(point2.x * point2.x + point2.y * point2.y);
		System.out.println("distance from orijin = " + dist2);
		
		//translate new location
		point1.x += 7;
		point1.y += 4;
		point2.x += 6;
		point2.y += 9;
		System.out.println("point1 = ("+point1.x+","+point1.y+")");
		System.out.println("point2 = ("+point2.x+","+point2.y+")");
		
	}

}
