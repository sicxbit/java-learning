//Ann watched a health TV program and learned that oversleeping is as bad for your health as not getting enough sleep. She decided to follow TV recommendations and keep track of how many hours she spends sleeping.
//
//You are given three numbers: A
//, B
//and H
//. According to TV, one should sleep at least A
//hours per day, but no more than B
//hours. H
//is how many hours Ann sleeps.
//
//Task: If Ann sleeps less than A
//hours, print "Deficiency". If she sleeps more than B
//hours, print "Excess". If her sleep fits the recommendations, print "Normal".
//
//Input format: three numbers A
//, B
//, H
//, where A
//is always less than or equal to B
//.
//
//Tip: 1. Keep in mind that tests are case sensitive: "excess" or "EXCESS" is not correct.
//
//2. Think carefully about all the conditions. Pay attention to the conditional operators: distinguish between <
//        and ≤
//        ; >
//and ≥
//        .
//
//
//Sample Input:
//        6
//        10
//        8
//
//Sample Output:
//Normal
//
//
//Sample Input:
//        7
//        9
//        10
//
//Sample Output:
//Excess
//
//
//Sample Input:
//        7
//        9
//        2
//
//Sample Output:
//Deficiency
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

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int H = scanner.nextInt();
        // logic
        if ( H>= A && H <= B) {
            System.out.println("Normal");
        } else if ( H < A) {
            System.out.println( "Deficiency");
        }else {
            System.out.println("Excess");
        }

    }
}