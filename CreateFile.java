package JavaCodingInterview;
import java.io.File;
import java.io.IOException;
public class CreateFile 
{
	public static void main(String[] args) 
	{
		try
		{
			File f=new File("Raj.txt");
			if(f.createNewFile())
			{
				System.out.println("File created: " +f.getName());
			}
			else
			{
				System.out.println("File already exists");
				System.out.println("File created: " +f.getAbsolutePath());
			}
		}
		catch(IOException e)
		{
			System.out.println("An error occured.");
			e.printStackTrace();
		}
	}
}
