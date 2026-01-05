package Pattern;


//      * 
//    * * 
//  * * * 
//* * * * 


import java.util.*;
public class HalfPyramid2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0 ; i < n ; i++) {
			for(int j = n - 1; j > i ; j--) {
				System.out.print("  ");
			}
			for(int j = 0 ; j <= i ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
