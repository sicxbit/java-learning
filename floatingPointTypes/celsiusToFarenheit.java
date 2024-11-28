//Write a program that reads a temperature in Celsius (°C) and shows its equivalent in Fahrenheit (°F).
//
//Use the following formula:
//
//F = C * 1.8 + 32
//where C is a temperature in Celsius and F is the corresponding temperature in Fahrenheit.
//
//
//Sample Input:
//        32.9
//
//Sample Output:
//        91.22
//
//
//Sample Input:
//        0
//
//Sample Output:
//        32.0
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
        double celsius = scanner.nextDouble();
        double fahrenheit = celsius * 1.8 + 32;
        System.out.println(fahrenheit);
    }
}