public class Pattern_15 {
    public static void main(String[] args) {
        int n = 5 ;
        int row = n ; 
        int col = n ;

        int i = 0 ;
        while(i < row)
        {
            int k = 0 ; 
            while(k < i)
            {
                System.out.print("    ");
                k++ ;
            }
            int j = col ;
            while(j > i)
            {
                System.out.print("* ");
                j-- ;
            }
            System.out.println(); ;
            i++ ;
        }
        int p = 1 ;
        while(p < row)
        {
            int q = col-1; 
            while(q > p)
            {
                System.out.print("    ");
                q-- ;
            }
            int r = 0 ;
            while(r <= p)
            {
                System.out.print("* ");
                r++;
            }
            System.out.println(); ;
            p++ ;
        }
    }
}
