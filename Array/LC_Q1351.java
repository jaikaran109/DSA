package Array;

import java.util.*;

public class LC_Q1351 {
	
	static int countNegatives(int[][] nums) {
		int count = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			for(int j = 0 ; j < nums[i].length ; j++) {
				if(nums[i][j] < 0) count ++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int col = input.nextInt();
		int[][] arr = new int[row][col];
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				arr[i][j] = input.nextInt();
			}
		}
		
		System.out.print(countNegatives(arr));
	}

}
