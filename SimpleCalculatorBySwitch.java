package JavaCodingInterview;
import java.util.*;

public class SimpleCalculatorBySwitch{
	
	public static void main(String[] args) {
		
	    Scanner sc =  new Scanner(System.in);
	    System.out.println("***** Welcome *****");
	    System.out.println("Enter your first number :  ");
	    double a=sc.nextInt();
	    System.out.println("Enter your second number :  ");
	    double b=sc.nextInt();
	    System.out.println("Choose any option :");
	    System.out.println("1. for +");
	    System.out.println("2. for -");
	    System.out.println("3. for *");
	    System.out.println("4. for /");
	    System.out.println("Enter your option : ");
        int op=sc.nextInt();
        
	    switch (op)
	    {
	    case 1:
	    {
	    	double result = a + b;
	    	System.out.println("Addition is : "+result);
	    	break;
	    }
	    case 2:
	    {
	    	double result = a - b;
	    	System.out.println("Subtraction is : "+result);
	    	break;
	    }
	    case 3 :
	    {
	    	double result = a * b;
	    	System.out.println("Multiplication is : "+result);
	    	break;
	    }
	    case 4 :
	    {
	    	double result = a + b;
	    	System.out.println("Division is : "+result);
	    	break;
	    }
	    default :
	    {
	    	System.out.println("Invalid Input");
	    }
	    
	    }
		
	}
}

