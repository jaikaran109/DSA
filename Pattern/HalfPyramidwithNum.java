package Pattern;

//
//1 
//1 2 
//1 2 3 
//1 2 3 4 
//1 2 3 4 5 


import java.util.*;
public class HalfPyramidwithNum {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= i ; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
