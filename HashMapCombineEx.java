package JavaCodingInterview;
//Import the HashMap class
import java.util.HashMap;

public class HashMapCombineEx 
{
	public static void main(String[] args) {
// Create a HashMap object called people
   HashMap<String, Integer> people = new HashMap<String, Integer>();

 // Add keys and values (Name, Age)
 
   people.put("John", 32);
   people.put("Steve", 30);
   people.put("Angie", 33);

 
   for (String i : people.keySet()) 
   {
	  System.out.println("Name: " + i + " Age: " + people.get(i));
   }

 }
}
