package Patterns;

public class Pattern_27
 {
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        int num = 1;
    
        int i = 1 ;
        while(i<=n)
        {
            int j = 0;
            while (j < space) {
                System.out.print("  ");
                j++;
            }
            int count = 1 ;
            int k = 1;
            while (k <= num) 
            {
                System.out.print(count + " ");
                if(k < num/2+1)
                {
                    count++ ; ;
                }
                else
                {
                    count-- ;
                }
                k++ ;
            }
    
            i++;
            System.out.println();
            space--;
            num += 2;
        }
    }
}
