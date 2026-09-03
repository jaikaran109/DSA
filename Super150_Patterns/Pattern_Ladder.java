

import java.util.Scanner;

public class Pattern_Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; ; 
        int star = 1 ; 
        int val = 1 ;
        int i = 1 ; 
        while(i<= n)
        {
            int j = 1 ; 
            while (j <= star) 
            {
                System.out.print(val+" ");
                j++ ;     
                val++ ;      
            }

            star++ ;
            i++ ;
            System.out.println();
            sc.close();
        }
    }
}
