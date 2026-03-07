package Exam_4thSem;


//Given an array nums of size n, return the majority element.
//        The majority element is the element that appears more than [n / 2]
//        times. You may assume that the majority element always exists in the
//        array.
//        Example 1:
//        Input: nums = [3,2,3]
//        Output: 3
//        Example 2:
//        Input: nums = [2,2,1,1,1, 2, 2]
//        Output: 2
//        Constraints:
//
//        n == nums.length
//        1 <= n <= 5 * 104
//        -109 <= nums[i] <= 109


import java.util.*;
public class MajorityElement {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] nums = new int[size];
        for(int i = 0 ; i < size ; i++){
            nums[i] = input.nextInt();
        }
        for(int i = 0; i < nums.length; i++){
            int count = 0;
            for(int j = 0; j < nums.length; j++){
                if(nums[i] == nums[j])
                    count++;
            }
            if(count > nums.length/2) {
                System.out.println(nums[i]);
                return;
            }
        }
        System.out.println(-1);;
    }
}


//Time  : O(n^2)
//Space : o(1))




// Arrays.sort(nums);
//return nums[nums.length/2];
//Time  : O(n log n)
//Space : O(1)
