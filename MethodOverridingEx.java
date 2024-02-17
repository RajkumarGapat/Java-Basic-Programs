package JavaCodingInterview;

class Sample 
{
	void show()
	{
		System.out.println("Parent class method");
	}
}

public class MethodOverridingEx extends Sample
{
	void show()
	{
		super.show();
		System.out.println("Child class method");

	}
	
	public static void main(String[] args) 
	{
		Sample s = new Sample();
		s.show();
		
	}
}
