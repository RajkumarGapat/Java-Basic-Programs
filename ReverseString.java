package JavaCodingInterview;

//public class ReverseString 
//{
//	public static void main(String[] args)
//	{
//		String s="Sam";
//		String rev= "";
//		
//		for(int i=s.length()-1;i>=0;i--)
//		{
//			rev=rev+s.charAt(i);
//		}
//		System.out.println(rev);
//	}
//
//}

// incremental for loop ...

public class ReverseString 
{
	public static void main(String[] args)
	{
		String s="Sam";
		String rev= "";
		
	    for (int i = 0; i < s.length(); i++) 
	    {
	        rev = s.charAt(i) + rev;
	    }
		System.out.println(rev);		
	}
}
