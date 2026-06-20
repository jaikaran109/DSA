
public class Pattern_16 {
    public static void main(String[] args) {
        int n = 5 ; 
        int row = n ; 

        int i = 1 ; 
        while (i < row) 
        {
            int j = row ; 
            while(j > i)
            {
                System.out.print("    ");
                j-- ;
            }    

            int k = row ;
            while(k > i-1)
            {
                System.out.print("* ");
                k-- ;
            }
            System.out.println(); 
            i++ ;
        }
        int p = 1 ; 
        while (p <= row) 
        {
            int q = 1 ; 
            while(q < p)
            {
                System.out.print("    ");
                q++ ;
            }    

            int r = 0 ;
            while(r < p)
            {
                System.out.print("* ");
                r++ ;
            }
            System.out.println(); 
            p++ ;
        }
    }
}
