

import java.util.Scanner;

public class Pattern_Rhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int star = 1 ; 
        int space = n-1 ; 
        int val = 1 ; 

        int i = 1 ; 
        while( i <= 2*n-1)
        {
            int j = 1 ; 
            while(j <= space)
            {
                System.out.print("\t");
                j++ ;
            }

            int k = 1 ; 
            int p = val ;
            while(k <= star)
            {
                System.out.print(p+"\t");
                if(k <= star/2)
                {
                    p++ ;
                }
                else
                {
                    p-- ;
                }
                k++ ;
            }

            if(i < n)
            {
                space-- ; 
                star+=2 ;
                val++ ;
            }
            else
            {
                space++ ;
                star-=2 ;
                val-- ;
            }
            System.out.println();
            i++ ;
        }
        sc.close();
    }
}
