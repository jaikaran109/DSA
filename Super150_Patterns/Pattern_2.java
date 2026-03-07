import java.util.* ;
public class Pattern_2 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int star = 1 ; 
        
        int i = 1 ; 
        while(i <= n)
        {
            int j = 1 ; 
            while(j <= star)
            {
                System.out.print("* ");
                j++ ;
            }

            i++ ; 
            star++ ; 
            System.out.println();
        }
        
        sc.close();
    }
}
