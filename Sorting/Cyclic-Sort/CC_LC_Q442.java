// Cyclic Sort
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0;

        while (i < nums.length) {
            int x = nums[i] - 1;

            if (nums[i] != nums[x]) {
                int temp = nums[i];
                nums[i] = nums[x];
                nums[x] = temp;
            } else {
                if(i != x && !list.contains(nums[i])) list.add(nums[i]);
                i++;
            }
        }

        return list;
    }
}


// Boolean Check 
// class Solution {
//     public List<Integer> findDuplicates(int[] nums) {
//         ArrayList<Integer> list = new ArrayList<>();
//         boolean[] check = new boolean[nums.length + 1];
//         for(int i = 0 ; i < nums.length ; i++){
//             if(check[nums[i]] && !list.contains(nums[i])){
//                 list.add(nums[i]);
//             }
//             check[nums[i]] = true;
//         }
//         return list;
//     }
// }





// import java.util.*;
// public class CC_LC_Q442 {

//     public static List<Integer> findDuplicates(int[] nums) {
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

//         ArrayList<Integer> list = new ArrayList<>();
//         for (int j = 0; j < nums.length; j++) {
//             if (nums[j] != j + 1) {
//                 list.add(nums[j]);
//             }
//         }
//         return list;
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         int n = sc.nextInt();
//         int[] nums = new int[n];

//         for (int i = 0; i < n; i++) {
//             nums[i] = sc.nextInt();
//         }

//         List<Integer> duplicates = findDuplicates(nums);

//         System.out.println("Duplicate elements: " + duplicates);

//         sc.close();
//     }
// }
