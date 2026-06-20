import java.util.Scanner;

public class Inverted_HourGlass{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int n = sc.nextInt() ;
        sc.close();
        
        int i = 1 ;
        int star = 1 ; 
        int space = 2*n-1 ;
        while(i <= 2*n+1)
        {
            int val  = n ;
            int j = 1 ;
            while(j <= star)
            {
                System.out.print(val+" ");
                j++ ; 
                val--;
            } 

            int k = 1 ; 
            while(k <= space)
            {
                System.out.print("  ");
                k++ ;
            }
            
            int l = 1 ; 
            if(i == n+1)
            {
                l = 2 ;
                val++ ;
            }
            while(l <= star)
            {
                val++ ; 
                System.out.print(val+" ");
                l++ ;
            }
            
            if(i > n)
            {
                space+= 2 ; 
                star-- ; 
            }
            
            else{
                space-= 2; 
                star++ ;
            }
            i++ ; 
            System.out.println();

        }   
    }
}