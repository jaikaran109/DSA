package Recursion;

import java.util.*;

public class sumOfDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(sum(n));

	}
	static int sum(int n) {
		if(n % 10 == n) return n;
		return n % 10 + sum(n/10);
	}

}
