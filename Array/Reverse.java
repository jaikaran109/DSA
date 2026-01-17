package Array;


//Reverse an array


import java.util.*;
public class reverse {
	static int[] rev(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		while(low < high) {
			int temp = nums[low];
			nums[low] = nums[high];
			nums[high] = temp;
			low++;
			high--;
		}
		return nums;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print(Arrays.toString(rev(arr)));
	}

}
