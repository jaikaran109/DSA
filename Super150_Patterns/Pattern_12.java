
public class Pattern_12 {
    public static void main(String[] args) {
        int n = 5 ; 
        int row = n ; 
        int star = 1 ;
        
        int i = 0 ; 
        while(i < row)
        {
            int j = row ;
            while(j > i)
            {
                System.out.print("  ");
                j-- ;
            }

            int k = 0 ; 
            while (k < star) 
            {
                if(k % 2 == 0)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("! ");
                }
                k++ ;     
            }
            star+=2;
            System.out.println();
            i++ ; 
            
        }
    }
}
