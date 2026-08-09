
import java.util.*;

public class Pattern_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int star = n ; 
        
        int i = 1 ; 
        while (i <= n) 
        {
            int j = 1 ; 
            while (j <= star) 
            {
                if((i == 1 || i == n ) && (j== 1 || j ==n ))
                {
                    System.out.print("* ");
                }
                else if(( i== 2 || i == n-1) && (j == 2 || j ==n-1))
                {
                    System.out.print("* ");
                }
                else if(i == 3 && j == 3)
                {
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                } 
                j++ ;    
            }    

            i++ ; 
            System.out.println();
        }
        sc.close();
    }
}
