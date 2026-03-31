package Recursion;

import java.util.*;

public class reverseNum {
 
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
//		System.out.println(rev(n));
		rev2(n);
	}
	
//	Method 1
	static int sum = 0;
	static void rev2(int n ) {
		if(n == 0) {
			System.out.println(sum);
			return;
		}
		sum = sum * 10 +  n % 10;
		rev2(n / 10);
	}
	
	
	
//	Method 2
//	static int rev(int n) {
//		if (n % 10 == n) return n;
//		return (int)((n % 10) * Math.pow(10,(int)Math.log10(n)) + rev(n / 10));
//	}

}
