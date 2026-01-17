package Array;
import java.util.*;
public class LC_Q74 {   // Similar  Ques 240
	static boolean searchMatrix(int[][] nums , int target) {
		for(int i = 0 ; i < nums.length ; i++) {
			int low = 0;
			int high = nums[i].length - 1;
			while(low <= high){
				int mid = low + (high - low)/2;
				if(nums[i][mid] == target) return true;
				else if(nums[i][mid] > target) high = mid - 1;
				else low = mid + 1;
			}
		}
		return false;
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
		int x = input.nextInt();
		System.out.print(searchMatrix(arr,x));
	}

}
