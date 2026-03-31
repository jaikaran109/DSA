package Recursion;

import java.util.*;

public class prodOfDigits {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(prod(n));
	}
	static int prod(int n) {
		if(n % 10 == n) return n;
		return n % 10 * prod(n/10);
	}

}
