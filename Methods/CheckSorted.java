package Methods;


//Write a function that checks if an array is sorted or not.


import java.util.*;
public class CheckSorted {
	
	
	static boolean sorted(int[] nums) {
		for(int i = 0 ; i < nums.length - 1 ; i++) {
			if(nums[i] > nums[i+1]) return false;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print(sorted(arr));

	}

}
