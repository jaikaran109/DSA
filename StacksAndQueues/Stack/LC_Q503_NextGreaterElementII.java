class Solution {
    public int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        int n = nums.length;
        if(n == 1) return new int[]{-1};
        Arrays.fill(res, -1);
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0 ; i < nums.length * 2; i++){
            while(!st.isEmpty() && nums[st.peek()] < nums[i % n]){
                res[st.pop()] = nums[i % n];
            }
            if (i < n) st.push(i);  
        }
        return res;
    }
}
