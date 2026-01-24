package Array;
import java.util.*;
public class LC_Q1672 {

	
	static int maximumWealth(int[][] arr) {
		int max = 0 ;
		for(int i = 0 ; i < arr.length ; i++) {
			int sum = 0;
			for(int j = 0 ; j < arr[i].length ; j++) {
				sum += arr[i][j];
			}
			if(sum > max) max = sum;
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int row = input.nextInt();
		int col = input.nextInt();
		
		int[][] nums = new int[row][col];
		for(int i = 0 ; i < row ; i++) {
			for(int j = 0 ; j < col ; j++) {
				nums[i][j] = input.nextInt();
			}
		}
		
		int ans = maximumWealth(nums);
		System.out.print(ans);
	}

}



// L E E T C O D E

// class Solution {
//     public int maximumWealth(int[][] nums) {
//         int max = 0 ;
//         for(int i = 0 ; i < nums.length ; i++){
//             int sum = 0;
//             for(int j = 0 ; j < nums[i].length ; j++){
//                 sum += nums[i][j];
//             }
//             if(sum > max) max = sum ;
//         }
//         return max;
//     }
// }
