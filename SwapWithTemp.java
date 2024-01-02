package JavaCodingInterview;

public class SwapWithTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 5;
		int b = 10;
		int temp;     // Temporary variable declaration
		
		System.out.println("Before Swapping : ");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		temp = a;   // Store the value of 'a' in the temporary variable
		a = b;      // Assign the value of 'b' to 'a'
		b = temp ;  // Assign the value stored in the temporary variable to 'b'
		
		System.out.println("After Swapping : ");
		System.out.println("a = " +a);
		System.out.println("b = " +b);


	}

}
