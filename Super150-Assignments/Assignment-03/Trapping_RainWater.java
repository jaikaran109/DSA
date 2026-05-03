import java.util.Scanner;

public class Trapping_RainWater {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int test = sc.nextInt() ;
        while(test > 0)
        {
            int n = sc.nextInt() ; 
            int[] arr = new int[n] ;
            for(int i = 0 ; i < n ; i++)
            {
                arr[i] = sc.nextInt() ;
            }
            int res = waterArea(arr) ;
            System.out.println(res);
            test-- ;
        }
        sc.close();
    }

    public static int waterArea(int[] arr)
    {
        int[] prefix = new int[arr.length] ;
        prefix[0] = arr[0] ;
        for(int i = 1 ; i < arr.length ; i++)
        {
            prefix[i] = Math.max(prefix[i-1],arr[i]) ;
        }

        int[] suffix = new int[arr.length] ;
        suffix[arr.length-1] = arr[arr.length-1] ;
        for(int i = arr.length-2 ; i >= 0 ; i--)
        {
            suffix[i] = Math.max(suffix[i+1], arr[i]) ;
        }

        int area = 0  ;
        for(int i = 0 ; i < arr.length ; i++)
        {
            area += Math.min(prefix[i], suffix[i]) - arr[i] ; 
        }
        return area ;
    }
}
