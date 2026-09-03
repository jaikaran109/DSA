
public class Pattern_14 {
    public static void main(String[] args) 
    {
        int n = 5 ; 
        int star = 1 ; 
        int space = 4 ; 

        int i = 1 ; 
        while(i <= 2*n-1)
        {
            int k = 1 ; 
            while(k <= space)
            {
                System.out.print("  ");
                k++ ;
            }
            int j = 1 ;
            while(j <= star)
            {
                System.out.print("* ");
                j++ ;
            }

            if(i>= n)  // jab row se up
            {
                star -- ; 
                space++ ;
            }
            else{
                star++ ;
                space-- ;
            }
    
            i++ ;
            System.out.println();
        }
    }
}
