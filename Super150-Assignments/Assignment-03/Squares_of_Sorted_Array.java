import java.util.Arrays;
import java.util.Scanner;

public class Squares_of_Sorted_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int arr[] = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] =sc.nextInt() ;
        }
        squares(arr) ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(arr[i]+" ");
        }
        sc.close(); 
    }

    public static void squares(int[]arr)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            arr[i] = (int) Math.pow(arr[i], 2) ; 
        }
        Arrays.sort(arr);
    }
}
