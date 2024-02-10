package JavaCodingInterview;

public class MethodWithIfElse {
	
	static void checkAge(int age)

	{
		if(age<18)
		{
			System.out.println("Access denied");
		}
		
		else
		{
			System.out.println("Access granted");
		}
	}
	
	public static void main(String[] args) {
		checkAge(20);
		checkAge(18);
		checkAge(10);
	}
}
