//Fibonacci Series in Java without using recursion

package JavaCodingInterview;

public class Fibonacci1
{
	public static void main(String[] args) 
	{
		int a=0, b=1;
		
		System.out.print(a+" "+b);  //printing 0 and 1 
		int c;
		for(int i=1;i<=10;i++)     //loop starts from 2 because 0 and 1 are already printed
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
}



