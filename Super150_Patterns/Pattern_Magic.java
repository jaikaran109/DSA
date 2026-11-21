

public class Pattern_Magic {
    public static void main(String[] args) {
        int n = 5 ; 
        int star = n ;
        int space = -1 ; 

        int i = 1 ; 
        while(i <= 2*n-1)
        {
            int j = 1 ; 
            while(j <= star)
            {
                System.out.print("*");
                j++ ; 
            }

            int k = 1 ; 
            while(k <= space)
            {
                System.out.print(" ");
                k++ ; 
            }

            int l = 1 ; 
            if(i == 1 || i == 2*n-1)
            {
                l = 2 ;
            }
            while(l <= star)
            {
                System.out.print("*");
                l++ ;
            }

            if(i >= n )
            {
                star++ ; 
                space -= 2 ;
            }
            else
            {
                star-- ; 
                space += 2 ;
            }
            i++ ; 
            System.out.println(); 
        }
    }
}
