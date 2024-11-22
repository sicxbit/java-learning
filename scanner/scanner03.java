//Write a program that reads four words and outputs them in the same order, each in a new line.
//
//Your program should read input using the next() method and print out each input in a new line.
//
//Tip: You don't need to use anything advanced for this task. Simply declare four strings and print them.
//
//Sample Input 1:
//Hello
//        Java
//Future programmer
//Explain code
//Sample Output 1:
//
//Hello
//        Java
//Future
//        programmer

import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // start coding here
        String first = sc.next();
        String second = sc.next();
        String third = sc.next();
        String fourth = sc.next();
        System.out.println(first);
        System.out.println(second);
        System.out.println(third);
        System.out.println(fourth);


        sc.close();
    }
}