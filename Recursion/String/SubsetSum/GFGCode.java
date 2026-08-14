class Solution {
    public ArrayList<Integer> subsetSums(int[] arr) {
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        subset(arr,0,0,list);
        Collections.sort(list);
        return list;
    }
    private void subset(int[] nums , int ans , int idx , ArrayList<Integer> list){
        if(idx == nums.length){
            list.add(ans);
            return;
        }
        int ele = nums[idx];
        subset(nums,ans+ele,idx+1,list);    // pick
        subset(nums,ans,idx+1,list);    // skip
    }
}
