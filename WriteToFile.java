package JavaCodingInterview;
import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {
	public static void main(String[] args) {
		
		try
		{
			FileWriter fw=new FileWriter("Raj.txt");
			fw.write("Heloo guys I'm Raj!");
			fw.close();
			System.out.println("Successfully wrote to the file.");
		}
		catch(IOException e)
		{
			System.out.println("An error occured");
			e.printStackTrace();
		}
	}
}
