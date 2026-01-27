package Binary_Search;


//array of infinite numbers

//Difficulty Level : Medium . Last Updated : 07 May, 2021

//Suppose you have a sorted array of infinite numbers, how would you search an
//element in the array?

//Source: Amazon Interview Experience.


//Since array is sorted, the first thing clicks into mind is binary search, but the
//problem here is that we don't know size of array.
//If the array is infinite, that means we don't have proper bounds to apply binary
//search. So in order to find position of key, first we find bounds and then apply
//binary search algorithm.
//Let low be pointing to 1st element and high pointing to 2nd element of array, Now
//compare key with high index element,
//->if it is greater than high index element then copy high index in low index and
//double the high index.
//->if it is smaller, then apply binary search on high and low indices found.






// -- you can solve it by using .length but pls avoid bcz its infinite array 
// -- you can solve by linear search but that is not the correct way  -- time complexity - O(n)
// -- you can solve using two pointer approach but again thats not the correct way -- time complexity - O(n)
// Since its given that array is sorted  soo try to apply Binary Search


import java.util.*;
public class InfiniteSortedArray {
	
	static int search(int[] nums , int target) {
		int low = 0;
		int high = 1;
		while(high < nums.length && target > nums[high]) {  // to avoid index out of the bound error
			low = high ;
			high = high * 2; // add double the size 
		}
		
		high = Math.min(high, nums.length - 1);  // to avoid index out of the bound error
		
		
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(nums[mid] == target) return mid;
			else if(nums[mid] > target) high = mid - 1;
			else low = mid + 1;
		}
		return -1;
		
		
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size]; 
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		int x = input.nextInt();
		int ans = search(arr,x);
		System.out.print(ans);

	}

}
