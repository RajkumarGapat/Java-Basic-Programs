package JavaCodingInterview;
import java.util.*;
public class AreaOfTriangle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of a length of a base : ");
		double b=sc.nextDouble();
		System.out.print("Enter value of a length of a height : ");
		double h=sc.nextDouble();
		
		double area=(b*h)/2;  // Formula For area of triangle
		
		System.out.println("Area of triangle is "+area);
	}

}
