//Exactly one parameter is positive
//        Medium
//15726
//just now
//Write a program that reads three integer numbers and prints true if exactly ONE number is positive (i.e. > 0).
//
//Otherwise, it should print false.
//
//Sample Input 1:
//
//        1 1 1
//Explain code
//Sample Output 1:
//
//        false
//Explain code
//Sample Input 2:
//
//        1 0 -1
//Explain code
//Sample Output 2:
//
//        true

// my code goes here

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int first = scanner.nextInt();
        int second = scanner.nextInt();
        int third = scanner.nextInt();
        //logic
        if (first > 0 && second <= 0 && third < 0 || first <= 0 && second > 0 && third <= 0 || first <= 0 && second <= 0 && third > 0 ){
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}