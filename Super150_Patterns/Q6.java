// Ques 6: 
// n = 5 

// * * * * *  
//     * * * *  
//         * * *  
//             * *  
//                 *  






import java.util.Scanner;
public class Q6 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n = input.nextInt();
        int row=1;
        int star = n;
        int space=0;
        while(row<=n){  //loops for rows
            int  j =1;
            while(j<=space){  //loops for space
                System.out.print("  ");
                j++;
            }
            int k = 1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            row++;
            star--;
            space+=2;
            System.out.println();
        }
    }
}
