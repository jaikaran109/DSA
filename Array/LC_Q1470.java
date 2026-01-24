package Array;
import java.util.*;
public class LC_Q1470 {
	
	static int[] shuffle(int[] nums, int n) {
		int[] arr = new int[n * 2];
		for(int i = 0 ; i < n ; i++) {
			arr[2 * i] = nums[i];
			arr[2 * i + 1] = nums[n + i];
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] nums = new int[size * 2];
		for(int i = 0 ; i < size * 2 ; i++) {
			nums[i] = input.nextInt();
		}
		int[] ans = shuffle(nums,size);
		System.out.print(Arrays.toString(ans));
	}

}




// L E E T C O D E
//class Solution {
//    public int[] shuffle(int[] nums, int n) {
//        int[] arr = new int[2 * n];
//        for(int i = 0 ; i < n ; i++){
//            arr[2 * i] = nums[i];
//            arr[2 * i + 1] = nums[i + n];
//        }
//        return arr;
//    }
//}
