//Write a program that reads a number and prints YES if it is positive. Otherwise, the program should print NO.
//
//Do not forget that zero is not a positive number.
//
//
//Sample Input:
//        7
//
//Sample Output:
//YES
//
//
//
//Memory limit: 256 MB
//Time limit: 5 seconds

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        if (num>0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}