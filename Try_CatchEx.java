package JavaCodingInterview;

public class Try_CatchEx 
{
	public static void main(String[] args) 
	{
		System.out.println("Statement 1");
		
		try
		{
			System.out.println(10/0);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(10/2);
		}
		
		System.out.println("Statement 3");
	}
}


//This program is normal termination or graceful termination 


//O/p ------->

//Statement 1
//5
//Statement 3

