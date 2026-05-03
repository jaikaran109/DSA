import java.util.Scanner;

public class Insertion_sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int arr[] = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] =sc.nextInt() ;
        }
        insrtion_sort(arr) ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close(); 
    }    

    public static void insrtion_sort(int[] arr)
    {
        for(int i = 1 ; i < arr.length ; i++)
        {
            int current = arr[i] ; 
            int prev = i - 1 ;
            while(prev >= 0 && arr[prev] > current)
            {
                arr[prev+1] = arr[prev] ;
                prev-- ;
            }
            arr[prev+1] = current ;
        }
    }
}
