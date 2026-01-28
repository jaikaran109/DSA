 package Sorting;


// Descending Order


import java.util.*;
public class BS_Desc{

	static int[] bubble(int[] arr) {
				
		
		// Bubble Sort 
		// Run the steps n-1 times
		for(int i = 0 ; i < arr.length ; i++) {
			//for each step , max item will come at the last respective index
			for(int j = 1 ; j < arr.length - i ; j++) {
				// swap if the item is smaller than the respective index 
				if(arr[j] > arr[j - 1]) {
					// swap
					int temp = arr[j - 1];
					arr[j - 1] = arr[j];
					arr[j] = temp ;
				}
			}
		}
		return arr;
	}
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int size = input.nextInt();
		int[] nums = new int[size];
		
		for(int i = 0 ; i < size ; i++) {
			nums[i] = input.nextInt();
		}
		
		System.out.print(Arrays.toString(bubble(nums)));
	}

}
