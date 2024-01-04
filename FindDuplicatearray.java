package JavaCodingInterview;

public class FindDuplicatearray {
	
	public static void main(String[] args)
	{
		int [] a= {1,8,7,5,5,7,1,3,6,6,9,4,51,10};
		
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println("Duplicate Element : " +a[i]);
				}
			}

		} 
	}
}
