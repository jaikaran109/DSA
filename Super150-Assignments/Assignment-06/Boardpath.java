import java.util.Scanner;

public class Boardpath {
    static int count = 0 ; 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        int m = sc.nextInt() ;
        board(n, m, 0, "");
        System.out.println("\n"+count);
        sc.close();     
    }

    public static void board(int n , int m , int curr, String ans)
    {
        if(curr == n)
        {
            System.out.print(ans+" ");
            count ++ ; 
            return ; 
        }
        if(curr > n )
        {
            return ; 
        }
        for(int dice = 1 ; dice <= m ; dice ++)
        {
            board(n, m, curr+dice, ans+""+dice);
        }
    }
}

