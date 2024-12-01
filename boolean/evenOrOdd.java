//You are given an integer as input. Your task is to determine whether the number is even or odd. If the number is even, print 'true'. Otherwise, print 'false'.
//
//
//Sample Input:
//        2
//
//Sample Output:
//        true
//
//
//Sample Input:
//        5
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
        // Create a Scanner object for taking input
        Scanner scanner = new Scanner(System.in);

        // Take integer input from the user
        int number = scanner.nextInt();

        // Use a simple way to determine if the number is even or odd.
        // If it's even, print true, otherwise, print false

        // Write your code here
        if ( number % 2 == 0 ) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}