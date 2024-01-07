package JavaCodingInterview;

import java.util.Scanner;

public class AreaOfSquare {
	public static void main(String[] args) {
		int side ;
		int area;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a side of a square : ");
		side=sc.nextInt();
		
		area=side*side;
		System.out.println("Area of a square is "+area);
	}
}
