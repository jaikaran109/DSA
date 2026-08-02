class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
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
        // Find missing numbers
        for(i = 0; i < nums.length; i++){
            if(nums[i] != i + 1){
                list.add(i + 1);
            }
        }
        return list;
    }
}





// import java.util.*;
// public class CC_LC_Q448 {

// 	public static List<Integer> findDisappearedNumbers(int[] nums) {
//         int i = 0;

//         while (i < nums.length) {
//             int correctIndex = nums[i] - 1;

//             if (nums[i] != nums[correctIndex]) {
//                 int temp = nums[correctIndex];
//                 nums[correctIndex] = nums[i];
//                 nums[i] = temp;
//             } else {
//                 i++;
//             }
//         }

//         ArrayList<Integer> list = new ArrayList<>();
//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != j + 1) {
//                 list.add(j + 1);
//             }
//         }
//         return list;
//     }
	
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         List<Integer> result = findDisappearedNumbers(nums);
//         System.out.println(result);
// 	}

// }
