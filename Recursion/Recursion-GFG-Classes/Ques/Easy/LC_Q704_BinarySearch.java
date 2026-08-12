class Solution {

    static int helper(int[] nums , int target , int low , int high){

        int mid = low + (high - low) / 2;
        if(low > high) return -1; // base case

        if(nums[mid] == target) return mid;
        else if(nums[mid] > target) return helper(nums,target,low,mid-1);

        return helper(nums,target,mid+1,high);
    }

    public int search(int[] nums, int target) {
        int n = nums.length;
        return helper(nums,target,0,n-1);
    }
}
