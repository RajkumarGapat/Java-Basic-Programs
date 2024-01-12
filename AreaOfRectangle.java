package JavaCodingInterview;

import java.util.Scanner;

public class AreaOfRectangle {
	public static void main(String[] args) {
		double l,w,area;
		System.out.println("Enter values for side : ");
		Scanner sc=new Scanner(System.in);
		l=sc.nextDouble();
		w=sc.nextDouble();
		
		area=l*w;
		System.out.println("The area of rectangle is  "+area);


	}

}
