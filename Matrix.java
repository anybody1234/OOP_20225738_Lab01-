import java.util.Scanner;
public class Matrix{
	public static void main(String args[]) 
	{
		 Scanner keyboard = new Scanner(System.in);
		 int m, n;
		 System.out.println("Nhap so hang cua mang: ");
		 n = keyboard.nextInt();
		 System.out.println("Nhap so cot cua mang: ");
		 m = keyboard.nextInt();
		 int[][] matrix1 = new int [n][m];
		 int[][] matrix2 = new int [n][m];
		 int[][] matrix3 = new int [n][m];
		 for(int i=0; i<n;i++) {
			 for(int j=0;j<m;j++) {
				 int x=i+1;
				 int y=j+1;
				 System.out.println("Nhap so hang a[" +x+"]"+"["+y+"] cua ma tran 1:");
				 matrix1[i][j] = keyboard.nextInt();
			 }
		 }
		 for(int i=0; i<n;i++) {
			 for(int j=0;j<m;j++) {
				 int x=i+1;
				 int y=j+1;
				 System.out.println("Nhap so hang a[" +x+"]"+"["+y+"] cua ma tran 2:");
				 matrix2[i][j] = keyboard.nextInt();
			 }
		 }
		 for(int i=0; i<n;i++) {
			 for(int j=0;j<m;j++) {
				 matrix3[i][j]=matrix1[i][j]+matrix2[i][j]; 
				 System.out.println( matrix3[i][j]+"  ");
			 }
			 System.out.println();
		 }
		 
		 
		 
	}
}