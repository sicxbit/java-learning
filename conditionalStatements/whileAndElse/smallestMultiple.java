import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Get the input number
        int n = sc.nextInt();
        if (n > 0) {
            // Start from n and use a while loop to find the smallest multiple of 3
            int x = n;
            while (x % 3 != 0) {
                x++;
            }
            // Print the result
            System.out.println(x);
        } else {
            // Print -1 if n is not a positive integer
            System.out.println("-1");
        }
        sc.close();
    }
}