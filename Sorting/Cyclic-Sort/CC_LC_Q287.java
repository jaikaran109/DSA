// Most Optimal - use 2 pointer

// Optimal Soln
class Solution {
    public int findDuplicate(int[] nums) {
        boolean[] isFound = new boolean[nums.length + 1];

        for(int num : nums){
            if(isFound[num]) return num;
            isFound[num] = true;
        }
        return -1;
    }
}



// Cyclic Sort
// class Solution {
//     public int findDuplicate(int[] nums) {
//         int i = 0;
//         while(i < nums.length){
//             int x = nums[i] - 1;
//             if(nums[i] != nums[x]){
//                 int temp = nums[i];
//                 nums[i] = nums[x];
//                 nums[x] = temp;
//             }else{
//                 if(i != x) return nums[i];
//                 i++;
//             }
//         }
//         return -1;
//     }   
// }


// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashMap<Integer,Integer> map = new HashMap<>();
//         for(int i = 0 ; i < nums.length ; i++){
//             map.put(nums[i],map.getOrDefault(nums[i],0)+1);
//             if(map.get(nums[i]) > 1) return nums[i];
//         }
//         return -1;
//     }
// }


// class Solution {
//     public int findDuplicate(int[] nums) {
//         HashSet<Integer> set = new HashSet<>();
//         for(int i = 0 ; i < nums.length ; i++){
//             if(set.contains(nums[i])) return nums[i];
//             set.add(nums[i]);
//         }
//         return -1;
//     }
// }