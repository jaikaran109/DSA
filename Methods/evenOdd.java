package Methods;


// write a function to check Even Odd 


import java.util.*;
public class evenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.print(calculateEvenOdd(n));
	}
	public static String calculateEvenOdd(int a) {
		if(a % 2 == 0) {
			return "Even";
		}else {
			return "Odd";
		}
	}

}
