package JavaCodingInterview;

import java.util.Scanner;

public class ArmstrongCheckFunction 
{
	
	public static boolean isArmstrongNumber(int n)
	{
		int originalNumber=n;
		int arm=0;
		
		while(n>0)
		{
			int rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		return originalNumber == arm;
	}

public static void main(String[] args)
{
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter any number:");
	int n = sc.nextInt();
	
	  if (isArmstrongNumber(n)) 
	  {
          System.out.println(n + " is an Armstrong number");
      } 
	  else 
	  {
          System.out.println(n + " is not an Armstrong number");
      }
}
}
