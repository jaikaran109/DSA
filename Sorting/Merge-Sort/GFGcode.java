class Solution {
    public void mergeSort(int arr[], int l, int h) {
        // code here
        if(l >= h) return;
        
        int mid = l + (h - l)/2;
        
        mergeSort(arr,l,mid);
        
        mergeSort(arr,mid+1,h);
        
        merge(arr,l,mid,h);
        
    }
    static void merge(int[] nums , int low , int mid , int high){
        
        int i = low , j = mid + 1, k = 0;
        int[] temp = new int[high - low + 1];
        
        while(i <= mid && j <= high){
            if(nums[i] <= nums[j]){
                temp[k] = nums[i];
                i++;
            }else{
                temp[k] = nums[j];
                j++;
            }
            k++;
        }
        
        while(i <= mid){
            temp[k++] = nums[i++];
        }
        
        while(j <= high){
            temp[k++] = nums[j++];
        }
        
        for(int x = 0 ; x < temp.length ; x++){
            nums[low + x] = temp[x];
        }
        
    }
    
}