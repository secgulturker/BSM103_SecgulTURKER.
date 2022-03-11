package week2;

public class ornek4 {

	public static void main(String[] args) {
    System.out.println(sumTo(3));
    
	}
	
    public static double sumTo(int n) {
    	if(n<0) {
    		throw new IllegalArgumentException();
    		
    	}
    	
    	if(n==0) {
    		return 0;
    	}
    	return 1.0/n+(double)sumTo(n-1);
    }
}
