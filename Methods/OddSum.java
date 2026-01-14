package Methods;


//Write a function to print the sum of all odd numbers from 1 to N


import java.util.*;
public class OddSum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt()
;
		System.out.print(calculateOddSum(n));
	}
	
	public static int calculateOddSum(int n) {
		int sum = 0;
		for(int i = 1 ; i <= n ; i++) {
			if(i % 2 != 0) {
				sum += i;
			}
		}
		return sum;
	}

}
