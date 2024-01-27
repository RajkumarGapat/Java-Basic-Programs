package JavaCodingInterview;
import java.util.*;
public class Factorial1 {
	
	public static void main(String[] raj
			)
	{
		Scanner sc = new Scanner(System.in);
		   
		System.out.println("Enter your number : ");
		int a=sc.nextInt() ;
		int fact=1;
		
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of "+a+" is "+fact);
	}

}
