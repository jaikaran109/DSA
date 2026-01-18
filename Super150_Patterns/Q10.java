// Ques 10: 
// n = 5 
 
// * * * * * * * * *  
//   * * * * * * *  
//     * * * * *  
//       * * *  
//         *  






import java.util.Scanner;
public class Q10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = 2*n-1;
        int space = 0;
        int i = 1;
        while(i<=n){{
            int k = 1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
            star-=2;
            space++;
        }}
    }
}
