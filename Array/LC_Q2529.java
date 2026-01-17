package Array;
import java.util.*;
public class LC_Q2529 {
	
	static int maximumCount(int[] nums) {
		int neg = 0;
		int pos = 0;
		for(int i = 0 ; i < nums.length ; i++) {
			if(nums[i] == 0) continue;
			else if(nums[i] > 0) pos++;
			else neg++;
		}
		if(pos >= neg) return pos;
		else return neg;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print(maximumCount(arr));

	}

}


//Code is Correct but not optimal -- you can prefer Binary Search
