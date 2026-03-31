package Recursion;

import java.util.*;

public class rotatedBinarySearch {

	public static void main(String[] args) {
		int[] arr = {5, 6, 7, 8, 9, 1, 2, 3};
		System.out.println(search(arr,8,0,arr.length - 1));
	}
	static int search(int[] arr , int target , int st , int end) {
		if(st > end) return -1;
		
		int m = st + (end - st) / 2;
		if(arr[m] == target) return m;
		
		if(arr[st] <= arr[m]) {
			if(target > arr[st] && target < arr[m]) return search(arr,target,st,m-1);
			else return search(arr,target,m+1,end);
		}
		if(target >= arr[m] && target <= arr[end]) {
			return search(arr,target,m+1,end);
		}
		return search(arr,target,st,m-1);
	}

}
