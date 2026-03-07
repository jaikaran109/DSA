package Exam_4thSem;


//Given an array of integers nums which is sorted in ascending order,
//and an integer target, write a function to search target in nums. If
//        target exists, then return its index. Otherwise, return -1.
//You must write an algorithm with O(log n) runtime complexity.
//
//Example 1:
//Input: nums = [-1,0,3,5,9,12], target = 9
//Output: 4
//Explanation: 9 exists in nums and its index is 4
//
//Example 2:
//Input: nums = [-1,0,3,5,9,12], target = 2
//Output: -1
//Explanation: 2 does not exist in nums so return -1
//
//Constraints:
//
//        1 <= nums.length <= 104
//        -104 < nums[i], target < 104
//All the integers in nums are unique.
//nums is sorted in ascending order.


import java.util.*;
public class BinarySearch {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        int target = input.nextInt();
        int low = 0;
        int high = size - 1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == target) {
                System.out.println(mid);
                return;
            }else if(arr[mid] > target) high = mid - 1;
            else low = mid + 1;
        }
        System.out.println(-1);
    }
}

// Time  : O(log n)
// Space : O(1)
