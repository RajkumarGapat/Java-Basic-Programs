package JavaCodingInterview;

public class StringBufferEx 
{
	public static void main(String[] args) 
	{
		StringBuffer s1 = new StringBuffer();
		
		System.out.println(s1);              // empty string
		System.out.println(s1.hashCode());   // 1239731077
		System.out.println(s1.length());     // 0               // length method
		System.out.println(s1.capacity());   // 16 (by default capacity)
		s1.append("abcdef");                                // append method
		System.out.println(s1);             // abcdef
		System.out.println(s1.hashCode());  // 1239731077
		System.out.println(s1.length());    // 6
		System.out.println(s1.capacity());  // 16
		s1.insert(3,"a");                                  // insert method
		System.out.println(s1.hashCode());  // 1239731077
		System.out.println(s1);             // abcadef  
		s1.delete(1, 3);                                  // delete method
		System.out.println(s1);             // aadef
	}
}