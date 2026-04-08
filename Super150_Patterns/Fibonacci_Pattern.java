import java.util.Scanner;

public class Fibonacci_Pattern {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int star = 1 ; 
        int val1= 0 ; 
        int val2= 1 ; 

        int i = 1 ; 
        while(i <= n)
        {
            int j = 1 ; 
            while(j <= star)
            {
                System.out.print(val1+"\t");
                int sum = val1 + val2 ;
                val1 = val2 ;
                val2 = sum;
                j++ ; 
            }

            star++ ; 
            i++ ;
            System.out.println();

        }
        sc.close();
    }
}
