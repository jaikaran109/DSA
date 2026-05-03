import java.util.Scanner;

public class Reverse_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int arr[] = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] =sc.nextInt() ;
        }
        reverse(arr) ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.println(arr[i]);
        }
        sc.close(); 
    }

    public static void reverse(int [] arr)
    {
        int start = 0 ; 
        int end = arr.length-1 ;
        while(start <= end)
        {
            int temp = arr[start] ; 
            arr[start] = arr[end] ; 
            arr[end] = temp ; 
            start++ ; 
            end-- ; 
        }
    }
}
