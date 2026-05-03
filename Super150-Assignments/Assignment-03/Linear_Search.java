import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int arr[] = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] =sc.nextInt() ;
        }
        int target = sc.nextInt() ;
        System.out.println(LS(arr, target));
        sc.close();
    }

    public static int LS(int[] arr , int target)
    {
        for(int i = 0 ; i < arr.length ; i++)
        {
            if(arr[i] == target)
            {
                return i ;
            }
        }
        return -1 ;
    }
}
