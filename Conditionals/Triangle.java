package Conditionals;


//Area Of Triangle
//Area Of Isosceles Triangle

import java.util.*;
public class Triangle_Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int base = input.nextInt();
		int height = input.nextInt();
		System.out.print("Area of Triangle " + 0.5*base*height);

		
//		Area Of Equilateral Triangle
		 double side = input.nextDouble();

	     double area = (Math.sqrt(3) / 4) * side * side;

	     System.out.println("Area of Equilateral Triangle = " + area);
	     System.out.println("Perimeter of Equilateral Triangle = " + 3*side);
	}

}
