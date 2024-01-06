package JavaCodingInterview;

import java.util.Scanner;
public class ArmstrongCheck {
	
	public static void main(String[] args) {
		int n,rem,c,arm=0;
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any number : ");
		n=sc.nextInt();
		c=n;
		
		while(n>0)
		{
			rem=n%10;
			arm=(rem*rem*rem)+arm;
			n=n/10;
		}
		if(c==arm)
		{
			System.out.println(c+" is a armstrong number");
		}
		else System.out.println(c+" is not a armstrong number");
	}

}
