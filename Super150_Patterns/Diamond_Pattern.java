import java.util.Scanner;

public class Diamond_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int star = (n/2)+1 ; 
        int space = -1 ; 
    
        int i = 1 ; 
        while(i <= n)
        {
            int j = 1 ;
            while(j <= star)
            {
                System.out.print("*\t");
                j++ ;
            }

            int k = 1 ; 
            while(k <= space)
            {
                System.out.print("\t");
                k++ ;
            }

            int l = 1 ; 
            if(i==1 || i == n)
            {
                l = 2 ;
            }
            while(l <= star)
            {
                System.out.print("*\t");
                l++ ;
            }

            if(i >= (n/2)+1)
            {
                space -= 2 ; 
                star ++; 
            }
            else
            {
                space+= 2 ; 
                star-- ; 
            }

            i++ ;
            System.out.println();
        }   
        sc.close();
    }
}
