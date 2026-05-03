import java.util.Scanner;

public class Print_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        int num = sc.nextInt() ; 

        int count = 0 ;
        for(int i = 1 ; count < n ; i++)
        {
            int res = series(i) ;
            if(res % num != 0)
            {
                count++ ;
                System.out.println(res);
            }
        }
        sc.close();
    }    

    public static int series(int n)
    {
        int res = 3 * n + 2 ; 
        return res ;
    }
}
