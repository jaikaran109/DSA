package Binary_Search;

import java.util.Scanner;

public class LC_Q852 {
	static int peakIndexInMountainArray(int[] nums) {
		int low = 0 , high = nums.length - 1;
		while(low < high) {
			int mid = low + (high - low)/2;
			if(nums[mid] > nums[mid+1]) {
				// you are in decreasing part of an array
				// this may be the ans , but we also check left side of array
				// this is why high != mid - 1
				high = mid;
			}else {
				//now we are on the ascending part of array
				low = mid + 1; // bcz we know that mid + 1 > mid
			}
		}
		// in the end low == high and pointing to the largest number bcz of the 2 checks above 
		// you can dry run this code for better understanding
		return low;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		int ans = peakIndexInMountainArray(arr);
		System.out.print(ans);
	}

}
