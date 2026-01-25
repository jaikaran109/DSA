package Array;
import java.util.*;
public class LC_Q1732 {

	static int largestAltitude(int[] gain) {
		int max = 0;
		int[] arr = new int[gain.length + 1];
		arr[0] = 0;
		for(int i = 1 ; i <= gain.length ; i++) {
			arr[i] = gain[i - 1] + arr[i - 1];
		}
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] > max) max = arr[i];
		}
		return max;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] nums = new int[size];
		for(int i = 0 ; i < size ; i++) {
			nums[i] = input.nextInt();
		}
		int ans = largestAltitude(nums);
		System.out.print(ans);

	}

}



//  L E E T C O D E
//class Solution {
//    public int largestAltitude(int[] gain) {
//        int[] arr = new int[gain.length + 1];
//        arr[0] = 0;
//        for(int i = 1 ; i <= gain.length ; i++){
//            arr[i] = gain[i - 1] + arr[i - 1];
//        }
//        int max = 0;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] > max){
//                max = arr[i];
//            }
//        }
//        return max;
//    }
//}
