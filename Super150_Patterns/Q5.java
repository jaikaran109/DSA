// Ques 5: 
// n = 5 
// * * * * *  
//   * * * *  
//     * * *  
//       * *  
//         *  




import java.util.Scanner;
public class Q5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = n ; 
        int space = 0 ; 

        int i = 1 ; 
        while (i <= n)   // loop of rows
        {
            int j = 1 ; 
            while(j <= space)      //loop of space
            {
                System.out.print("  ");
                j++ ; 
            }    

            int k = 1 ; 
            while(k <= star)     //   loop of star
            {
                System.out.print("* ");
                k++ ; 
            }

            space++ ; 
            star-- ;

            i++ ; 
            System.out.println();

        }
    }
}
