// Ques 9: 
// n = 5  
//       
//         * 
//       * * *
//     * * * * *
//   * * * * * * * 
// * * * * * * * * * 







import java.util.Scanner;
public class Q9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = 1;
        int i = 1;
        int space = n-1;
        while(i<=n){
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println();
            i++;
            space--;
            star+=2;
        }
    }
}
