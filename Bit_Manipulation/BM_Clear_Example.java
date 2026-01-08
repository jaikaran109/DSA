package Bit_Manipulation;



//Clear Bit 
//Ex :- Clear the 3rd bit(position = 2) of a number n.(n = 0101)
//steps - 
//-- Bit Mask : 1 << i
//-- Operation : AND with NOT

//Soln :- (i) 1 << 2
//		 0001 << 2
//		 = 0100
//	
//		(ii) ~(0100) = 1011
//			 (1011) & (0101)
//			 = 0001


public class BM_Clear_Example {

	public static void main(String[] args) {
		int n = 5 ;
		int pos = 2;
		int bitMask = 1 << pos;
		int notBitMask = ~(bitMask);
		
		int newNumber = notBitMask & n;
		System.out.println(newNumber);


	}

}
