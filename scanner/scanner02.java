//Create a Java program that calculates the area of a rectangle.
//Prompt the user to enter the length and width of the rectangle using Scanner.
//Calculate the area and display the result rounded to two decimal places.
//Input values are floating-point numbers for length and width.
//Output should be the calculated area.


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read length and width
        double length = scanner.nextDouble();
        double width = scanner.nextDouble();

        // Calculate area
        double area = length * width;
        // Print result rounded to two decimal places

        System.out.println(String.format("%.2f", area));
        scanner.close();
    }
}