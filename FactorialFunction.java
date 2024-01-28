package JavaCodingInterview;
import java.util.*;
public class FactorialFunction 
{
   public static int Factorial (int a)
   {    
	   
	   int fact=1;
	   
	   
	  for (int i=1;i<=a;i++)
	  {
		  fact=fact*i;
	  }
	  System.out.println("Factorial of " +a+ " is --> "+fact);
		   
	   return fact;
   }
   
   public static void main(String[] args)
   {
	   Scanner sc=new Scanner(System.in);
       System.out.print("Enter your number : ");
       int a=sc.nextInt();
       FactorialFunction ob=new FactorialFunction();
	   ob.Factorial(a);
	   
  }
	
  
}
