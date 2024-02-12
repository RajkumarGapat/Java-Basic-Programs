package JavaCodingInterview;
import java.util.HashSet;

public class HashSetEx2 
{
	public static void main(String[] args) 
	{
		HashSet<Integer> age = new HashSet<Integer>();
		
		age.add(5);
		age.add(10);
		age.add(15);
		age.add(20);
		age.add(25);
	    System.out.println(age); // [20, 5, 25, 10, 15]
	}
}
