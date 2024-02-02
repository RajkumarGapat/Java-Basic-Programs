package JavaCodingInterview;

abstract class Animal      // Abstract class

{
	public abstract void animalSound();    // Abstract method (does not have a body)

	
	public void sleep()                // Regular method
	{
		System.out.println("Zzz");
	}
	
}

//Subclass (inherit from Animal)
class Pig extends Animal
{
	public void animalSound()  
	{
	    // The body of animalSound() is provided here
		System.out.println("The pig sys : wee wee");
	}
}


public class AbstractEx 
{
	public static void main(String[] args) 
	{
		Pig p=new Pig();     // Create a Pig object
		p.animalSound();
		p.sleep();
	}
}
