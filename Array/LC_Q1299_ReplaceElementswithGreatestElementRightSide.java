class Solution {
    public int[] replaceElements(int[] arr) {
        int[] maxArray = new int[arr.length];
        maxArray[arr.length - 1] = -1;
        for(int i = arr.length - 2 ; i >= 0 ;i--){
            maxArray[i] = Math.max(arr[i+1],maxArray[i+1]);
        }
        return maxArray;
    }
}
