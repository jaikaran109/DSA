import java.util.Scanner;

public class Pascal_triangle {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int n =sc.nextInt() ;
        int star = 1  ;
        int i = 0 ; 
        while(i < n)
        {
            int ncr = 1 ; 
            int j = 0  ;
            while(j < star)
            {
                System.out.print(ncr+"\t");
                ncr = ((i-j)* ncr/ (j+1)) ;
                j++ ;
            }
            
            star++; 
            i++; 
            System.out.println();
        }
        sc.close(); 
    }
}
