//Write a program that prints the product of all integer numbers from a to b (a < b).
//        Include a and exclude b from the product.
//
//        For example, if a=2 and b=5, then the answer is 2*3*4=24.
//
//
//        Sample Input:
//        1 2
//
//        Sample Output:
//        1
//
//
//        Sample Input:
//        6 14
//
//        Sample Output:
//        51891840
//
//
//
//        Memory limit: 256 MB
//        Time limit: 5 seconds



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();
        int result = 1;
        for ( int i = firstNum; i<secondNum; i++) {
            result = result*i;
        }
        System.out.println(result);
    }
}