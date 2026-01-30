package Conditionals;


//Area Of Circle Java Program


import java.util.*;
public class Circle_Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int radius = input.nextInt();
		System.out.print("Area of Circle " + Math.PI * radius * radius);

		 double perimeter = 2 * Math.PI * radius;

	     System.out.println("Perimeter of Circle = " + perimeter);
	}

}
