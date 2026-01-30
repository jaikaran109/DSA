package Conditionals;

// Volume Of Rectangular Prism

import java.util.*;

public class Prism_Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double length = input.nextDouble();
        double breadth = input.nextDouble();
        double height = input.nextDouble();

        double volume = length * breadth * height;

        System.out.println("Volume of Rectangular Prism = " + volume);
    }
}
