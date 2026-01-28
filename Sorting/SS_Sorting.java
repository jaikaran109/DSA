package Sorting;

import java.util.*;

public class SS_sorting {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int size = input.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }

        // Selection Sort (max element ko end me le ja rahe hain)
        for (int i = 0; i < arr.length; i++) {

            int last = arr.length - i - 1;
            int maxIndex = 0;

            // find max element index from 0 to last
            for (int j = 0; j <= last; j++) {
                if (arr[j] > arr[maxIndex]) {
                    maxIndex = j;
                }
            }

            // swap max element with last index
            int temp = arr[maxIndex];
            arr[maxIndex] = arr[last];
            arr[last] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}












//package Sorting;
//
//import java.util.*;
//
//public class SS_sorting {
//
//	static int[] selection(int[] arr) {
//		
//	    // selection sort
//	    for(int i = 0; i < arr.length ; i++) {
//	    	//find the max item in the remaining array and swap with the correct index
//	    	int last = arr.length - i - 1;
//	    	int maxIndex = getMaxIndex(arr,0,last);
//	    	swap(arr,maxIndex,last);
//	    }
//	    return arr;
//	}
//	
//	
//	static int getMaxIndex(int[] arr ,int start , int end) {
//		int max= start;
//		for(int i = start ; i <= end ; i++) {
//			if(arr[max] < arr[i]) max = i;
//		}
//		return max;
//	}
//	
//	
//	static void swap(int[] arr , int first , int second) {
//		int temp = arr[first];
//		arr[first] = arr[second];
//		arr[second] = temp;
//	}
//	  
//	
//	public static void main(String[] args) {
//		Scanner input = new Scanner(System.in);
//		
//		int size = input.nextInt();
//		int[] nums = new int[size];
//		
//		for(int i = 0 ; i < size ; i++) {
//			nums[i] = input.nextInt();
//		}
//		System.out.println(Arrays.toString(selection(nums)));
//	}
//
//
//}

