package w2shh1;
import java.util.Scanner;

public class sh1 {
	public static void main (String [] args) {	
		int b,c,d,f,g,h,i,j,k;
		System.out.println("enter a five digit no.=");
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		//12345
		b=a1/2000; //12345/2000 x 6= 12000 + 345
		c=a1/500;
		d=a1/200;
		f=a1/100;
		g=a1/50;
		h=a1/10;
		i=a1/5;
		j=a1/2;
		k=a1/1;
		System.out.println("\nno.of note of 2000 ="+b);
		System.out.println("\nno.of note of 500 ="+c);
		System.out.println("\nno.of note of 200 ="+d);
		System.out.println("\nno.of note of 100 ="+f);
		System.out.println("\nno.of note of 50 ="+g);
		System.out.println("\nno.of note of 10 ="+h);
		System.out.println("\nno.of coin of 5 ="+i);
		System.out.println("\nno.of coin of 2 ="+j);
		System.out.println("\nno.of coin of 1 ="+k);
		 
		
	}
}
