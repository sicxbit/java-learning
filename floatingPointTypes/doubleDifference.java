//Write a program that reads two double values and prints the difference between the second and the first one.
//
//
//Sample Input:
//        18.4
//        -5.0
//
//Sample Output:
//        -23.4
//
//


import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double first = scanner.nextDouble();
        double second = scanner.nextDouble();
        double result = (first-second)*-1;
        System.out.println(result);
    }
}