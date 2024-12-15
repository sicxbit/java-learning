import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double num = scanner.nextDouble();
        double number2 = scanner.nextDouble();
        double totalSum = 0;
        double numberDivisibleByThree = 0;
        for (double i = num; i <= number2; i++) {
            if (i % 3 == 0 ) {
                numberDivisibleByThree +=1;
                totalSum+=i;
            }
        }
        double average = totalSum / numberDivisibleByThree;
        System.out.println(average);
    }
}