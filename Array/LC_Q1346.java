package Array;
import java.util.*;
public class LC_Q1346 {
	
	static boolean check(int[] nums) {
		Arrays.sort(nums);
		for(int i = 0 ; i < nums.length ; i++) {
			int target = 2*nums[i];
			
			int low = 0;
			int high = nums.length - 1;
			while(low <= high) {
				int mid = low + (high - low)/2;
				if(nums[mid] == target && mid != i) {
					return true;
				}else if(nums[mid] < target) low =mid + 1;
				else high = mid - 1;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		
		
		System.out.print(check(arr));
		

	}

}
