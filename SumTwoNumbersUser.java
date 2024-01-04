package JavaCodingInterview;
import java.util.*;
public class SumTwoNumbersUser {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your first number");
		int a=sc.nextInt();
		System.out.println("Enter your second number");
		int b=sc.nextInt();
		
		int sum=a+b;
		System.out.println("Sum of two numbers is : "+sum);
	}

}
