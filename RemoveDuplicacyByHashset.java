
//Removing duplicacy by using HashSet 
// This concept is working for both sorted or unsorted array
// Bcoz HashSet doesn't allow duplicate objects


package JavaCodingInterview;
import java.util.HashSet;
public class RemoveDuplicacyByHashset {
	
	public static void main(String[] args)
	{
		int[] a= {1,2,2,3,4,5,5}; //Sorted array
		
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a.length;i++)
		{
			hs.add(a[i]);
		}
		
		for(int no:hs)
		{
			System.out.println(no+ " ");
		}
	}

}
