package Methods;


//Write a function that finds the maximum element in an array


import java.util.*;
public class MaximumElement {
	static int max(int[] nums) {
		
		
		if(nums.length == 0)
			return -1;
		
		
		int max = nums[0];
		for(int i = 1 ; i < nums.length ; i++) {
			if(nums[i] > max) max = nums[i];
		}
		return max; 
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print("maximum element is " + max(arr));

	}

}
