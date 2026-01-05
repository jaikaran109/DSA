package Pattern;


//    1 
//   2 2 
//  3 3 3 
// 4 4 4 4 
//5 5 5 5 5 



import java.util.*;
public class NumberPyramid {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = n ; j > i ; j--) {
				System.out.print(" ");
			}
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}

	}

}
