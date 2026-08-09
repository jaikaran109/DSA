package Patterns;

public class Pattern_26 {
    public static void main(String[] args) {
        int n = 5;
        int space = n - 1;
        int num = 1;
    
        int i = 0 ;
        while(i<n)
        {
            int j = 0;
            while (j < space) {
                System.out.print("  ");
                j++;
            }
            int count = 1 ;
            int k = 0;
            while (k < num) {
                System.out.print(count + " ");
                k++;
                count++ ;
            }
    
            i++;
            System.out.println();
            space--;
            num += 2;
        }
    }
}
