//Write a program that takes an integer as input. If the integer is positive, print 'Positive'. If the integer is negative, print 'Negative'. If the integer is zero, print 'Zero'.
//
//
//Sample Input:
//        5
//
//Sample Output:
//Positive
//
//
//Sample Input:
//        -3
//
//Sample Output:
//Negative
//
//
//
//Memory limit: 256 MB
//Time limit: 5 seconds

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the integer input
        int num = scanner.nextInt();

        // Use a ternary operator to check if the integer is positive, negative or zero
        // and print the corresponding message
        System.out.println(num > 0 ? "Positive" : (num<0) ? "Negative":"Zero");

    }
}