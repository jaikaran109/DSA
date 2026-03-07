
import java.util.Scanner;

public class HourGlass_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        sc.close();
        
        int star = 2*n+1 ;
        int space = 0 ; 
        int val = n ;

        int i = 1 ; 
        while(i <= 2*n+1)
        {
            int j = 1 ; 
            while(j <= space)
            {
                System.out.print("  ");
                j++ ; 
            }
            
            int p = val ;
            int k = 1 ; 
            while(k <= star)
            {
                System.out.print(p+" ");
                if(k <= star/2 )
                {
                    p-- ;
                }
                else
                {
                    p++ ;    
                }
                k++ ; 
            }

            if(i > n)
            {
                star+=2 ; 
                space-- ;
                val++ ;
            }
            else
            {
                space++ ; 
                star -= 2 ;
                val--; 
            }

            i++ ; 
            System.out.println();
        }
    }
}
