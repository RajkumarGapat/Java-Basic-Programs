package JavaCodingInterview;
import java.io.File;  // Import the File class

public class DeleteFile 
{
  public static void main(String[] args) 
  { 
    File f = new File("D:\\My Certificates\\Swapnil Kadam.pdf"); 
    if (f.delete()) 
    { 
      System.out.println("Deleted the file: " + f.getName());
    } else 
    {
      System.out.println("Failed to delete the file.");
    } 
  } 
}
