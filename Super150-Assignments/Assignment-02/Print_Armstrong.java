import java.util.Scanner;

public class Print_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int m = sc.nextInt() ; 
        int n = sc.nextInt() ; 
        for(int i = m ; i <= n ; i++)
        {
            if(armstrng(i)) 
            {
                System.out.println(i);
            }
        }
        sc.close();
    }

    public static int count_digits(int n )
    {
        int count = 0 ; 
        while(n > 0)
        {
            n = n / 10 ; 
            count++ ; 
        }
        return count ; 
    }


    public static boolean armstrng(int n )
    {
        int count = count_digits(n) ;
        int temp = n ; 
        int sum = 0 ; 
        while(n > 0)
        {
            int rem = n % 10 ; 
            sum += Math.pow(rem,count); 
            n = n / 10 ;
        }

        return sum == temp ;
    }
}
