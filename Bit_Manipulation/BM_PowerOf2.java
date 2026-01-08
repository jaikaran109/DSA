package Bit_Manipulation;


//Write a program to find if a number is a power of 2 or not.


import java.util.*;
public class BM_PowerOf2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = input.nextInt();
		System.out.println(isPowerOfTwo(n));
		
	}
	
	
	static boolean isPowerOfTwo(int n) {
        return n > 0 && (n & (n - 1)) == 0;
//        (n & (n - 1)) == 0
//        		🔹 Bit Logic Behind This
//        		Rule ⭐
//
//        		Power of 2 numbers have only ONE set bit (1) in binary
//
//        		🔍 Example 1: n = 16
//
//        		Binary:
//
//        		16 = 10000
//        		15 = 01111   (n - 1)
    }

}
