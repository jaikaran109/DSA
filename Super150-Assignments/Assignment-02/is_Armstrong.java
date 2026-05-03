import java.util.Scanner;

public class is_Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        System.out.println(isArmstrong(n));
        sc.close();
    }    

    public static int count_digi(int n)
    {
        int count = 0 ; 
        while(n > 0)
        {
            n/= 10 ;
            count++ ; 
        }
        return count ; 
    }


    public static boolean isArmstrong(int n)
    {
        int temp = n ;
        int count = count_digi(n) ;
        int sum = 0 ; 
        while(n > 0)
        {
            int rem = n % 10 ;
            sum += Math.pow(rem,count) ;
            n /= 10 ; 
        }
        if(sum == temp)
        {
            return true ; 
        }
        else
        {
            return false ;
        }
    }
}
