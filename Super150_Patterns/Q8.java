// Ques 8: 
// n = 5 
// *       *
//   *   *  
//     *  
//   *   *
// *       *







import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int star = 5;
        while(i<=n){
            int j = 1;
            while(j<=star){
                if((i==1 || i==n)&&(j==1||j==n)){
                    System.out.print("* ");
                }else if ((i==2 || i==n-1) && (j==2 || j==n-1)) {
                    System.out.print("* ");
                }else if(j==3 && i==3){
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
