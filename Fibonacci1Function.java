package JavaCodingInterview;

public class Fibonacci1Function {
	
	public static void generateFibonacci(int n)
	{
		int a=0, b=1;
		
		for(int i=1;i<n;i++)
		{
			int c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
			
		}
	}
	
	public static void main(String[] args) {
		int n=10;
		
		System.out.println("The first "+n+ " numbers of the fibonacci series are : ");
	    generateFibonacci(n);
	}

}
