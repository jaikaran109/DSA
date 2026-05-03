import java.util.Scanner;

public class Odd_even_back_in_Delhi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n =sc.nextInt() ; 

        while(n > 0)
        {
            int num = sc.nextInt();
            odd_even(num);
            n-- ;
        }
        sc.close();
    }

    public static void odd_even(int num)
    {
        int odd_sum = 0 ; 
        int even_sum = 0 ; 
        while(num > 0)
        {
            int rem = num % 10 ; 
            if(rem % 2 == 0)
            {
                even_sum += rem ;
            }
            else
            {
                odd_sum += rem ;
            }
            num = num / 10 ; 
        }

        if(odd_sum % 3 == 0 || even_sum % 4 == 0)
        {
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
