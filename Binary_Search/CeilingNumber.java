package Binary_Search;


// Ceiling of a number


import java.util.*;
public class CeilingNumberjava {
	
	static int ceiling(int[] nums , int target) {
		
		if (target > nums[nums.length - 1]) return -1;
		
		
		int low = 0 , high = nums.length - 1;
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(nums[mid] == target) return nums[mid];
			else if(nums[mid] > target) high = mid - 1;
			else low = mid + 1;
		}
		return nums[low];
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		int x = input.nextInt();
		int ans = ceiling(arr,x);
		System.out.print(ans);
	}

}
