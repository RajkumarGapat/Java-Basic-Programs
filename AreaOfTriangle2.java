package JavaCodingInterview;
import java.util.*;
public class AreaOfTriangle2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter values for sides of a triangle : ");
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		
		Double sp=(a+b+c)/2;  // Formula for semiperimeter

		
		double area=Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));  // Formula For area of triangle
		
		System.out.println("Area of triangle is "+area);
	}

}
