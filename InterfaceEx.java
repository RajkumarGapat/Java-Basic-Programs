package JavaCodingInterview;

interface Sky      // Interface Sky

{
	public abstract void animalSound();    // interface method (does not have a body)
    public void sleep() ;               // interface method (does not have a body)
}

//Pig "implements" the Animal interface
class Monkey implements Sky
{
	public void animalSound()  
	{
	    // The body of animalSound() is provided here
		System.out.println("The pig sys : wee wee");
	}
	  public void sleep() 
	  {
		   // The body of sleep() is provided here
		   System.out.println("Zzz");
	  }
}


public class InterfaceEx 
{
	public static void main(String[] args) 
	{
		Monkey p=new Monkey();     // Create a Pig object
		p.animalSound();
		p.sleep();
	}
}
