
import java.util.Scanner;

public class Mirror_Star_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        
        int row = 0 ;
        if(n % 2 == 0)
        {
            row=n+1 ; 
        } 
        else{
            row = n ;
        }
        int space = n-3 ; 
        int star = 1 ;

        int i = 1 ; 
        while(i <= row)
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

            if(i < (n/2)+1)
            {
                star += 2 ;
                space-- ;
            }
            else{
                star-=2 ; 
                space++ ;
            }
            i++ ;
            System.out.println();
        }
        sc.close(); 
    }
}
