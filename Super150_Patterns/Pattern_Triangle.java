
import java.util.Scanner;

public class Pattern_Triangle 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int star = 1 ;
        int space = n - 1 ;
        int val = 1 ;
        
        int i = 1 ;
        while(i <= n)
        {
            int j = 1  ;
            while(j <= space)
            {
                System.out.print("  ");
                j++ ;
            }

            int k = 1 ; 
            int p = val ;
            while(k <= star)
            {
                System.out.print(p+" ");
                if(k <= star/2 )
                {
                    p++ ; 
                }
                else{
                    p-- ;
                }
                k++ ;
            }

            space-- ;
            star+= 2; 
            i++ ; 
            val++ ;
            System.out.println();

            sc.close() ;
        }
    }
}
