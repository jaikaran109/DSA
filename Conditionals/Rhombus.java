package Conditionals;

// Area Of Rhombus

import java.util.*;

public class Rhombus_Area {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter diagonal 1: ");
        double d1 = input.nextDouble();

        System.out.print("Enter diagonal 2: ");
        double d2 = input.nextDouble();

        double area = 0.5 * d1 * d2;

        System.out.println("Area of Rhombus = " + area);
    }
}
