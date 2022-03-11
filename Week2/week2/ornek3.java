package week2;

public class ornek3 {

	public static void main(String[] args) {
	int[]dizi1 = {{1,2,3},{2,5,3},{3,6,5}};
	int[]dizi2 = {{5,3,4},{2,4,7},{1,3,4}};
		
		System.out.println(matrixAdd(dizi1),(dizi2));
		

	}
	public static int[][] matrixAdd(int [][]dizi1 ,int[][]dizi2) {
		int [][]dizi3= new int[dizi1.length][dizi1.length];
		
		 for (int i = 0; i < dizi1.length; i++) {
			for (int j = 0; j<dizi1.length ; j++) {
	
				dizi3[i][j]=dizi1[i][j]+dizi2[i][j];
			
			}
		}
	  return dizi3;
	}
}
