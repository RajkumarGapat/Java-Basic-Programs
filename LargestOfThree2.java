package JavaCodingInterview;

public class LargestOfThree2 {
	
	public static void main(String[] args)
	{
		int a=10,b=50,c=30;
		if(a>b && a>c)    // if both conditions are true then only this loop executes here T && T ---> T    
		{
			System.out.println("a is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else
		{
			System.out.println("c is greater");
		}
	}
}

