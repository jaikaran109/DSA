class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int i = 0 , j = 0 , max = 0 , sum = 0;
        HashSet<Integer> set = new HashSet<>();
        while(i < nums.length && j < nums.length){
            while(set.contains(nums[j])){
                set.remove(nums[i]);
                sum -= nums[i];
                i++;
            }
            sum += nums[j];
            set.add(nums[j]);
            max = Math.max(max,sum);
            j++;
        }
        return max;
    }
}
