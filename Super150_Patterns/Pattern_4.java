
import java.util.* ;
public class Pattern_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n =  sc.nextInt() ;
        int star = 1 ; 
        int space = n-1 ; 

        int i = 1 ;
        while(i <= n)
        {
            int j = 1 ;
            while(j <= space)
            {
                System.out.print("  ");
                j++ ;
            }

            int k = 1 ;
            while(k <= star)
            {
                System.out.print("* ");
                k++ ;
            } 

            star++ ; 
            space-- ; 
            System.out.println();
            i++ ;
        }
        sc.close();
    }
}
