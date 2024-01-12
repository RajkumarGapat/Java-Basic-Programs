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
		
		for(int i=1;i<=4;i++)   // this for loop is for rows
		{
			for(int j=1;j<=i;j++)  // this for loop is for columns
			{
				System.out.print("*");
			}
			System.out.println();  // cursor goes next line 
		}
	}

}
