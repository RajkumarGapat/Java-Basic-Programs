package JavaCodingInterview;

public class StringBuilderEx 
{
	public static void main(String[] args) 
	{
		StringBuilder s1 = new StringBuilder();
		
		System.out.println(s1);              // empty string
		System.out.println(s1.hashCode());   // 2083562754
		System.out.println(s1.length());     // 0
		System.out.println(s1.capacity());   // 16 (by default capacity)
		s1.append("abc");   
		System.out.println(s1);             // abc
		System.out.println(s1.hashCode());  // 2083562754
		System.out.println(s1.length());    // 3
		System.out.println(s1.capacity());  // 16
		s1.append("def");
		System.out.println(s1.hashCode());  // 2083562754
		System.out.println(s1);             // abcdef      
	}
}
