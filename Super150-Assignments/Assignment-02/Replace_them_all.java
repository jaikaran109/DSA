import java.util.Scanner;

public class Replace_them_all {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        long n = sc.nextLong() ;
        sc.close();

        int place = 1 ; 
        long temp = n ; 
        if(n == 0)
        {
            System.out.print(5);
        }
        else
        {
            while(n > 0)
            {
                long rem = n % 10 ; 
                if(rem == 0)
                {
                    temp += 5 * Math.pow(10, place-1) ;
                }
                place++ ; 
                n /= 10; 
            }
            System.out.println(temp);
        }     
    }
}