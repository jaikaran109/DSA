package Recursion;

import java.util.*;

public class countZeroes {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(count(n));

	}
	
	static int count(int n) {
		return helper(n,0);
	}
	static int helper(int n , int c) {
		if(n == 0) return c;
		if(n % 10 == 0) return helper(n / 10 , ++c);
		return helper(n / 10 , c);
	}

}

