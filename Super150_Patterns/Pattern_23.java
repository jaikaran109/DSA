public class Pattern_23 {
    public static void main(String[] args) {
        int n = 5 ; 
        int space = n-1 ; 
        int num = 1 ;
        
        int i = 0 ; 
        while( i < n)
        {
            int j = 0 ; 
            while(j < space)
            {
                System.out.print("  ");
                j++ ; 
            }

            int k = 0 ; 
            while(k < num)
            {
                System.out.print("1 ");
                k++ ;
            }

            i++ ;
            System.out.println();
            space-- ;
            num+=2 ;
        }
    }
}
