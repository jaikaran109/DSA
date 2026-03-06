import java.util.Scanner;

public class Nth_Triangle_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        sc.close();
        System.out.println(sum(n,1)) ; 
    }
    public static int sum(int n, int x)
    {
        if(x == n)
        {
            return n ;
        }
        return x + sum(n, x+1) ;
    }
}