// Ques 7: 
// n = 5 
// * * * * *   
// *       *
// *       *
// *       *
// * * * * *  


import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int star = n;
        int i = 1;
        while(i<=n){
            int j = 1;
            while(j<=star){
                if((i==1 || i==n)||(j==1 || j==n)){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
