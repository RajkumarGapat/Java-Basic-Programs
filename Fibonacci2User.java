package JavaCodingInterview;
import java.util.*;

public class Fibonacci2User {
	public static void main (String [] args) {
		int a, b, c, n;
		System.out.println("Enter Two Numbers : ");
		Scanner sc= new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("Enter size : ");
		n = sc.nextInt();
		
		System.out.println("Fibonacci Series are : ");
		System.out.print(a+ " "+b);
		
		for (int i=1;i<=n;i++)
		{
			c = a+b;
			System.out.print(" "+c);
			a = b;
			b = c; 
		}
	}
}
