package Methods;


//Write a function that takes in the radius as input and returns the
//circumference of a circle.


import java.util.*;

public class Circle {
    static double circumference(double r) {
        return 2 * Math.PI * r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        System.out.println(circumference(r));
    }
}
