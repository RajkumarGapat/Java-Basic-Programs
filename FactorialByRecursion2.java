package JavaCodingInterview;
import java.util.Scanner; 
public class FactorialByRecursion2 {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your no : ");
		int n=sc.nextInt();
		int fact;
		FactorialByRecursion2 ob= new FactorialByRecursion2();
		fact = ob.calcFact(n);
		
		System.out.println("Factorial of "+n+" is "+fact);
	}
	int calcFact(int n)
	{
		if(n>=1)
		{
			return(n*calcFact(n-1));
		}
		return 1;
	}

}
