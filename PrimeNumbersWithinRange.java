package JavaCodingInterview;

public class PrimeNumbersWithinRange {
	
	public static void main (String[] args)
	{
		int temp=0;
		for(int no=1;no<=100;no++) // This for loop is for numbers i.e.1 to 100
		{
			for(int i=2;i<=no-1;i++)  // This for loop is for checking the number is prime or not
			{
				if(no%i==0)
				{
					temp++;    //means temp=temp+1;
				}
			}
			if(temp==0)
			{
				System.out.println(no);
			}
			else
			{
				temp=0;
			}
		}
	}
}
