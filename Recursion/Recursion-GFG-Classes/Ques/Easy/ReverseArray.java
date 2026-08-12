// GFG

class Solution {
    public int[] reverseArray(int arr[]) {
        return helper(arr , 0 , arr.length - 1);
    }
    static int[] helper(int[] nums , int st , int end){
        
        if(st > end) return nums;
        
        int temp = nums[st];
        nums[st] = nums[end];
        nums[end] = temp;
        
        return helper(nums,st+1,end-1);
    }
}
