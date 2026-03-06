import java.util.Scanner;

public class Odd_Even_Using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int temp1 = n ; 
        int temp2 = n ; 
        odd(temp1);
        even(1,temp2) ;
        sc.close();
    }
    public static void odd(int n)
    {
        if(n==0)
        {
            return ;
        }
        if(n % 2 == 1)
        {
            System.out.println(n);
        }
        odd(n-1);
    }
    public static void even(int n, int temp2)
    {
        if(n > temp2)
        {
            return ;
        }
        if(n % 2 == 0)
        {
            System.out.println(n);
        }
        even(n+1, temp2);
    }
}