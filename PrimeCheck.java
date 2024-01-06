//1...Prime Number

package JavaCodingInterview;


import java.util.*;

public class PrimeCheck
{
  public static void main(String[] args)
  {
      int num,i,count=0;
      System.out.println("Enter any number");
      Scanner sc = new Scanner(System.in);
      num=sc.nextInt();
      for(i=1;i<=num;i++) // Starts a loop from 1 to the given number 'num'
      {
          if(num%i==0)    // Checks if the number is divisible by 'i' without a remainder
          {
              count++;    // Increments the 'count' variable if 'i' is a divisor of 'num'
          }
      }
      if(count==2)   // Checks if the count of divisors is 2 (prime numbers have only 2 divisors: 1 and the number itself)
      {
          System.out.println("Prime Number");
      }
      else
      {
          System.out.println("Not Prime Number");
      }
  }
}