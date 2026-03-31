package Recursion;

import java.util.*;

public class searchTarget {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = input.nextInt();
		}
		int target = input.nextInt();
		int st = 0;
		System.out.println(search(arr,target,st));
		System.out.println(index(arr,target,st));
	}
	static boolean search(int[] arr , int target , int st) {
		if(st == arr.length) return false;
		return arr[st] == target || search(arr,target,st+1);
	}
 
	static int index(int[] arr , int target , int st) {
		if(st == arr.length) return -1;
		if(arr[st] == target) return st;
		return index(arr , target , st+1);
	}
	
}
