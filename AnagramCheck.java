package JavaCodingInterview;

import java.util.*;
public class AnagramCheck {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		
		String x="SiLeNt is";
		String y="SILENT Si";
		
		x=x.replace(" ","");
		y=y.replace(" ","");
		
		x=x.toLowerCase();
		y=y.toLowerCase();
		
		char a[]=x.toCharArray();
		char b[]=y.toCharArray();

		Arrays.sort(a);
		Arrays.sort(b);
		
		boolean result=Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("Strings are Anagram");
		}
		else 
		{
			System.out.println("Strings are not Anagram");

		}

	}

}
