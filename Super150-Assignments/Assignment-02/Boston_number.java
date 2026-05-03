import java.util.Scanner;
public class Boston_number 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt() ;

        int factor_sum = factorSum(n) ;
        int digit_sum = digitSum (n) ;

        if(factor_sum == digit_sum)
        {
            System.out.println("1");
        }
        else
        {
            System.out.println("0");
        }
        sc.close();
    }
   

    public static int factorSum(int n )
    {
        int sum = 0 ; 
        for(int i = 2 ; i <= n ; i++ )
        {
            while(n % i == 0)
            {
                sum += digitSum(i) ;
                n = n / i ; 
            }
        }
        return sum ; 
    }

    public static int digitSum(int n )
    {
        int sum = 0 ; 
        while(n > 0)
        {
            int rem = n % 10 ;
            sum += rem ;
            n = n / 10 ; 
        }
        return sum ;
    }
}
