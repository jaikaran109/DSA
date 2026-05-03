import java.util.Scanner;

public class Product_of_Array_except_self {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int[] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ; 
        }
        long res [] = product(arr, n) ;
        for(int i = 0 ; i < n ; i++)
        {
            System.out.print(res[i]+" ");
        }
        sc.close();
    }

    public static long[] product(int[]arr ,int n)
    {
        // let array be [1,2,3,4]
        long[] prefix = new long[n] ; // left product use chod kr
        prefix[0] = 1 ;                     // [1, , , ]    isko 1 fix krdo 
        for(int i = 1 ; i < n ; i++)        
        {
            prefix[i] = prefix[i-1] * arr[i-1] ;     // i=1  [1 , 1*1 , , ]        i=2 [1, 1, 1*2 , ]        i=3 [1, 1, 2, 2*3 ]       == [1, 1, 2, 6] 
        }

        long[] suffix = new long[n] ;  // right product nikalne ke liye
        suffix[n-1] = 1 ;            //  [ , , , 1]   last ko 1 fix krdenge
        for(int j = n-2 ; j >= 0 ; j--)     // 2nd last index se loop chalao
        {
            suffix[j] = suffix[j+1] * arr[j+1] ;      // i= 2 [ , , 1*4, 1]       i=1 [ , 4*3, 4, 1]         i=0 [12*2, 12, 4, 1]     == [24, 12, 4, 1]
        }

        long[] product = new long[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            product[i] = prefix[i] * suffix[i] ;     //[24*1 , 12*1 , 4*2, 1*6]
        }

        return product ; 
    }
}
