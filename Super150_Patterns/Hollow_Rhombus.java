import java.util.Scanner;

public class Hollow_Rhombus {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt() ; 
        int star = n ; 
        int space = n-1 ;

        int i = 1  ;
        while(i <= n)
        {
            int k = 1 ; 
            while(k <= space)
            {
                System.out.print(" ");
                k++ ;
            }
            int j = 1 ; 
            while(j <= star)
            {
                if(i==1 || i == n || j  == 1 || j == n )
                {
                    System.out.print("*");
                }
                else
                {
                    System.out.print(" ");
                }
                j++ ;
            }

            space-- ;
            System.out.println();
            i++ ;
        }
        sc.close();
    }
}
