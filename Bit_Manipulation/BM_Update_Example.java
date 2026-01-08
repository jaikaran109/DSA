package Bit_Manipulation;



//Update Bit
//Ex :- Update the 2nd bit(position = 1) of a Number n to 1. (n = 0101)
//steps - 
//# For 1   - change 1 to 0            
//-- Bit Mask : 1 << i 
//-- Operation : AND with NOT
//
//
//# For 2   - change 0 to 1	
//-- Bit Mask : 1 << i
//-- Operation : OR
//
//
//soln :- (i) 1 << 2
//		0001 << 2
//		= 0100  (BM) 
//		~(BM) - 1011
//		1011 & 0101
//		= 0001 - (1)



import java.util.*;
public class BM_Update_Example {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	int oper = input.nextInt();
	// oper =  1 : set , oper = 0 : clear
	int n = 5 ; // 0101
	int pos = 1;
	
	int bitMask = 1 << pos;
	if(oper == 1) {
//		set
		int newNumber = bitMask | n;
		System.out.println(newNumber);
	} else {
		int newBitMask = ~(bitMask);
		int newNumber = newBitMask & n;
		System.out.print(newNumber);
	}
	
	}

}
