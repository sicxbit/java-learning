//Given a sequence of positive integer numbers (which ends with the number 0). Find the largest element of the sequence.
//
//The number 0 itself is not included in the sequence but serves only as a sign of the sequence’s end.
//
//
//Sample Input:
//        1
//        7
//        9
//        0
//
//Sample Output:
//        9
//
//
//
//Memory limit: 256 MB
//Time limit: 1 second

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = scanner.nextInt();
        int largestNumber = 0;
        while ( number > largestNumber) {
            largestNumber = number;
        }
        System.out.println(largestNumber);
    }
}