//WAP for this pattern
//   *
//  **
// ***
//****

//here i=rows,j=spaces(_) & j=stars (*)
// Here we are using nested for loops
// We are using three for loops

package JavaCodingInterview;

public class StarPattern4 {
	
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)  // for rows
		{
			for(int j=3;j>=i;j--) // for spaces
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)   // for stars
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
