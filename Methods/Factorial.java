package Methods;


//find the factorial of a number


import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.print(calculateFact(n));
	}
	
	
	public static int calculateFact(int a) {
		int fact = 1;
		for(int i = 1 ; i <= a ; i++) {
			fact *= i;
		}
		return fact;
	}

}
