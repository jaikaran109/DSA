package Pattern;


//*        *
//**      **
//* *    * *
//*  *  *  *
//*   **   *
//*   **   *
//*  *  *  *
//* *    * *
//**      **
//*        *



import java.util.*;
public class HollowButterfly {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for(int i = 1 ; i <= n ; i++) {
			
			for(int j = 1 ; j <= i ; j++) {
				if(j == 1 || j == i) 
					System.out.print("*");
				else 
					System.out.print(" ");
				
			}
			
			for(int j = 2*(n-i) ; j >= 1 ; j--) {
				System.out.print(" ");
			}
			
			for(int j = 1 ; j <= i ; j++) {
				if(j == 1 || j == i) 
					System.out.print("*");
				else 
					System.out.print(" ");
			
			}
			
			System.out.println();
			
			
		}
		
		
		for (int i = n; i >= 1; i--) {

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }

            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                if (j == 1 || j == i)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }

	}
	
}
