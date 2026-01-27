/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        
        //find peak
        int peak = findPeak(mountainArr);

        //initial res = -1;
        int res = -1;

        // edge case
        if(target > mountainArr.get(peak)) return -1;
        if(target == mountainArr.get(peak)) return peak;

        res = searchAsc(target , mountainArr , 0 , peak - 1);
        if(res != -1) return res;
        return searchDesc(target,mountainArr,peak + 1,mountainArr.length() - 1);
        
    }


    private int searchAsc(int target , MountainArray arr , int st , int end){
        while(st <=  end){
            int mid = st + (end - st) / 2;
            if(arr.get(mid) == target) return mid;
            else if(arr.get(mid) > target) end = mid - 1;
            else st = mid + 1;
        }
        return -1;
    }


    private int searchDesc(int target , MountainArray arr , int st , int end){
        while(st <=  end){
            int mid = st + (end - st) / 2;
            if(arr.get(mid) == target) return mid;
            else if(arr.get(mid) < target) end = mid - 1;
            else st = mid + 1;
        }
        return -1;
    }


    private int findPeak(MountainArray arr){
        int low = 0;
        int high = arr.length() - 1;
        while(low < high){
            int mid = low + (high - low) / 2;
            if(arr.get(mid) > arr.get(mid + 1)) high = mid;
            else low = mid + 1;
        }
        return low;
    }
}
