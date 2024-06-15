

import java.util.Scanner;

public class triangel {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);

        System.out.println("Side 1 is :");
        double base = scanner.nextDouble();

        System.out.println("Side 2 is :");
        double height = scanner.nextDouble();

        System.out.println("Enter the side 3  of the triangle:");
        double side = scanner.nextDouble();

        double area = (base * height * side) / 2;
        System.out.println("The area of the triangle is: " + area);
    }
}

