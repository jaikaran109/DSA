package Binary_Search;


// find target in 2D Matrix by Binary Search
// for this array must be sorted in row and col

// Eg :- 10 20 30 40
//		 15 25 35 45
//		 28 29 37 49
//		 33 34 38 50
// target = 37



// row = 0 , col = matrix.length - 1; -- initial ye h 
// isme samjho
// if target == arr[row][col] -- found
// if arr[row][col] > target ;   -- matlab agr 40 > 37 h to last col ke sare elements greater honge isiliye col--
// if arr[row][col] < target ; -- matlab agr 40 < target se chota h to hm uss row ko hi ignore kr skte h kyuki baki values bhi choti hi hongi -- if 40 < target then  10 is also less than target == row++;





import java.util.*;
public class search_target_inMatrix {
	
	static int[] search(int[][] matrix , int target) {
		
		int row = 0;
		int col = matrix.length - 1;
		
		while(row < matrix.length && col >= 0) {
			if(matrix[row][col] == target) return new int[] {row,col};
			else if(matrix[row][col] < target) row++;
			else col--;
		}
		return new int[] {-1,-1};
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		int row = input.nextInt(); // row length
		int col = input.nextInt(); // col length
		
		
		int[][] arr = new int[row][col];
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				arr[i][j] = input.nextInt();  // input
			}
		}
		
		int x = input.nextInt();  // target
		
		int[] ans = search(arr,x);
		System.out.print(Arrays.toString(ans));
	}
}
