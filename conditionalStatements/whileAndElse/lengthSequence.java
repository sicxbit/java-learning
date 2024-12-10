//For its input, the program gets a sequence of non-negative integers; each integer is written on a separate line. The sequence ends with an integer 0; when the program reads 0, it should end its work and output the length of the sequence (not counting the final 0).
//
//Don’t read numbers following the number 0.
//
//
//Sample Input:
//        1
//        7
//        9
//        0
//        5
//
//Sample Output:
//        3
//
//
//
//Memory limit: 256 MB
//Time limit: 1 second

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int num = scanner.nextInt();
        int count = 0;
        while (num>0) {
            count ++;
            System.out.println(num);
            num = scanner.nextInt();
        }
        System.out.println(count);


    }
}