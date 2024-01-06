package JavaCodingInterview;
import java.util.Scanner;
public class SquareRootWithoutSqrtMethod {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int n=sc.nextInt();
		int sqrt=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				if(i*i==n)
				{
					sqrt=i;
				}
			}
		}
		if(sqrt==0)
		{
			System.out.println("No square root");
		}
		else 
		{
			System.out.println("Square root is "+sqrt);
		}
	}
}
