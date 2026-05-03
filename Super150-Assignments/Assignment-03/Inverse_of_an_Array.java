import java.util.Scanner;

public class Inverse_of_an_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int[] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ;
        }
        InverseArray(arr) ;
        sc.close();
    }

    public static void InverseArray(int[] arr)
    {
        int res[] = new int[arr.length] ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            res[arr[i]] = i ;
        }
        
        
        for(int i = 0 ; i < res.length ; i++)
        {
            System.out.print(res[i]+" ");
        }
    }
}
