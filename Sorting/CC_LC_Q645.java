package Sorting;


//You have a set of integers s, which originally contains all the numbers from 1
//Unfortunately, due to some error, one of the numbers in s got duplicated to another
//number in the set, which results in repetition of one number and loss of another number.
//
//You are given an integer array nums representing the data status of this set after the error.
//
//Find the number that occurs twice and the number that is missing and return them in the
//form of an array.
//
//to n.
//
//Example 1:
//
//Input: nums = [1,2,2,4]
//Output: [2,3]
//
//Example 2:
//
//Input: nums = [1,1]
//Output: [1,2]


import java.util.*;
public class CC_LC_Q645 {

    public static int[] findErrorNums(int[] nums) {
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
                return new int[]{nums[j], j + 1};
            }
        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        int[] result = findErrorNums(nums);
        System.out.println("Duplicate & Missing: " + Arrays.toString(result));

        sc.close();
    }
}

