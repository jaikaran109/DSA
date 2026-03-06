import java.util.Scanner;

public class Replace_all_0s_with_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int n = sc.nextInt() ;
        System.out.println(replace(n, 0, 0));
        sc.close();
    }

    public static int replace(int n , int sum, int place)
    {
        if(n == 0)
        {
            return sum ; 
        }
        if(n % 10 == 0)
        {
            return replace(n/10, sum + (int)Math.pow(10, place) *  5, place + 1) ;
        }
        else
        {
            return replace(n/10, sum + (int)Math.pow(10, place) * (n%10), place+1) ;
        }
    }
}
