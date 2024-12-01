//Write a Java program that reads two booleans. Print 'true' if their logical conjunction (AND operation) is true, else print 'false'.
//
//
//Sample Input:
//        true
//        true
//
//Sample Output:
//        true
//
//
//Sample Input:
//        true
//        false
//
//Sample Output:
//        false
//
//
//
//Memory limit: 256 MB
//Time limit: 5 seconds


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Initialize Scanner object to read the input
        Scanner in = new Scanner(System.in);

        // Read two boolean inputs
        boolean bool1 = in.nextBoolean();
        boolean bool2 = in.nextBoolean();

        // Logic to find the AND operation of 2 booleans goes here
        if (bool1 && bool2 == true || false) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }

        // Close the scanner
        in.close();
    }
}