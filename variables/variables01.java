//Refactor the following poorly named variables in a weather application to follow Java naming conventions:
//
//int t = 25;
//
//int h = 60;
//
//int w = 6;
//
//Print three lines with the refactored variable names and their values.
//
//
//Sample Input:
//        25
//        60
//        6
//
//Sample Output:
//airTemperature = 25
//airHumidity = 60
//windSpeed = 6


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int t = 25;
        int h = 60;
        int w = 6;

        // TODO: Refactor variable names and print the results
        int airTemperature = t;
        int airHumidity = h;
        int windSpeed = w;

        System.out.println("airTemperature = "+ airTemperature);
        System.out.println("airHumidity = "+airHumidity);
        System.out.println("windSpeed = "+ windSpeed);
    }
}