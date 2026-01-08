package Bit_Manipulation;


//Get Bit
//Ex :- Get the 3rd bit (position = 2) of a number n. (n = 0101)

//steps -
//-- Bit Mask : 1 << i
//-- operation : AND
//
//soln :- (i) 1 << 2 
//		0001 << 2
//		= 0100
//		
//		(ii) 0100 AND 0101
//		= 0100     
//				-- ab ye agr non zero h to 1 hoga uss position pe
//				-- aur agr zero hai to 0 hoga uss position pe 


public class BM_Get_Example {

	public static void main(String[] args) {
		int n = 5 ;
		int pos = 2;
		int bitMask = 1 << pos;
		if((bitMask & n) == 0)
			System.out.println("Bit was zero");
		else
			System.out.println("Bit was one");

	}

}
