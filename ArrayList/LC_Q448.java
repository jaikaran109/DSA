package ArrayList;


//Given an array nums of
//n integers where nums [i] is in the range
//[1, n], return an array of all the integers in the range ([1, n] that
//do not appear in nums
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [5,6]
//
//Example 2:
//
//Input: nums = [1,1]
//Output: [2]
		
		
import java.util.*;
public class LC_Q448 {

	public static List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;

        // Cyclic sort logic
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;

            if (nums[i] != nums[correctIndex]) {
                int temp = nums[correctIndex];
                nums[correctIndex] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }

        // Store missing numbers
        ArrayList<Integer> list = new ArrayList<>();
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                list.add(j + 1);
            }
        }
        return list;
    }
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] nums = new int[n];

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println(result);
	}

}
