package JavaCodingInterview;
import java.util.HashSet;

public class HashSetEx 
{
	public static void main(String[] args) 
	{
		HashSet<String> cars = new HashSet<String>();
		
		cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("BMW");
	    cars.add("Mazda");
	    System.out.println(cars); // [Volvo, Mazda, Ford, BMW]

	}
}
