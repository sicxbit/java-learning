//Arithmetic expression
//Medium
//26782
//        1 minute ago
//Write a program that reads an integer value n from the standard input and outputs the result of the following arithmetic expression:
//
//        ((n + 1) * n + 2) * n + 3
//Explain code
//Sample Input 1:
//
//        3
//Explain code
//Sample Output 1:
//
//        45

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        long n = scanner.nextLong();
        long result = ((n+1)* n+2)*n+3;
        System.out.println(result);
    }
}