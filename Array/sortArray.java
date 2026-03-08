package Exam_4thSem;


//Given an array of integers nums, sort the array in ascending order and
//return it.
//
//You must solve the problem without using any built-in functions in
//O(nlog(n)) time complexity and with the smallest space complexity
//possible.
//        Example 1:
//Input: nums = [5,2,3,1]
//Output: [1,2,3,5]
//Explanation: After sorting the array, the positions of some numbers
//are not changed (for example, 2 and 3), while the positions of other
//numbers are changed (for example, 1 and 5).
//Example 2:
//Input: nums = [5,1,1,2,0,0]
//Output: [0,0,1,1,2,5]
//Explanation: Note that the values of nums are not necessairly unique.
//Constraints:
//
//        1 <= nums.length <= 5 * 104
//        -5 * 104 <= nums[i] <= 5 * 104



import java.util.*;
public class sortArray {
    static int[] sorted(int[] nums) {
        for(int i = 0 ; i < nums.length ; i++){
            for(int j = i + 1 ; j < nums.length ; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    }
                }
            }
        return nums;
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        System.out.println(Arrays.toString(sorted(arr)));
    }
}

// Algorithm: Bubble Sort / Exchange Sort variation.
// Time complexity : O(n^2)
//
