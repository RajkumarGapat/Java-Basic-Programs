
// valueOf() method converts character into string type

package JavaCodingInterview;

public class ValueOfMethod 
{
	public static void main(String[] args) 
	{
		char z[] = {'a','b','c','d','e'};
		
		String s1 = String.valueOf(z);
		System.out.println(s1);          // abcde ------> String valueOf(Array reference variable)
		String s2 = String.valueOf(z, 1, 3);
		System.out.println(s2);          // bcd     ------> public static String valueOf(char ch[],int offset, int count)
	}
}


