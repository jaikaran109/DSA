
import java.util.Scanner;

public class Pattern_Zeroes {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        int star = 1 ; 
        int space = -1 ; 

        int i = 1 ; 
        while(i <= n)
        {
            int j = 1 ; 
            while( j <= star)
            {
                if(j==1)
                {
                    System.out.print(i+"\t");
                }
                j++ ; 
            }
            
            int k = 1 ; 
            while(k <= space)
            {
                System.out.print("0\t");
                k++ ; 
            }
            
            int l = 1 ; 
            while( l <= star)
            {
                if(l == 2)
                {
                    System.out.print(i+"\t");
                }
                l++ ; 
            }
            star++ ; 
            space++ ; 
            i++ ; 
            System.out.println();

            sc.close();
        }
    }
}
