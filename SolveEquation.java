import javax.swing.JOptionPane;
import java.util.Scanner;
public class SolveEquation{
	public static void main(String args[]) {
		 Scanner keyboard = new Scanner(System.in);
	     int n;
		 do {
		 System.out.println("Nhap phuong trinh ban can giai voi 1-phuong trinh bac nhat, 2-he phuong trinh 2 an, 3-phuong trinh bac 2: ");
		 n = keyboard.nextInt();}
		 while(n>3 || n<1);
		 switch(n) {
		 case 1:
			 System.out.println("Nhap he so cua x");
			 float a= keyboard.nextInt();
			 System.out.println("Nhap he so tu do");
			 float b= keyboard.nextInt();
			 if(a==0 && b!=0 )
				 System.out.println("Phuong trinh vo nghiem");
			 if(a==0 && b==0 )
				 System.out.println("Phuong trinh vo so nghiem");
			 if(a!=0)
			 {
				 float c=-b/a;
				 System.out.println("Nghiem x="+c);
			 }
			 break;
		 case 2:
			 System.out.println("Nhap he so cua x");
			 float d= keyboard.nextInt();
			 System.out.println("Nhap he so tu do cua x");
			 float e= keyboard.nextInt();
			 System.out.println("Nhap ket qua phuong trinh thu nhat");
			 float f= keyboard.nextInt();
			 System.out.println("Nhap he so cua y");
			 float g= keyboard.nextInt();
			 System.out.println("Nhap he so tu do cua y");
			 float h= keyboard.nextInt();
			 System.out.println("Nhap ket qua phuong trinh thu hai");
			 float i= keyboard.nextInt();
			 float D, D1, D2;
			 D=d*h-g*e;
			 D1=h*f-e*i;
			 D2=d*i-f*g;
			 if(D!=0){
		           float x1=D1/D;
		           float x2=D2/D;
		           System.out.println( "Nghiem duy nhat x1="+x1+" x2="+x2);
		        }
		        else{
		            if(D1==0&&D2==0){
		            	System.out.println( "He co vo so nghiem");
		            }
		            else{
		            	System.out.println( "He vo nghiem");
		            }
		        }
			 break;
		 case 3:
			 System.out.println("Nhap he so cua x^2");
			 float k= keyboard.nextInt();
			 System.out.println("Nhap he so cua x");
			 float l= keyboard.nextInt();
			 System.out.println("Nhap he so tu do");
			 float m= keyboard.nextInt();
			 float delta;
			 if(k!=0){
		            delta=l*l-4*k*m;
		            if(delta>0){
		                double x1=(-l + Math.sqrt(delta))/(2*k);
		                double x2=(-l- Math.sqrt(delta))/(2*k);
		                System.out.println("Phuong trinh co 2 nghiem: "+"x1="+x1+" x2="+x2);
		            }
		            else if(delta==0){
		                float x3=(-l)/(2*k);
		                System.out.println("Phuong trinh co nghiem kep x="+x3);
		            }
		            else{
		            	System.out.println( "Phuong trinh vo nghiem");
		            }
		        }
		        else{
		            if(l!=0){
		                float x4=-m/l;
		                System.out.println("Phuong trinh co 1 nghiem x="+x4);
		            }
		            else{
		                if(m==0){
		                	System.out.println("Phuong trinh co vo so nghiem");
		                }
		                else{
		                	System.out.println("Phuong trinh vo nghiem");
		                }
		            }
		        }
		
		 }		 
	}
}