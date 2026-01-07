package Array;


//take 2Darray input


import java.util.*;
public class UserInput2DArray {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int rows = input.nextInt();
		int cols = input.nextInt();
		int[][] arr = new int[rows][cols];
		
		//input
		//rows
		for(int i = 0 ; i < rows ; i++) {
			//columns
			for(int j = 0 ; j < cols ; j++) {
				arr[i][j] = input.nextInt();
			}		
		}
		
		
		
		//output
		for(int i = 0 ; i < rows ; i++) {
			for(int j = 0 ; j < cols ; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
