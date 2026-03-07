
public class Pattern_13 {
    public static void main(String[] args) {
        int n = 5 ;
        int star = 1 ; 
        
        int i = 1 ; 
        while(i <= 2*n-1)
        {
            int j = 1 ;
            //star
            while(j <= star)
            {
                System.out.print("* ");
                j++ ;
            }

            //Mirror
            if(i <= n-1)
            {
                star++ ; 
            }
            else{
                star-- ;
            }

            i++ ;
            System.out.println();
        }
    }
}
