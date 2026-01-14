package Methods;


//Write a function that reverses an array.


import java.util.*;
public class reverseArray {
	
	static void reverse(int[] nums) {
		 int start = 0, end = nums.length - 1;

		    while (start < end) {
		        int temp = nums[start];
		        nums[start] = nums[end];
		        nums[end] = temp;
		        start++;
		        end--;
		    }
		    System.out.print(Arrays.toString(nums));
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		reverse(arr);
	}

}
