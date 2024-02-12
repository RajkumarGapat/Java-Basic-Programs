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
	    
	    
	    // check if an item exists in a HashSet ----->
	    System.out.println(cars.contains("Mazda")); // true ------> contains method
	    System.out.println(cars.contains("dbhbf")); // false 
	    System.out.println(cars.contains("45454")); // false
	    
	    // remove an item from HashSet ----->
	    cars.remove("Volvo");
	    System.out.println(cars);        // [Mazda, Ford, BMW]

	    // get the size of HashSet ----->
	    System.out.println(cars.size());   // 3 ---> size method
	    
	        
	    // remove all items from a HashSet ----->
	    cars.clear();            // clear method
	    System.out.println(cars);  // []
	}
}
