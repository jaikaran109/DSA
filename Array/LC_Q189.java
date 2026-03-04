package Exam_4thSem;


//Array Reverse
//        Given an array arr[], the task is to reverse the array. Reversing an
//        array means rearranging the elements such that the first element
//        becomes the last, the second element becomes second last and so on.
//
//        Examples:1
//        Input: arr[] = {1, 4, 3, 2, 6, 5}
//        Output: {5, 6, 2, 3, 4, 1}
//        Explanation: The first element 1 moves to last position, the second
//        element 4 moves to second-last and so on.
//
//        Examples:1
//        Input: arr[] = {4, 5, 1, 2}
//        Output: {2, 1, 5, 4}
//        Explanation: The first element 4 moves to last position, the second
//        element 5 moves to second last and so on.


import java.util.*;
public class RotatedArray {
    static int[] rotated(int[] nums,int steps) {
        int n = nums.length;
        for(int k = 0 ; k < steps ; k++) {
            int temp = nums[n - 1];
            for (int i = n - 1; i > 0; i--) {
                nums[i] = nums[i - 1];
            }
            nums[0] = temp;
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
        int k = input.nextInt();
        System.out.println(Arrays.toString(rotated(arr,k)));
    }
}


// Time Complexity  : O(n × k)
// Space Complexity : O(1)








// class Solution {
//     public void rotate(int[] nums, int k) {
//         int n = nums.length;
//         k = k % n;
//         reverse(nums,0,n-1);
//         reverse(nums,0,k-1);
//         reverse(nums,k,n-1);
//     }
//     static void reverse(int[] arr, int start, int end) {
//         while(start < end){
//             int temp = arr[start];
//             arr[start] = arr[end];
//             arr[end] = temp;

//             start++;
//             end--;
//         }
//     }
// }


// Time : O(n)
// Space : O(1)
