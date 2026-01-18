// Ques 15: 
// n = 5 
 
// * * * * *  
//     * * * *  
//         * * *  
//             * *  
//                 *  
//             * *  
//         * * *  
//     * * * *  
// * * * * *  



import java.util.Scanner;
public class Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;

        while (i <= 2 * n - 1) {
            int space, star;

            if (i <= n) {
                space = (i - 1) * 4;
                star = n - i + 1;
            } else {
                space = (2 * n - i - 1) * 4;
                star = i - n + 1;
            }

            int j = 1;
            while (j <= space) {
                System.out.print(" ");
                j++;
            }

            int k = 1;
            while (k <= star) {
                System.out.print("* ");
                k++;
            }

            System.out.println();
            i++;
        }
    }
}
