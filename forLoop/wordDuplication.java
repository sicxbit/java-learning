//Write a Java program that takes a string as input. The program should return a new string where every character in the original string is duplicated. Your program should read a line from the standard input and print the output to the standard output.
//
//
//Sample Input:
//Hello
//
//Sample Output:
//HHeelllloo
//
//
//Sample Input:
//Java
//
//Sample Output:
//JJaavvaa
//
//
//
//Memory limit: 256 MB
//Time limit: 5 seconds

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Creating an instance of Scanner class
        Scanner scanner = new Scanner(System.in);

        // Read the input string from the user
        String input = scanner.nextLine();

        // Initialize a new string to store the result
        String result = "";

        // Your code here
        for (int i = 0 ; i<input.length(); i++ ) {
            result += input.charAt(i);
            result += input.charAt(i);
        }
        // Print the result to the standard output
        System.out.println(result);
    }
}
