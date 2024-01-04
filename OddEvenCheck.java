package JavaCodingInterview;
import java.util.Scanner;
public class OddEvenCheck {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter your number : ");
		int a=sc.nextInt();
		
		if(a%2==0)
		{
			System.out.println(a+" is even number.");
		}
		else
		{
			System.out.println(a+" is odd number.");

		}
	}

}
