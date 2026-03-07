package Patterns;

public class Pattern_25 {
     public static void main(String[] args) {
        int n = 5 ; 
        int space = n-1 ; 
        int num = 1 ; 
        int val = 1  ;

        int i = 1 ; 
        while (i <= n) 
        {
            //space
            int j = 1 ;
            while (j <= space) 
            {
                System.out.print("\t");
                j++ ;    
            }    

            //star
            int k = 1 ; 
            while(k <= num)
            {
                System.out.print(val+"\t");
                k++ ;
                val++ ;
            }

            i++ ; 
            System.out.println();
            space-- ; 
            num += 2 ;
        }
    }
}
