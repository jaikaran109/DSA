package Pattern;


//    0 
//   1 1 
//  2 2 2 
// 3 3 3 3 
//4 4 4 4 4 



import java.util.Scanner;

public class NumberTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0 ; i < n ; i++) {
			for(int j = n - 1; j > i ; j--) {
				System.out.print(" ");
			}
			for(int j = 0 ; j <= i ; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
