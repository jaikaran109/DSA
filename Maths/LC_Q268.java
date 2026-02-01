package MATHS;


//Given an array nums containing n distinct numbers in
//the range [0, n] , return the only number in the range
//that is missing from the array.
//
//Example 1:
//
//Input: nums = [3,0,1]
//
//Output: 2
//
//Explanation:
//
//n = 3 since there are 3 numbers, so all numbers are
//in the range [0,3]. 2 is the missing number in the
//range since it does not appear in nums
//
//Example 2:
//
//Input: nums = [0,1]
//
//Output: 2
//
//Explanation:
//
//n = 2 since there are 2 numbers, so all numbers are
//in the range [0,2]. 2 is the missing number in the
//range since it does not appear in nums


import java.util.*;
public class LC_Q268 {
	
	static int missingNumber(int[] nums) {
		int sum = 0;
        int actualSum = nums.length*(nums.length + 1) / 2;
        for(int i = 0 ; i < nums.length ; i++){
            sum += nums[i];
        }
        return actualSum - sum;
	}
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int size = input.nextInt();
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			arr[i] = input.nextInt();
		}
		System.out.print(missingNumber(arr));

	}

}
