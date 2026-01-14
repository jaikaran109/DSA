package Methods;


//Make a function to add 2 numbers and return the sum 


import java.util.*;
public class Sum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.print(calculateSum(a,b));
	}
	
	public static int calculateSum(int n1 , int n2) {
		int sum = n1+n2;
		return sum;
	}

}
