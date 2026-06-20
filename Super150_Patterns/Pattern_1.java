import java.util.* ;
public class Pattern_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int star= n ; 
        
        int i = 1 ;  //count of rows 
        while(i <= n)
        {
            int j = 1 ;     // count of columns
            while(j <= star)
            {
                System.out.print("* "); 
                j++ ;
            }
            System.out.println();
            i++ ;
        }
        sc.close();
    }
}
