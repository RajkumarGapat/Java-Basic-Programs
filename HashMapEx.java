package JavaCodingInterview;
import java.util.HashMap;

// 1. Creating a HashMap ------->
public class HashMapEx
{
	public static void main(String[] args) 
	{
		HashMap<String, String> capitalCities = new HashMap<String, String>();
		capitalCities.put("England", "London");
	    capitalCities.put("Germany", "Berlin");
	    capitalCities.put("Norway", "Oslo");
	    capitalCities.put("USA", "Washington DC");
	    System.out.println(capitalCities);   // {USA=Washington DC, Norway=Oslo, England=London, Germany=Berlin}
	
	// 2. Accessing an item in a HashMap ----->
	    System.out.println(capitalCities.get("England"));     // London
	    System.out.println(capitalCities.get("London"));      // null
	  
	// 3. Remove an Item from HashMap ------->
	    System.out.println(capitalCities.remove("England"));
	    System.out.println(capitalCities); // {USA=Washington DC, Norway=Oslo, Germany=Berlin}
	    
	 // 4. Removing all items from HashMap ----->   
	 //   capitalCities.clear();
	 //   System.out.println(capitalCities);   // {}
	    
	 // 5. Getting size of HashMap ----->
	    System.out.println(capitalCities.size());  // 3    
	}
}
