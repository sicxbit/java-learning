////Write a Java program that reads a single integer from the input and increases it by 1, and then decreases it by 2, and finally increases it by 3. The final computed integer should be printed as the output.
////
////
////Sample Input:
////        25
////
////Sample Output:
////        27
////
////
////Sample Input:
////        50
////
////Sample Output:
////        52
//
//
//Write a Java program that reads a single integer from the input and increases it by 1, and then decreases it by 2, and finally increases it by 3. The final computed integer should be printed as the output.
//
//
//Sample Input:
//        25
//
//Sample Output:
//        27
//
//
//Sample Input:
//        50
//
//Sample Output:
//        52

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inputScanner = new Scanner(System.in);

        // read the integer from the input
        int inputInteger = inputScanner.nextInt();

        // your code here - increase the integer by 1, then decrease it by 2, and finally increase it by 3

        inputInteger = ++inputInteger;
        inputInteger = inputInteger -2;
        inputInteger = inputInteger+3;

        // print the final computed integer
        System.out.println(inputInteger);
    }
}