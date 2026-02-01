package ArrayList;


//Given an integer array nums of length n where all the integers of nums
//are in the range ([1, n] and each integer appears at most twice, return
//an array of all the integers that appears twice.
//
//You must write an algorithm that runs in 0(n) time and uses only
//constant auxiliary space, excluding the space needed to store the output
//
//Example 1:
//
//Input: nums = [4,3,2,7,8,2,3,1]
//Output: [2,3]
//
//Example 2:
//
//Input: nums = [1,1,2]
//Output: [1]
//
//Example 3:
//
//Input: nums = [1]
//Output: []
		
		
import java.util.*;
public class LC_Q442 {

  public static List<Integer> findDuplicates(int[] nums) {
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

      ArrayList<Integer> list = new ArrayList<>();
      for (int j = 0; j < nums.length; j++) {
          if (nums[j] != j + 1) {
              list.add(nums[j]);
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

      List<Integer> duplicates = findDuplicates(nums);

      System.out.println("Duplicate elements: " + duplicates);

      sc.close();
  }
}
