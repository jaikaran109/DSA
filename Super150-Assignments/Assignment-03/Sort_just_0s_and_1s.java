import java.util.Scanner;

public class Sort_just_0s_and_1s {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int[] arr = new int[n]; 
        for(int i = 0 ; i < n ; i ++)
        {
            arr[i] = sc.nextInt() ;
        }
        sort0_and_1(arr);

        for(int i = 0 ; i < arr.length ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }

    public static void sort0_and_1(int[] arr)
    {
        int low = 0 ; 
        int high = arr.length-1 ;
        while (low <= high) 
        {
            if(arr[low] == 0)     
            {
                low++ ;
            }   
            else if(arr[high] == 1)
            {
                high-- ; 
            }
            else if(arr[low] == 1)
            {
                swap(arr, low, high);
                low++ ; 
                high-- ;
            }
        }
    }

    public static void swap(int[] arr, int start, int end)
    {
        int temp = arr[start] ;
        arr[start] = arr[end] ; 
        arr[end] = temp ;
    }
}
