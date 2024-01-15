// Exception handling concept without try catch block...

package JavaCodingInterview;

public class WithoutTryCatch {
	
	public static void main(String[] args) {
		
		System.out.println("Statement 1");
		System.out.println(10/0);           // exception raised
		System.out.println("Statement 3");

	}

}



//o/p ------>
//Statement 1
//Exception in thread "main" java.lang.ArithmeticException: / by zero
//	at PracticePrgramsJava/JavaCodingInterview.WithoutTryCatch.main(WithoutTryCatch.java:10)

//Abnormal termination or non graceful termination
