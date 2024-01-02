package JavaCodingInterview;

public class SwapWithoutTemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 20;
		int b= 10;
		
		System.out.println("Before Swapping : ");
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		
		// Swapping without a temporary variable
        a = a + b; // Adding both values and storing the result in 'a'
        b = a - b; // Subtracting the original value of 'b' from the updated 'a' to get the original 'a'
        a = a - b; // Subtracting the original value of 'a' (now stored in 'b') from the updated 'a' to get the original 'b'
		
		System.out.println("After Swapping : ");
		System.out.println("a = " +a);
		System.out.println("b = " +b);

	}

}
