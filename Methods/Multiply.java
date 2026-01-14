package Methods;


//Make a function to multiply 2 numbers and return the product


import java.util.*;
public class Multiply {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.print(calculateMultiply(a,b));
	}
	
	public static int calculateMultiply(int n1 , int n2) {
		int multiply = n1*n2;
		return multiply;
	}

}
