//WAP for this pattern
//*
//**
//***
//****
//***
//**
//*

//This program is combination of pattern 1 & 2
// Here we are using nested for loops
// We are using four for loops


package JavaCodingInterview;

public class StarPattern3 {
	public static void main(String[] args) {
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=3;j>=i;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
