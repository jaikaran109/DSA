package Array;


import java.util.*;
public class LC169_Majority_Element {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print(BoyerMooreVotingAlgorithm(arr));
	}
	static int BoyerMooreVotingAlgorithm(int[] nums) {
	    int val = nums[0];
	    int count = 1;

	    for (int i = 1; i < nums.length; i++) {
	        if (nums[i] == val) {
	            count++;
	        } else {
	            count--;
	            if (count == 0) {
	                val = nums[i];
	                count = 1;
	            }
	        }
	    }
	    return val;
	}

}
