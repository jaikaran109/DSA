package Array;

//Transpose N * M matrix 

import java.util.*;
public class Transpose2DArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt(); // outer
		int m = input.nextInt(); // inner
		int[][] arr = new int[n][m];
		
		// Input of 2D Array
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		
		
		//Original Array
		System.out.println("Original Array");
		for(int i = 0 ; i < n ; i++) {
			for(int j = 0 ; j < m ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
		
		// Transposed Array
		System.out.println("Transposed Array");
		for(int i = n - 1 ; i >= 0 ; i--) {
			for(int j = m - 1 ; j >= 0 ; j--) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
