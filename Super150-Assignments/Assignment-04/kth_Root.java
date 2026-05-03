import java.util.Scanner;

public class kth_Root {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int test = sc.nextInt() ; 
        while(test-- > 0)
        {
            long n = sc.nextLong() ;
            int k = sc.nextInt() ;
            System.out.println(kthRoot(n,k));
        }
        sc.close();
    }

    public static long kthRoot(Long n ,int k )
    {
        long low = 1 ; 
        long high = n ;
        while(low <= high)
        {
            long mid = low + (high-low) / 2 ; 
            long power = powercalc(mid , k , n) ;    // power ^ k = n
            if(power == n)
            {
                return mid ;
            }
            else if (power < n)
            {
                low = mid + 1 ; 
            }
            else if(power > n)
            {
                high = mid -1 ;
            }
        }
        return high ;
    }

    public static long powercalc(long base , int exp , long limit)
    {
        long res = 1 ; 
        for(int i = 1 ; i <= exp ; i++ )
        {
            res *= base ;
            if(res > limit)
            {
                return limit+1 ;
            }
        }
        return res ;
    }
}
