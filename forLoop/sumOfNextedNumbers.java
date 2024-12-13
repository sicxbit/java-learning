//Print the sum of all integers from a to b including both.
//
//It is guaranteed that a < b in all test cases.
//
//
//Sample Input:
//        5
//        21
//
//Sample Output:
//        221
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
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = 0;
        for (int i=a; i<=b ; i++) {
            sum += i;
        }
        System.out.println(sum);
    }
}