import java.util.* ;
public class Pattern_7
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int star = n ; 

        int i = 1 ; 
        while( i <= n )
        {
            int col = 1 ; 
            while(col <= star)
            {
                if((i == 1 || i == 5 ) || (col == 1 || col == n ))
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
                col++ ; 
            }

            i++ ; 
            System.out.println();

            sc.close(); 
        }
    }
}