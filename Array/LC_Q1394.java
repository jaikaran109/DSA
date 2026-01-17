package Array;

import java.util.*;
public class LC_Q1394 {
	
	static int findLucky(int[] nums) {
		int ans = -1;
		boolean[] visit = new boolean[nums.length];
		for(int i = 0 ; i < nums.length ; i++) {
			if(visit[i]) continue;
			int freq = 1;
			for(int j = i + 1; j < nums.length ; j++) {
				if(nums[i] == nums[j]) {
					freq++;
					visit[j] = true;
				}
			}
			if(nums[i] == freq) ans =Math.max(ans, freq); 

		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print(findLucky(arr));
	}

}
