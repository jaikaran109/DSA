package Binary_Search;
import java.util.*;
public class LC_Q162 {

	static int findPeakElement(int[] nums) {
		int low = 0;
		int high = nums.length - 1;
		while(low < high) {
			int mid = low + (high - low) / 2;
			if(nums[mid] > nums[mid + 1]) high = mid;
			else low = mid + 1;
		}
		return low;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		int ans = findPeakElement(arr);
		System.out.print(ans);

	}

}



//          L E E T C O D E Solution
//class Solution {
//    public int findPeakElement(int[] nums) {
//        int low = 0;
//        int high = nums.length - 1;
//        while(low < high) {
//            int mid = low + (high - low) / 2;
//            if(nums[mid] > nums[mid + 1]) high = mid;
//            else low = mid + 1;
//        }
//        return low;
//    }
//}
