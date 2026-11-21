public class Pattern_9 {
    public static void main(String[] args) {
        int n = 5 ; 
        int row = n ; 
        int star = 1 ;
        
        int i = 0 ; 
        while(i < row)
        {
            int k  = row ;
            while(k > i)
            {
                System.out.print("  ");
                k-- ;
            }
            int j = 0 ; 
            while(j < star)
            {
                System.out.print("* ");
                j++ ;
            } 
            star+=2 ;
            System.out.println();
            i++ ;
        }
    }
}
