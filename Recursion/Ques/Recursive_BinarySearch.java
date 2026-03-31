package Recursion;


import java.util.*;
public class Recursive_BinarySearch {

	
	static int search(int[] nums , int target , int start , int end) {
		if(start > end) return -1;
		
		int mid = start + (end - start) / 2;
		
		if(nums[mid] == target) return mid;
		if(nums[mid] > target) return search(nums,target,start,mid - 1);
		return search(nums,target,mid,end);
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		int x = input.nextInt();
		
		int st = 0;
		int end = arr.length - 1;
		
		System.out.println(search(arr,x,st,end));

	}

}
