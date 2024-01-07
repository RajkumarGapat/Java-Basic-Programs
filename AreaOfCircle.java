package JavaCodingInterview;

import java.util.Scanner;

public class AreaOfCircle {
	
	public static void main(String[] args) {
		final double pi=3.14;
		double r;
		double area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius of circle : ");
		r=sc.nextDouble();
		
		area=pi*r*r;
		System.out.println("Area of circle is "+area);
	}

}
