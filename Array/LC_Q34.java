package Binary_Search;
import java.util.*;
public class LC_Q34 {
	
	static int[] searchRange(int[] nums , int target) {
		
		int[] res = new int[2];
		
		int ans = -1;
		int low = 0 , high = nums.length - 1;
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(nums[mid] == target) {
				ans = mid;
				high = mid - 1;     // for first half
			}else if(nums[mid] > target) high = mid - 1;
			else low = mid + 1;
		}
		res[0] = ans;
		
		low = 0;
		high = nums.length - 1;
		ans = -1;
		while(low <= high) {
			int mid = low + (high - low)/2;
			if(nums[mid] == target) {
				ans = mid;
				low = mid + 1; // for second half
			}else if(nums[mid] > target) high = mid - 1;
			else low = mid + 1;
	}
		res[1] = ans;
		
		return res;
	}
		
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		int x = input.nextInt();
		int[] ans = searchRange(arr,x);
		System.out.print(Arrays.toString(ans));
	}

}
