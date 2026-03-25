package Exam_4thSem;


//Given an array arr[], check whether it is sorted in non-decreasing
//order. Return true if it is sorted otherwise false.
//Examples :- 1
//Input: arr[] = [10, 20, 30, 40, 50]
//Output: true
//Example :- 2
//
//Explanation: The given array is sorted.
//        Input: arr[] = [90, 80, 100, 70, 40, 30]
//Output: false
//
//Explanation: The given array is not sorted.
//Constraints:
//
//        1 ≤ arr.size ≤ 106
//
//        - 109 ≤ arr[i] ≤ 109


import java.util.*;
public class CheckSorted {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        for(int i = 1 ; i < size ; i++){
            if(arr[i] < arr[i-1]) {
                System.out.println("false");
                return;
            }
        }
        System.out.println("true");
    }
}


// Time  : O(n)
// Space : O(1)
















 
// import java.util.*;
// public class CheckSorting {

// 	public static void main(String[] args) {
// 		Scanner input = new Scanner(System.in);
// 		int size = input.nextInt();
// 		int[] arr = new int[size];
		
// 		for(int i = 0 ; i < size ; i++) {
// 			arr[i] = input.nextInt();
// 		}
		
// 		boolean isAscending = true;
// 		for(int i = 0 ; i < arr.length - 1 ; i++) {
// 			if(arr[i] > arr[i+1])
// 				isAscending = false;
// 		}
		
// 		if(isAscending)
// 			System.out.print("The array is sorted in ascending order");
// 		else
// 			System.out.print("The array is not sorted in ascending order");
// 	}

// }
