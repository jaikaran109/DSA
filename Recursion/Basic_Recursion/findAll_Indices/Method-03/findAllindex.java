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
			
		System.out.println(find2(arr,target,st));
	}
	
	
//	Return the list but don't take it as a argument -- means we are creating the list inside the body
//	problem - every call create the new list
	
	static ArrayList<Integer> find2(int[] arr, int target, int st) {

        ArrayList<Integer> list = new ArrayList<>();

        if(st == arr.length) return list;

        // check current index
        if(arr[st] == target) {
            list.add(st);
        }

        // recursive call
        ArrayList<Integer> ansFromBelow = find2(arr, target, st + 1);

        list.addAll(ansFromBelow);

        return list;
//        KEY INSIGHT
//
//        👉 Har call apni list banata hai
//        👉 Neeche se list aati hai → usme add hota hai → upar jati hai
//        ye extra space lega kyuki isme list baar baar create ho rhi
    }
}
