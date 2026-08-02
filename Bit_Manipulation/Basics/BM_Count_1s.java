package Bit_Manipulation.Basics;


//Write a program to count the number of 1’s in a binary representation of the number.


import java.util.*;
public class BM_Count_1s {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		System.out.println(countOnes(n));
	}
	
	static int countOnes(int n) {
        int count = 0;
        while (n > 0) {
            n = n & (n - 1);
            count++;
        }
        return count;
//        n & (n - 1) kya karta hai?

//        		👉 Ye operation rightmost set bit (last 1) ko hata deta hai.
//
//        		🔍 Example: n = 13
//
//        		Binary:
//
//        		13 = 1101
//
//        		Step 1: n - 1
//        		12 = 1100
//
//        		Step 2: AND operation
//        		  1101
//        		& 1100
//        		------
//        		  1100   (rightmost 1 remove ho gaya)
//
//
//        		✔️ Ek 1 remove ho gaya
//
//        		🔁 Loop Dry Run (Step by Step)
//        		Initial:
//        		n = 13 → 1101
//        		count = 0
//
//        		🔁 Iteration 1
//        		n = 1101
//        		n-1 = 1100
//        		AND = 1100
//        		count = 1
//
//        		🔁 Iteration 2
//        		n = 1100
//        		n-1 = 1011
//        		AND = 1000
//        		count = 2
//
//        		🔁 Iteration 3
//        		n = 1000
//        		n-1 = 0111
//        		AND = 0000
//        		count = 3
	}

}

