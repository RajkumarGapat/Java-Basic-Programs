package JavaCodingInterview;

public class PalindromeNumber {
	
	public static void main(String[] args)
	{
		int no=121;
		int temp=no;
		int rev=0,rem;
		
		while(temp != 0)   //(121!=0  12!=0   
		{
			rem=temp%10;     //(rem=121%10=1    rem=12%10=2        % == reminder
			rev=rev*10+rem;  //(rev=0*10+1=1    rev=1*10+2
			temp=temp/10;    // (temp=121/10=12 temp=12/10=1        / == Quetient
		} 
		if(no==rev)
		{
			System.out.println(no+ " is palindrome number");
		}
		else
		{
			System.out.println(no+ " is not palindrome number");
		}
	}

}








       










