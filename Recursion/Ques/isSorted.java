package Recursion;

import java.util.*;

public class isSorted {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = input.nextInt();
		}
		int st = 0;
		System.out.println(sorted(arr , st));
	}
	static boolean sorted(int[] arr , int st) {
		
		if(st == arr.length - 1) return true;
		if(arr[st] > arr[st+1]) return false;
		return sorted(arr,st + 1);
	}
}
