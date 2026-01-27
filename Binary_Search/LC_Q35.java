package Binary_Search;
import java.util.*;
public class LC_Q35 {

	public static void main(String[] args) {
		
		
		// Ques 
		
		
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] nums = new int[size];
		for(int i = 0 ; i < size ; i++) {
			nums[i] = input.nextInt();
		}
		
		int target = input.nextInt();
		
		
		// Solution 
		
		int low = 0;
		int high = nums.length - 1;
		while(low <= high) {
			int mid = low + ( high - low )/2;
			if(nums[mid] == target)
				System.out.println(mid); // return index if exist
			else if(nums[mid] > target)
				high = mid - 1;
			else
				low = mid + 1;
		}
		System.out.println(low);  // return the place 
	}

}



//LEETCODE Solution
//class Solution {
//    public int searchInsert(int[] nums, int target) {
//        int low = 0 ; int high = nums.length - 1;
//        while(low <= high){
//            int mid = low + (high - low)/2;
//            if(nums[mid] == target)
//                return mid;
//            else if(nums[mid] > target)
//                high = mid - 1;
//            else
//                low = mid + 1;
//        }
//
//        return low;
//    }
//}
