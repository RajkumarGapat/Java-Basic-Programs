package JavaCodingInterview;

public class BubbleSortStringArray {
	public static void main(String[] args) {
		String[] a = {"raj", "sam", "author", "roy", "shawn", "Raj", "Sandy"};
	    String temp; // For swapping purpose...
		
		for(int i=0; i<a.length; i++) //Outer loop for rounds or phases
		{
			int flag = 0; // if elements are sorted then don't need to execute for loop again..
			
			for(int j=0; j<a.length-1-i; j++)  // inner loop for two adjecent element comparision or swapping purpose
			{
				// Swapping logic...
				
				if(a[j].compareTo(a[j+1]) > 0 )
				{
					temp = a[j];
					a[j] = a[j+1];
					a[j+1] = temp;
					
					flag = 1;
				}
			}
			if(flag == 0)
			{
				break;
			}
		}
		for(int i=0; i<a.length; i++) {
		System.out.println(a[i]+ " ");
		}
	}

}
