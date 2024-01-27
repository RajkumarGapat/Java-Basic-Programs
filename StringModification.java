package JavaCodingInterview;

public class StringModification {
	
	public static String modifyStringFormat(String input)
	{
		return input.replace(" ", "_");
	}
	
	public static void main(String[] args) {
		String inputString = "Hello World! This is a simple program.";
		String modifiedString = modifyStringFormat(inputString);
		
		System.out.println("Original String : " + inputString);
		System.out.println("Original String : " + modifiedString);

	}

}
