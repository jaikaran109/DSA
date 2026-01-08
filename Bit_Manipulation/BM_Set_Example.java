package Bit_Manipulation; // -- kisi bhi position ko 1 kr deta h 


//Set Bit
//Ex :- Set the 2nd Bit (position = 1) of a number n. (n = 0101)

//steps-
//-- Bit Mask : 1 << i
//-- Operation : OR

//soln :- (i) 1 << 1
//		0001 << 1
//		= 0010
//		(ii) 0010 | 0101
//		= 0111 -(7)


public class BM_Set_Example {

	public static void main(String[] args) {
		int n = 5 ;
		int pos = 1;
		int bitMask = 1 << pos;
		int newNumber = bitMask | n;
		System.out.println(newNumber);

	}

}
