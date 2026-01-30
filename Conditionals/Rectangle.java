package Conditionals;


//Area Of Rectangle Program


import java.util.*;
public class Rectangle_Area {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int l = input.nextInt();
		int b = input.nextInt();
		
		System.out.print("Area of Rectangle " + l*b);
		System.out.println("Perimeter of Rectangle = " + 2*(l+b));
	}

}
