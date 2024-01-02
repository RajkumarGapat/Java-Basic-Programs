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
      for(i=1;i<=num;i++)
      {
          if(num%i==0)
          {
              count++;
          }
      }
      if(count==2)
      {
          System.out.println("Prime Number");
      }
      else
      {
          System.out.println("Not Prime Number");
      }
  }
}