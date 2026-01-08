package Bit_Manipulation;

public class BM_Basics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		// left shift  <<  , ex 010 = 100
		// right shift >> , ex 010 = 001
		
//		operations in Bit Manipulation -- inn sb operrations ko bit masking bolte h  
//		get - kisi position ka bit lena
//		set - kisi position ko 1 set kr deta h  
//		clear - kisi position pe Bit clear kr dena means 0  kr dena
//		update - bit update kr dena 0 ko 1 , 1 ko 0
		
		
		
//		Get Bit
//		Ex :- Get the 3rd bit (position = 2) of a number n. (n = 0101)
		
//		steps -
//		-- Bit Mask : 1 << i
//		-- operation : AND
//		
//		soln :- (i) 1 << 2 
//				0001 << 2
//				= 0100
//				
//				(ii) 0100 AND 0101
//				= 0100     
//						-- ab ye agr non zero h to 1 hoga uss position pe
//						-- aur agr zero hai to 0 hoga uss position pe 
		
		
		
		
		// counting peeche se hoti h
		
		
		
		
//		Set Bit
//		Ex :- Set the 2nd Bit (position = 1) of a number n. (n = 0101)
		
//		steps -
//		-- Bit Mask : 1 << i
//		-- Operation : OR
		
//		soln :- (i) 1 << 1
//				0001 << 1
//				= 0010
//				(ii) 0010 | 0101
//				= 0111 -(7)
		
		
		
		
//		Clear Bit 
//		Ex :- Clear the 3rd bit(position = 2) of a number n.(n = 0101)
//		steps - 
//		-- Bit Mask : 1 << i
//		-- Operation : AND with NOT
		
//		Soln :- (i) 1 << 2
//				 0001 << 2
//				 = 0100
//			
//				(ii) ~(0100) = 1011
//					 (1011) & (0101)
//					 = 0001
		
		
		
//		Update Bit
//		Ex :- Update the 2nd bit(position = 1) of a Number n to 1. (n = 0101)
//		steps - 
//		# For 1   - change 1 to 0            
//		-- Bit Mask : 1 << i 
//		-- Operation : AND with NOT
//		
//		
//		# For 2   - change 0 to 1	
//		-- Bit Mask : 1 << i
//		-- Operation : OR
//		
//		
//		soln :- (i) 1 << 2
//				0001 << 2
//				= 0100  (BM) 
//				~(BM) - 1011
//				1011 & 0101
//				= 0001 - (1)
//		
//		
//		
//		
//		
//		
//		
		
		
	}

}
