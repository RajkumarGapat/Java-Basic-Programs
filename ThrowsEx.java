package JavaCodingInterview;

public class ThrowsEx 
{
	public static void main(String[] args) throws InterruptedException
	{
		doStuff();
	}
	
	public static void doStuff() throws InterruptedException
	{
		doMoreStuff();
	}
	
	public static void doMoreStuff() throws InterruptedException
	{
		System.out.println("Heiiiii");
		Thread.sleep(1000);
		System.out.println("Hello");
	}
}
