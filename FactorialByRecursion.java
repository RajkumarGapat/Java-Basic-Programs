package JavaCodingInterview;

public class FactorialByRecursion {
	static int fact=1;
	public static void main(String[] args)
	{
		int n=5;
		FactorialByRecursion ob= new FactorialByRecursion();
		ob.calcFact(n);
		
		System.out.println("Factorial of "+n+" is "+fact);
	}
	void calcFact(int n)
	{
		if(n>=1)
		{
			fact=fact*n;
			calcFact(n-1);
		}
	}

}
