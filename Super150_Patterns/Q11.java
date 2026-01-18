 
// Ques 11: 
// n = 5  
 
//         *  
//       *  *  
//     *  *  *  
//   *  *  *  *  
// *  *  *  *  * 



import java.util.Scanner;
public class Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = 1;
        int space = n-1;
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star){
                if(k%2==0){
                    System.out.print("  ");
                }else{
                    System.out.print("* ");
                }
                k++;
            }
            System.out.println();
            i++;
            space--;
            star+=2;
        }
    }
}
