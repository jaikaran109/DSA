package Quick_Sort;

import java.util.*;

public class code {

    static void quickSort(int[] nums , int low , int high){
        if(low >= high) return ;

        int pivotIndex = partition(nums,low,high);  // find pivot element

        quickSort(nums,low,pivotIndex - 1);  // sort left part

        quickSort(nums,pivotIndex + 1,high); // sort right part

    }


    // Dekho low+1 = 1 se high tk array ko 2 part me divide kr do 
    // left side sare elements pivot se chote honge aur right me bade 
    // ab dhyaan do ki pivot tmne low means index 0 ko liya tha 
    // aur j smaller elements wale me last pe h means jo jo elements pivot se chote honge unme last index pe 
    // ab tm index j pe jo element h usko swap kr do pivot se kyuki smaller me sare elements chote h ya uske equal h
    // Edge case -> 4 1 2 3 4 5 6 7 agr array kuch aisa bnta h to swap krne ke baad bhi same hi array rhega

    static int partition(int[] nums , int low , int high){

        int i = low + 1;
        int j = high;
        int pivot = nums[low];

        while(i <= j){
            while(i <= high && nums[i] < pivot){
                i++;
            }

            while(j >= low && nums[j] > pivot){
                j--;
            }

            if(i < j){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }

        // place the pivot at correct index
        int temp = nums[low];  // here low is 0
        nums[low] = nums[j];
        nums[j] = temp;

        return j;

    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i < size ; i++){
            arr[i] = input.nextInt();
        }

        quickSort(arr,0,size-1);

        System.out.println("\n\n After Sorting");

        for(int num : arr){
            System.out.print(num + " ");
        }
    }
    
}



// Time Complexity - O(nlogn)
// Space Complexity - O(1)
