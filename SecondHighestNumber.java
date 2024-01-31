package JavaCodingInterview;


	public class SecondHighestNumber {

	    public static void main(String[] args) {
	        // Sample array
	        int[] a = {5, 2, 8, 1, 6};

	        // Sorting the array in ascending order using bubble sort
	        int n = a.length;

	        for (int i = 0; i < n - 1; i++)  //(i=0 i=1  1<4       0<5-1-1 0<3   0<5-2-1 0<2 
	        {
	            for (int j = 0; j < n - i - 1; j++)  //(1-j=0 ; 0<3  --> 2 j=1; 1<4 -->  3 j=2; 2<4    4 j=3; 3<4   5 j=4; 4<4
	            {
	                if (a[j] > a[j + 1])  //(a[0]=5 > a[0+1]=2, 5>2     a[1]=5 > a[1+1]=8, 5>8    a[2]=8 > a[2+1]=1, 8>1     a[3]=8 > a[2+1]=6, 8>6
	                {
	         
	                    int temp = a[j];   // (temp=5  temp=8  temp=8
	                    a[j] = a[j + 1];   //(a[j]=2   a[2]=1  a[3]=6
	                    a[j + 1] = temp;   //(a[j+1]=5  a[3]=8  a[4]=8   a[3]=6
	                    
	                }
	            }
	        }
	        
               System.out.println(a[a.length-2]);

	        }
	    }
	
