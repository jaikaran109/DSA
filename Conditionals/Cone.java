package Conditionals;

// Volume Of Cone Java Program

import java.util.*;

public class Cone_Volume {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double radius = input.nextDouble();
        double height = input.nextDouble();

        double volume = (1.0 / 3) * Math.PI * radius * radius * height;

        System.out.println("Volume of Cone = " + volume);
    }
}
