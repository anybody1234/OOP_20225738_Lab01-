import java.util.Arrays;
import java.util.Scanner;
public class Array {
	public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        int n;
        float sum=0;
        System.out.println("Nhap so phan tu: ");
        n = keyboard.nextInt();
        float[] arr = new float[n];
        for(int i=0; i<n; i++) {
        	int a=1+i;
        	System.out.println("Nhap so hang thu " + a + ":");
        	arr[i] = keyboard.nextInt();
        	sum=sum+arr[i];
        }
        Arrays.sort(arr);
        System.out.println(" Mang sau khi sap xep la: ");
        for (float num : arr) {
            System.out.println(num + " ");
        }
        System.out.println(" Tong mang la: "+ sum);
        float avg=sum/n;
        System.out.println(" Trung binh mang la: "+ avg);
       
    }
}
