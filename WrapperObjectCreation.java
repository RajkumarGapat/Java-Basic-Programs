package JavaCodingInterview;

public class WrapperObjectCreation 
{
	  public static void main(String[] args) 
	  { 
	    Integer myInt = 5; 
	    Double myDouble = 5.99; 
	    Character myChar = 'A'; 
	    System.out.println(myInt);  // 5
	    System.out.println(myDouble);   // 5.99 
	    System.out.println(myChar);    // A
	    
	    
	    // Using wrapper methods ----->
	    System.out.println(myInt.intValue());  // 5
	    System.out.println(myDouble.doubleValue());   // 5.99 
	    System.out.println(myChar.charValue());   // A
	    
	  }
}
