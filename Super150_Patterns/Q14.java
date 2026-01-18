// Ques 14: 
// n = 5  
//         *  
//       * *  
//     * * *  
//   * * * *  
// * * * * *  
//   * * * *  
//     * * *  
//       * *  
//         *  








import java.util.Scanner;
public class Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int star = 1;
        int space = n-1;
        while(i<=2*n-1){
            int k =1;
            while(k<=space){
                System.out.print("  ");
                k++;
            }
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(i>=n){   // jab row se up
                star--;
                space++;
            }else{
                star++;
                space--;
            }
            System.out.println();
            i++;
        }
    }
}
