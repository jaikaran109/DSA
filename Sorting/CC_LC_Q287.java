package Sorting;


//Given an array of integers nums
//integer is in the range [1, n]) inclusive.
//
//There is only one repeated number in nums, return this repeated number.
//
//You must solve the problem without modifying the array nums and using
//only constant extra space.
//
//containing n + 1
//
//integers where each
//
//Example 1:
//
//Input: nums = [1,3,4,2,2]
//Output: 2
//
//Example 2:
//
//Input: nums = [3,1,3,4,2]
//Output: 3
//
//Example 3:
//
//Input: nums = [3,3,3,3,3]
//Output: 3

import java.util.*;
public class CC_LC_Q287 {

    public static int findDuplicate(int[] nums) {
        int i = 0;

        while (i < nums.length) {
            int x = nums[i] - 1;

            if (nums[i] != nums[x]) {
                int temp = nums[i];
                nums[i] = nums[x];
                nums[x] = temp;
            } else {
                i++;
            }
        }

        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int duplicate = findDuplicate(nums);
        System.out.println("Duplicate number is: " + duplicate);

        sc.close();
    }
}
