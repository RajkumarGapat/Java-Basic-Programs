package JavaCodingInterview;

import java.util.Scanner;

public class FibonacciUptoSpecifiedNum {
    public static void main(String[] args) {
        int numTerms;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of terms for Fibonacci series:");
        numTerms = sc.nextInt();

        int firstTerm = 0, secondTerm = 1;
        System.out.println("Fibonacci Series up to " + numTerms + " terms:");

        for (int i = 1; i <= numTerms; ++i) {
            System.out.print(firstTerm + " ");

            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

