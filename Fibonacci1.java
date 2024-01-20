//Fibonacci Series in Java without using recursion

package JavaCodingInterview;

public class Fibonacci1
{
	public static void main(String[] args) 
	{
		int a=0, b=1;
		
//		System.out.print(a+" "+b);  //printing 0 and 1 
		
		int c=0;
		
		for(int i=1;i<=10;i++)     //( i=1; 1<=10) (i=2;2<=10) 
		{
			c=a+b;  //(c=1 c=2
			a=b;    //(a=1 a=1
			b=c;    //(b=1 b=2
			System.out.print(" "+c);    // (print -1 2
		}
	}
}



