
public class Pattern_10
{
    public static void main(String[] args) {
        int n = 5 ; 
        int row = n ; 
        int col = n ; 

        int i = 0 ;
        while(i <=row)
        {
            int k = 0 ;
            while(k < i)
            {
                System.out.print("  ");
                k++ ;
            }
            int j = col ;
            while(j > i)
            {
                System.out.print("* ");
                j-- ;
            }
            
            int s = col-1 ;
            while(s > i)
            {
                System.out.print("* ");
                s-- ;
            }
            System.out.println();
            i++ ;
        }
    }
}
