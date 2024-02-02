package JavaCodingInterview;

interface FirstInterface
{
	public void firstMethod();
}
interface SecondInterface
{
	public void secondMethod();
}

class Demo implements FirstInterface, SecondInterface
{
	public void firstMethod()
	{
		System.out.println("This is first method from first interface.");
	}
	public void secondMethod()
	{
		System.out.println("This is second method from second interface.");
	}
}


public class MultipleInterfaceEx 
{
	public static void main(String[] args) 
	{
		Demo d=new Demo();
		d.firstMethod();
		d.secondMethod();
	}

}
