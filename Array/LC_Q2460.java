package Array;
import java.util.*;
public class LC_Q2460 {
	
	static int[] applyOperations(int[] nums) {
		for(int i = 0 ; i < nums.length - 1 ; i++) {
			if(nums[i] == nums[i+1]) {
				nums[i] = 2*nums[i];
				nums[i+1] = 0;
			}
		}
		int zero = 0;
		for(int i = 0 ; i < nums.length ; i++ ) {
			if(nums[i] > 0) nums[zero++] = nums[i];
		}
		
		while(zero < nums.length) {
			nums[zero++] = 0;
		}
		return nums;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size  = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print(Arrays.toString(applyOperations(arr)));

	}

}
