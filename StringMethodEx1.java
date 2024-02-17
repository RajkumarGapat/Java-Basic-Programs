package JavaCodingInterview;

public class StringMethodEx1 
{
	public static void main(String[] args) 
	{
		String s1 = "Raj";
		String s2 = "Raj";
		String s3 = "raj";
		
		System.out.println(s1);     // Raj
		System.out.println(s2);     // Raj
		System.out.println(s1);     // Raj

		
		System.out.println(s1.hashCode());     // 81915
		System.out.println(s2.hashCode());     // 81915
		System.out.println(s3.hashCode());     // 112667

		System.out.println(s1==s2);           // true
		System.out.println(s1==s3);           // false
		System.out.println(s2==s3);           // false
		System.out.println(s1.equals(s2));    // true
		System.out.println(s1.equals(s3));    // false
		System.out.println(s2.equals(s3));    // false
		
		System.out.println(s1.equalsIgnoreCase(s3));    // true
		
		System.out.println(s1.length());           // 3   ------> length() Method...

	}

}
