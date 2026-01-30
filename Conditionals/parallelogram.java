package Conditionals;


//Area Of Parallelogram


import java.util.*;
public class Parallelogram_Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int base = input.nextInt();
		int height = input.nextInt();
		
		System.out.print("Area of Parallelogram " + base * height);
		
		double perimeter = 2 * (base + height);

        System.out.println("Perimeter of Parallelogram = " + perimeter);

	}

}
