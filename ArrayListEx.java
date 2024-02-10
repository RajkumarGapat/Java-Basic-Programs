package JavaCodingInterview;
import java.util.ArrayList;

//public class ArrayListEx {
//	public static void main(String[] args) {
//		ArrayList<String> cars = new ArrayList<String>();
//		cars.add("Volvo");
//	    cars.add("BMW");
//	    cars.add("Ford");
//	    cars.add("Mazda");
//	    System.out.println(cars);
//	}
//}



public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<Integer> num = new ArrayList<Integer>();
		num.add(10); // Add method
	    num.add(20);
	    num.add(30);
	    num.add(40);
	    System.out.println(num);   // [10, 20, 30, 40]
	   
	    num.set(3,80);     // Set method -----> Here we are setting the index value and element value
	    System.out.println(num); // [10, 20, 30, 80]
	    
	    System.out.println(num.get(3));  // 80   (get method)
	    
	    num.remove(1);    // remove method
	    System.out.println(num);  // [10, 30, 80]
	    
	   // num.clear(); // clear() method removes all items from ArrayList.
	   // System.out.println(num);   //  o/p ----> []
	    
	    System.out.println(num.size()); // 3  (gives a size of ArrayList)

	}
}
