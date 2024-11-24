//Write a Java program that reads a positive integer from the user, representing a duration in minutes. The program should calculate and print the equivalent time duration in hours and minutes. If the input is 367 for example, the output should be '6 hours and 7 minutes'.
//
//
//Sample Input:
//        60
//
//Sample Output:
//        1 hours and 0 minutes
//
//
//Sample Input:
//        90
//
//Sample Output:
//        1 hours and 30 minutes
//
//

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int minutes = scanner.nextInt();

        // Your code comes here!
        int hours = minutes/60;
        int RemainingMinutes = minutes%60;

        System.out.println(hours+" hours and "+RemainingMinutes+" minutes");
        scanner.close();
    }
}