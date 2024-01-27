package JavaCodingInterview;
import java.util.Scanner;

public class PalindromeNumberFunction 
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter your number : ");
		int num=sc.nextInt();
		
		if(isPalindromeNumber(num))
		{
			System.out.println(num+" is a palindrome number");
		}
		else
		{
			System.out.println(num+" is not a palindrome number");
		}
	}
	
	public static boolean isPalindromeNumber(int num)
	{
		int temp = num;
		int rev = 0;
		int rem;
		
		while(num != 0)
		{
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		
		return temp == rev;
	}
	

}
