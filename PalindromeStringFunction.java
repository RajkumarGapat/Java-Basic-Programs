package JavaCodingInterview;
import java.util.Scanner;

class PalindromeStringFunction
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your string : ");
		String str = sc.nextLine();
        String cleanStr = str.replaceAll("\s", "").toLowerCase();

		
		if(isPalindromeString(cleanStr))
		{
			System.out.println(str+" is palindrome string.");
		}
		else
		{
			System.out.println(str+" is not a palindrome string.");
		}
		
	}
	
	public static boolean isPalindromeString(String str)
	{
		String rev="";
		
		for(int i=str.length()-1; i>=0; i--)
		{
			rev=rev + str.charAt(i);
		}
		
		return str.equals(rev);
	}
}




