package JavaCodingInterview;
import java.util.Scanner;
public class SquareRootCheck {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entyer any number : ");
		int n=sc.nextInt();
		
		double d=Math.sqrt(n);
		System.out.println("Square root of "+n+" is "+d);
	}
 
}
