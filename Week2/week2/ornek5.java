package week2;

public class ornek5 {

	public static void main(String[] args) {
		WriteBinary(5);

	}
	public static void WriteBinary(int n) {
		if(n<0) {
			throw new IllegalArgumentException();
			
		}
		if(n>=2) {
			WriteBinary(n/2);
		}
		System.out.print(n%2);
	}


}
