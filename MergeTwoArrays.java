
//WAP to merge two arrays into single arrays.. 
package JavaCodingInterview;

import java.util.Arrays;

public class MergeTwoArrays {
	public static void main(String[] args) {
		int [] a = {1,2,3,4};   //a.length=4
		int [] b = {5,6,7,8,9,10}; // b.length=6
		
		int [] c = new int[a.length + b.length]; //4+6=10
		
		for(int i=0;i<a.length;i++)
		{
			c[i] = a[i];    //{1,2,3,0,0,0,0,0,0}
		}
		
		for(int i=0; i<b.length;i++)
		{
			c[i+a.length] = b[i];  //{1,2,3,4,5,6,7,8,9,10}
			
		}
		System.out.println("Merged array is "+Arrays.toString(c)); //Arrays is a predefined class which is available in print array element by using toString 
	}   

}
