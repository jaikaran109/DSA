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
public class ReverseArray {
    static int[] reverse(int[] nums) {
        for(int i = 0 ; i < nums.length / 2 ; i++){
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length - i-1] = temp;
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
        System.out.print(Arrays.toString(reverse(arr)));
    }
}


//Time Complexity  -- O(n)
//Space Complexity -- O(1)
//Time Complexity  -- O(n)
//Space Complexity -- O(1)






//Reverse an array


// import java.util.*;
// public class reverse {
// 	static int[] rev(int[] nums) {
// 		int low = 0;
// 		int high = nums.length - 1;
// 		while(low < high) {
// 			int temp = nums[low];
// 			nums[low] = nums[high];
// 			nums[high] = temp;
// 			low++;
// 			high--;
// 		}
// 		return nums;
// 	}
// 	public static void main(String[] args) {
// 		Scanner input = new Scanner(System.in);
// 		int size = input.nextInt();
// 		int[] arr = new int[size];
// 		for(int i = 0 ; i < size ; i++) {
// 			arr[i] = input.nextInt();
// 		}
// 		System.out.print(Arrays.toString(rev(arr)));
// 	}

// }
