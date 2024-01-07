
// Conversion of character array to string

package JavaCodingInterview;

public class CharArrayToString {
	public static void main(String[] args) {
		
		char ch[]= {'a', 'b', 'c', 'd'};
		String s1= String.valueOf(ch);
		System.out.println(" S1 value : "+s1);
		
		
		
		            //or
		String s2= new String(ch);
		System.out.println(" S2 value : "+s2);	
	}

}
