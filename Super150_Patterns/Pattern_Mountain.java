

import java.util.Scanner;

public class Pattern_Mountain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int space = 2*n-1-2 ;
        int star = 1 ;
        
        int i = 1 ; 
        while(i <= n )
        {
            int j = 1 ; 
            int val = 1 ;
            while(j <= star)
            {
                System.out.print(val+"\t");
                j++ ; 
                val++ ;
            }

            int k = 1 ;
            while(k <= space)
            {
                System.out.print("\t");
                k++ ; 
            }

            int l = 1 ; 
            if(i == n)
            {
                l=2 ;
                val = n ;
            }

            while(l <= star)
            {
                val--;
                System.out.print(val+"\t");
                l++ ;
            }

            star++ ; 
            space = space -2 ;
            i++ ;
            System.out.println();

            sc.close();
        }
    }
}
