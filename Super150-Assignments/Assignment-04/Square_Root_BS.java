import java.util.Scanner;

public class Square_Root_BS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        sc.close() ; 
        System.out.println(sqrt(n));
    }
    public static long sqrt(int n)
    {
        long low = 1 ; 
        long high = n ; 
        while(low <= high)
        {
            long mid= low + (high-low)/2;
            if((mid*mid) == n)
            {
                return mid ;
            }
            else if((mid*mid)< n)
            {
                low = mid + 1 ;
            }
            else if((mid*mid) > n)
            {
                high = mid - 1 ;
            }
        }
        return high ;
    }
}
