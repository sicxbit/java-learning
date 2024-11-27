//Write a program that reads the density of a liquid ρ and the height of a column h, and calculates the liquid pressure p.
//
//We suppose the gravitational acceleration g is 9.8 m/s² (Earth).
//Do not format the result.
//        Some explanations
//
//When swimming underwater, water pressure is felt on one's eardrums. The deeper you swim, the greater the pressure. The pressure felt is due to the weight of the water above. As one swims deeper, there is more water above them and, therefore, greater pressure. The pressure a liquid exerts depends on its depth.
//
//Liquid pressure also depends on the density of the liquid. If someone was submerged in a liquid denser than water, the pressure would be correspondingly greater. Thus we can say that the depth, density, and liquid pressure are directly proportionate. The pressure exerted by the liquid in liquid columns of constant density or by a substance at a certain depth is represented by the following formula:
//
//p=ρgh
//
//where:
//
//        - p is liquid pressure,
//
//- g is gravity at the surface of overlaying material,
//
//        - ρ is density of liquid,
//
//        - h is height of liquid column.
//
//
//Sample Input:
//        1.7 5.5
//
//Sample Output:
//        91.63



import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double gravity = 9.8;
        double density = scanner.nextDouble();
        double height = scanner.nextDouble();
        double pressure = density*gravity*height;
        System.out.println(pressure);
    }
}
