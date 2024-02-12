package JavaCodingInterview;

public class WrapperObjectToString 
{
     public static void main(String[] args) 
     { 
    	 Integer myInt = 100; 
		 String myString = myInt.toString();
		 System.out.println(myString.length());  // 3
		 
		 Character ch = 'S';
		 String s1 = ch.toString();
		 System.out.println(s1.length());  // 1

     }
}


