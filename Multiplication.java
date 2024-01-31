package pkg1;
import java.util.Scanner;
public class Multiplication{
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Your Number =");
    int n = s.nextInt();
    int i = 1;
     while (i < 11) {
      System.out.println(i * n);
      i++;
    }
  }
}
