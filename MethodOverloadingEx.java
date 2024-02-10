package JavaCodingInterview;

public class MethodOverloadingEx 
{
	static int add(int a, int b)
	{
		return a+b;
	}
	
	static float add(float a, float b, float c)
	{
		return a+b+c;
	}
	
	static double add(double a, double b)
	{
		return a+b;
	}
	
	static String add(String a, String b)
	{
		return a +  b;
	}
	
	public static void main(String[] args) {
		
		int myNum = add(5,5);
		float myFloat = add(5.0f,5.0f,5.0f);
		double myDouble = add(5,5);
		String myString = add("Raj"," Gapat");
		
		System.out.println("Integer : "+myNum);
		System.out.println("Float : "+myFloat);
		System.out.println("Double : "+myDouble);
		System.out.println("String : "+myString);
	}
}
