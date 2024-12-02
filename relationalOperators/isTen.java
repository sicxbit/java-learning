//Write a program that reads a value and checks if it is less than 10.
//
//It should print true if it is less than 10 or false otherwise.
//
//
//Sample Input:
//        5
//
//Sample Output:
//        true
//
//
//
//Memory limit: 256 MB
//Time limit: 5 seconds

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int number = scanner.nextInt();
        System.out.println(number < 10);
    }
}