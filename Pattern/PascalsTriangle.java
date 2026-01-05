package Pattern;


//    1 
//   1 1 
//  1 2 1 
// 1 3 3 1 
//1 4 6 4 1 



import java.util.*;
public class PascalsTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 0 ; i < n ; i++) {
			for(int j = n ; j > i ; j--) {
				System.out.print(" ");
			}
			int count = 1;
			for (int j = 0; j <= i; j++) {
                System.out.print(count + " ");
                count = count * (i - j) / (j + 1);
            }
            System.out.println();
		}

	}

}
