package Pattern;


//*                 * 
//* *             * * 
//* * *         * * * 
//* * * *     * * * * 
//* * * * * * * * * * 
//* * * * * * * * * * 
//* * * *     * * * * 
//* * *         * * * 
//* *             * * 
//*                 * 



import java.util.*;
public class Butterfly {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print("* ");
			}
			for(int j = 2*(n - i) ; j >= 1 ; j--) {
				System.out.print("  ");
			}
			for(int j = 1 ; j <= i ;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		for(int i = n ; i >= 1 ; i--) {
			for(int j = i ; j >= 1 ; j--) {
				System.out.print("* ");
			}
			for(int j = 2*(n - i) ; j >= 1 ; j--) {
				System.out.print("  ");
			}
			for(int j = i ; j >= 1 ;j--) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
