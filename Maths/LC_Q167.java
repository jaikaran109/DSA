package MATHS;

import java.util.*;
public class LC_Q167 {
	static int[] twoSum(int[] nums , int target) {
		int left = 0 ;
		int right = nums.length - 1;
		while(left < right){
			int sum = nums[left] + nums[right];
			if(sum == target) return new int[] {left + 1 , right + 1};
			else if(sum > target) right--;
			else left++;
		}
		return new int[] {-1,-1};
	}
	public static void main(String arg[]) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size  ; i++) {
			arr[i] = input.nextInt();
		}
		int x = input.nextInt();
		int[] ans = twoSum(arr,x);
		System.out.print(Arrays.toString(ans));

		
	}
}
