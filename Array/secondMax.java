package Array;


//Find the second largest element in an array


import java.util.*;
public class secondMax {
	
	static int secMax(int[] nums) {
	    if (nums.length < 2) return -1;

	    int largest = Integer.MIN_VALUE;
	    int secondLargest = Integer.MIN_VALUE;

	    for (int i = 0; i < nums.length; i++) {
	        if (nums[i] > largest) {
	            secondLargest = largest;
	            largest = nums[i];
	        } else if (nums[i] > secondLargest && nums[i] != largest) {
	            secondLargest = nums[i];
	        }
	    }

	    if (secondLargest == Integer.MIN_VALUE)
	        return -1;

	    return secondLargest;
	}
	
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print(secMax(arr));
	}

}
