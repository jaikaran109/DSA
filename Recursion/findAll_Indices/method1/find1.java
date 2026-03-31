package Recursion;

import java.util.*;

public class findAllIndex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		int[] arr = new int[n];
		for(int i = 0 ; i < n ; i++) {
			arr[i] = input.nextInt();
		}
		int target = input.nextInt();
		int st = 0 ;
		findIndices(arr,target,st);
		System.out.println(list);
		
  }
  
	static ArrayList<Integer> list = new ArrayList<>();
	static void findIndices(int[] arr , int target , int st) {
		if(st == arr.length) return;
		if(arr[st] == target) list.add(st);
		findIndices(arr,target,st+1);
  }
}

