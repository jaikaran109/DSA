class Solution {
    public int[] twoSum(int[] n, int t) {

        int left = 0;
        int right = n.length - 1;

        while (left < right) {
            int sum = n[left] + n[right];

            if (sum == t) {
                return new int[]{left + 1, right + 1}; // 1-based index
            } 
            else if (sum > t) {
                right--;
            } 
            else {
                left++;
            }
        }

        return new int[]{-1, -1};
    }
}
