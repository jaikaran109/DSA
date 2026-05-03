import java.util.*;

public class Sort_colors_Patient {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
        {
            arr[i] = scn.nextInt();
        }
        sortColors(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        scn.close();
    }

    public static void sortColors(int[] nums)
    {
        int low = 0 ; 
        int mid = 0 ;
        int high = nums.length-1 ;
        while(mid <= high)
        {
            if(nums[mid] == 0)
            {
                swap(nums,low,mid);
                low++ ; 
                mid++ ;
            }
            else if(nums[mid] == 1)
            {
                mid++ ; 
            }
            else if(nums[mid] == 2)
            {
                swap(nums, mid ,high);
                high-- ;
            }
        }
    }

    public static void swap(int nums[] ,int index1 ,int index2)
    {
        int temp = nums[index1];
        nums[index1] = nums[index2] ;
        nums[index2] = temp ;
    }
}
