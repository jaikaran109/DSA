import java.util.* ;
public class Pattern_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        int star = n ; 
        int space = 0 ; 

        int i = 1 ; 
        while(i <= n)
        {
            int k = 1 ; 
            while(k <= space)
            {
                System.out.print("  ");
                k ++; 
            }
            
            int j = 1 ; 
            while(j <= star)
            {
                System.out.print("* ");
                j++ ;
            }

            star-- ; 
            space+= 2 ; 
            System.out.println();
            i++ ; 
        }
        sc.close();
    }
}
