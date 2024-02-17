package JavaCodingInterview;

abstract class Bike
{
	abstract void run();
}

 class AbstractionHondaEx2 extends Bike
{
	void run()
	{
		System.out.println("Running safely");
	}

	public static void main(String[] args) 
	{
		Bike obj = new AbstractionHondaEx2();
		obj.run();
	}
}


// O/p ---->
//Running safely

