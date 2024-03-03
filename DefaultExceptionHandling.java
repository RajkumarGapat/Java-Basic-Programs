package JavaCodingInterview;

public class DefaultExceptionHandling 
{
	public static void main(String[] args) 
	{
		doStuff();
	}
	
	public static void doStuff()
	{
		doMoreStuff();
	}
	
	public static void doMoreStuff()
	{
		System.out.println(10/0);
	}
}



// This program compiles finely but at runtime exception is occured

//O/p ---------->
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//at PracticePrgramsJava/JavaCodingInterview.DefaultExceptionHandling.doMoreStuff(DefaultExceptionHandling.java:17)
//at PracticePrgramsJava/JavaCodingInterview.DefaultExceptionHandling.doStuff(DefaultExceptionHandling.java:12)
//at PracticePrgramsJava/JavaCodingInterview.DefaultExceptionHandling.main(DefaultExceptionHandling.java:7)

// Above all this information is printed by Default exception handler
// This program is abnormal termination

