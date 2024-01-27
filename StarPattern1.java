//WAP for this pattern
//*
//**
//***
//****

// Here we are using nested for loops
// We are using two for loops

package JavaCodingInterview;

public class StarPattern1 {
	public static void main(String[] args) {
		
		for(int i=1;i<=10;i++)   // this for loop is for rows
		{
			for(int j=1;j<=i;j++)  // this for loop is for columns    1<=1  2<=1 1<=2 2<=2 3<=2 
			{
				System.out.print("*");
			}
			System.out.println();  // cursor goes next line 
		}
	}

}
