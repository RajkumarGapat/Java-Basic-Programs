// Exception handling concept with try catch block...


package JavaCodingInterview;

public class WithTryCatch {
	
	public static void main(String[] args) {
		
		System.out.println("Statement 1");
		
		try
		{
			System.out.println(10/0);			// exception raised
		}
		catch(ArithmeticException e )
		{   
			System.out.println(10/2);    // exception handled

		}
		System.out.println("Statement 3");	
	}

}


//O/p ------->
//Statement 1
//5
//Statement 3

//normal termination or graceful termination
