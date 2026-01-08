package Bit_Manipulation;


//Write a program to toggle a bit a position = “pos” in a number “n”.


import java.util.*;
public class BM_ToggleBit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();   // n = 5 --  101
        int pos = 1;
        System.out.println(toggleBit(n, pos)); // 7 (111)
	}
	
	
	static int toggleBit(int n, int pos) {
        return n ^ (1 << pos);  // XOR
    }

}
