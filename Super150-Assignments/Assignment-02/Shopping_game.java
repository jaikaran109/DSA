
import java.util.Scanner;

public class Shopping_game{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in) ;
        int test = sc.nextInt() ;
        while(test>0)
        {
            int m = sc.nextInt() ; 
            int n = sc.nextInt() ;
    
            int phone = 1 ;
            int ayu = 0 ; 
            int harsh = 0 ;  
            while(true)
            {
                ayu+=phone ;
                if(ayu > m)
                {
                    System.out.println("Harshit");
                    break ;
                }
                phone++ ; 
    
                harsh += phone ; 
                if(harsh > n)
                {
                    System.out.println("Aayush");
                    break  ;
                }
                phone++ ; 
    
            }

            test-- ;
        }
        sc.close();
    }
}
