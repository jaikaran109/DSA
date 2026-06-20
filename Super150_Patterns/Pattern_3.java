import java.util.* ;
public class Pattern_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int star = n ;
        
        int  i = 1 ; 
        while(i <= n)
        {
            int j = 1; 
            while(j <= star)
            {
                System.out.print("* ");
                j++ ;
            }
            star-- ; 
            i++ ; 
            System.out.println();
        }
        sc.close();
    }
}
