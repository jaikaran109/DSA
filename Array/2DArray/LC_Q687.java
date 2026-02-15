class Solution {
    public int[][] transpose(int[][] nums) {
        int row = nums.length;
        int col = nums[0].length;
        int[][] arr = new int[col][row];

        for(int i = 0 ; i < nums.length ; i++){
            for(int j = 0 ; j < nums[i].length ; j++){
                arr[j][i] = nums[i][j];
            }
        }
        
        return arr;
    }
}
