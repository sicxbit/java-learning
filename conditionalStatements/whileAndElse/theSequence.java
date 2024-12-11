//The numbers in the sequence may or may not be evenly divisible divisible by 4. The program should print a single number: the maximum element of the sequence that is evenly divisible by 4.
//
//Try to solve this problem by using a while-loop.
//
//        Note: The first number passed to the program (number of elements in the sequence) isn't a part of the sequence.
//
//
//Sample Input:
//        8
//        16
//        49
//        91
//        77
//        36
//        12
//        12
//        36
//
//Sample Output:
//        36
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
        int size = scanner.nextInt();

        int maxDivisibleByFour = Integer.MIN_VALUE;


        for (int i = 0; i < size; i++) {
            int number = scanner.nextInt();


            if (number % 4 == 0) {
                // Update the maximum number if the condition is satisfied
                if (number > maxDivisibleByFour) {
                    maxDivisibleByFour = number;
                }
            }
        }


        if (maxDivisibleByFour == Integer.MIN_VALUE) {
            System.out.println(0);
        } else {
            System.out.println(maxDivisibleByFour);
        }
    }
}