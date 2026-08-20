package Merge_Sort;
import java.util.*;
public class code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i= 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }
        mergeSort(arr, 0, size - 1);

        System.out.println("Sorted Array:");

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }
    static void mergeSort(int[] nums , int low , int high){
        if(low >= high) return ;

        int mid = low + (high - low) / 2;

        // Division

        mergeSort(nums,low,mid); // 1st half

        mergeSort(nums, mid + 1, high); // 2nd half

        // Merge
        merge(nums,low,mid,high);
    }

    static void merge(int[] nums , int low , int mid , int high){
        int[] temp = new int[high - low + 1];

        int i = low , j = mid + 1 , k = 0;

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



// Time Complexity - O(nlogn)
// Space Complexity - O(n)