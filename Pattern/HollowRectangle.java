package Pattern;

//******
//*    *
//*    *
//*    *
//******


import java.util.*;
public class HollowRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int m = input.nextInt();
		for(int i = 0 ; i <= n ; i++) {
			for(int j = 0 ; j <= m ; j++) {		
				if(i == 0 || j == 0 || i == n || j == m) {
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}

	}

}
