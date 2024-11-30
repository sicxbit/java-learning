//Write a program that reads the distance between two cities in miles and the travel time by bus in hours and outputs the average speed of the bus.
//
//Note: there is NO need to give any explanations during input and output.
//
//
//Sample Input:
//        100
//        2
//
//Sample Output:
//        50.0
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
        // getting the total distance
        double distance = scanner.nextDouble();
        // getting the time taken
        double time = scanner.nextDouble();
        // calculating the avarage speed
        double speed = distance/time;
        System.out.println(speed);
    }
}