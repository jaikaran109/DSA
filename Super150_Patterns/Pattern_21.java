

public class Pattern_21 {
    public static void main(String[] args) {
        int n = 5 ; 
        int star = 1 ; 
        int space = 2*n-1-2 ;

        int i = 1 ; 
        while(i <= n)
        {
            //star
            int j = 1 ; 
            while(j <= star)
            {
                System.out.print("* ");
                j++ ;
            }

            //space
            int k = 1 ; 
            while(k <= space)
            {
                System.out.print("  ");
                k++ ;
            }

            //star
            int l = 1 ; 
            if(i == n) //for last row
            {
                l = 2 ;
            }
            while (l<= star) 
            {
                System.out.print("* ");
                l++ ;
            }
            i++ ;
            System.out.println();
            star++ ;
            space-=2;
            
        }
    }
}
