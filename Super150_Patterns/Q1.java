// Ques 1: 
// n = 5 
// * * * * *  
// * * * * *  
// * * * * *  
// * * * * *  
// * * * * * 



import java.util.Scanner;
public class Q1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int rows = 1;
        while(rows<=n){
            int star  = 1;
            while(star<=n){
                System.out.print("* ");
                star++;
            }
            System.out.println();
            rows++;
        }
    }
}
