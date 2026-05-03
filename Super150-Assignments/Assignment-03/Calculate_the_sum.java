import java.util.Scanner;
public class Calculate_the_sum {
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int n = sc.nextInt() ; 
        int [] arr = new int[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ; 
        }
        int t = sc.nextInt() ;
        while(t -- > 0)
        {
            int [] newarr = new int[n] ; 
            for(int i = 0; i < n ; i++)
            {
                if(i == 0)
                {
                    newarr[i] = arr[n-1] + arr[i] ;
                }
                else
                {
                    newarr[i] = arr[i-1] + arr[i] ;
                }
            }
            arr = newarr ;
        }

        int sum = 0 ;
        for(int i = 0 ; i < n ; i++)
        {
            sum += arr[i] ; 
        }
        System.out.print(sum) ;
    }
}
