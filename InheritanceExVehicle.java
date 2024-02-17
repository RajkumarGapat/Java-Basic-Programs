package JavaCodingInterview;

//class InheritanceExVehicle 
//{
//	
//   protected String brand = "Ford";
//	public void honk()
//	{
//		System.out.println("Tuut ....,tuut...!");
//	}
//
//class Car extends InheritanceExVehicle
//{
//	private String modelName = "Mustang";
//	public static void main(String[] args) {
//		Car myCar = new Car();
//		myCar.honk();
//		System.out.println(myCar.brand + " " + myCar.modelName);
//
//	}
//}
//}


class Vehicle 
{
	  protected String brand = "Ford";
	  public void honk() 
	  {
	    System.out.println("Tuut, tuut!");
	  }
}

	class Car extends Vehicle 
{
	  private String modelName = "Mustang";
	  public static void main(String[] args) 
	  {
	    Car myFastCar = new Car();
	    myFastCar.honk();
	    System.out.println(myFastCar.brand + " " + myFastCar.modelName);
	  }
}

