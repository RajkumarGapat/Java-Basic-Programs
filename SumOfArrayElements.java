package JavaCodingInterview;

public class SumOfArrayElements 
{
	
	public static void main(String[] args) 
	{
		int a[] = {10,20,30,40,5,5,50};
		int sum = 0;
		
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
		}
		System.out.println("The sum is : "+sum);
	}
}
