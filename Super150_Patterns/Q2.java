// Ques 2: 
// n = 5  
// *  
// * *  
// * * *  
// * * * *  
// * * * * * 





import java.util.Scanner;
public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int row=1;
        while(row<=n){
            int star=1;
            while(star<=row){
                System.out.print("* ");
                star++;
            }
            System.out.println();
            row++;
        }
    }
}
