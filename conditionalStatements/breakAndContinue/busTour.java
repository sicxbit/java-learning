//A bus tour of Europe has been very successful. Due to an increase in the number of people who want to go on a tour, the tour company decided to increase the height of the bus. The new height of the bus is exactly N centimeters.
//
//But the tour’s route runs under a lot of bridges, and there is a chance that the bus will crash into one of these bridges. Can you find out if this will happen?
//
//The first line of the input contains the height of the bus and the number of bridges under which the bus passes. The second line contains the heights of these bridges.
//
//You should output "Will not crash" if everything will be alright; otherwise, output "Will crash on bridge i" (where i is the number of the bridge) into which the bus will crash. If the height of a bridge equals the height of the bus, the bus will crash.
//
//
//Sample Input:
//        234 8
//        465 453 981 463 1235 871 475 981
//
//Sample Output:
//Will not crash
//
//
//Sample Input:
//        211 5
//        871 205 123 871 1681
//
//Sample Output:
//Will crash on bridge 2
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
        int heightOfTheBus = scanner.nextInt();
        int numberOfBridges = scanner.nextInt();

        boolean busWillCrash = false;
        for (int i = 1; i <= numberOfBridges; i++) {
            int bridgeHeight = scanner.nextInt();
            busWillCrash = false;
            if (heightOfTheBus < bridgeHeight) {
                continue;
            }
            if (heightOfTheBus >= bridgeHeight) {
                busWillCrash = true;
                System.out.println("Will crash on bridge " + i);
                break;

            }
        }
        if (busWillCrash == false) {
            System.out.println("Will not crash");
        }
    }
}