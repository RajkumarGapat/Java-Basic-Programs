package JavaCodingInterview;
import java.util.Scanner;
public class primeExample {

	public static void main(String[] args) {
		int i,m=0,n=0;
		//int num=15;  //it is the number to be checked    
		Scanner s=new Scanner (System.in);
		System.out.print("Enter your number = ");
		int num=s.nextInt();
		m=num/2;
		
		if (num==0||num==1) {
			System.out.println(num+" is not a prime number");
		}
		else {
			for (i=2;i<=m;i++) {
				if(num%i==0);
				System.out.println(num+" is not prime number");
				n=1;
				break;
				}
		 }
	    if (n==0) {
		System.out.println(num+" is prime number");
	}
  } // end of else
}

