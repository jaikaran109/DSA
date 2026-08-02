class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];
        int i = 0;
        while (i < nums.length) {
            int x = nums[i] - 1;

            if (nums[i] != nums[x]) {
                int temp = nums[x];
                nums[x] = nums[i];
                nums[i] = temp;
            } else {
                i++;
            }
        }
        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                ans[0] = nums[i];
                ans[1] = i+1;
                return ans;
            }
        }
        return new int[]{-1,-1};
    }
}



// import java.util.*;
// public class CC_LC_Q645 {

//     public static int[] findErrorNums(int[] nums) {
//         int i = 0;

//         while (i < nums.length) {
//             int x = nums[i] - 1;

//             if (nums[i] != nums[x]) {
//                 int temp = nums[i];
//                 nums[i] = nums[x];
//                 nums[x] = temp;
//             } else {
//                 i++;
//             }
//         }

//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != j + 1) {
//                 return new int[]{nums[j], j + 1};
//             }
//         }
//         return new int[]{-1, -1};
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         int[] result = findErrorNums(nums);
//         System.out.println("Duplicate & Missing: " + Arrays.toString(result));

//         sc.close();
//     }
// }

