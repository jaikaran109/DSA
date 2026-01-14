package Methods;


//Write a function to search an element in an array (Linear Search).


import java.util.*;
public class SearchElement {
	
	
	static  boolean search(int[] nums,int target) {
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] == target) return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int n = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print(search(arr,n));
	}

}
