package Pattern;


//*****
//*****
//*****
//*****



import java.util.*;
public class Square {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0 ; i < n ; i++) { // no. of rows
			for(int j = 0 ; j <= n ; j++) {  // no. of stars
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
