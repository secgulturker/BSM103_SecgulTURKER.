package week2;

public class ornek2 {
	public static void main (String[]args) {
		double[]list1 = {1.5,4.3,7.0,19.5,25.1,46.2};
		System.out.println(isSorted(list1));
		
		
		}
	public static boolean isSorted(double[]list1) {
		for(int i=0; i<list1.length-1; i++ ) {
			if (list1[i]>list1[i+1]) {
				return false;
			}
		}
		return true;
	}
	
		}
	

