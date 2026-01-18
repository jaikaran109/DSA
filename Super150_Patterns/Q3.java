// Ques 3: 
// n = 5  
// * * * * *  
// * * * *  
// * * *  
// * *  
// *  




import java.util.Scanner;
public class Q3 {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        int row=1;
        while(row<=n){
            int star=n;
            while (star>=row) { 
                System.out.print("* ");
                star--;
            }
            System.out.println();
            row++;
        }
    }
}
