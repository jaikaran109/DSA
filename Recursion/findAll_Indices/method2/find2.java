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

		ArrayList<Integer> ans = find1(arr,target,st,new ArrayList<>());
		System.out.println(ans);
			
	}
	
//	Return ArrayList
	static ArrayList<Integer> find1(int[] arr , int target , int st , ArrayList<Integer> list){
		if(st == arr.length) return list;
		if(arr[st] == target) list.add(st);
		return find1(arr , target , st + 1 , list);
	}
}
