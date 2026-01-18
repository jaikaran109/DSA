// Ques 13
// n = 5 
// *  
// * *  
// * * *  
// * * * *  
// * * * * *  
// * * * *  
// * * *  
// * *  
// * 




import java.util.Scanner;
public class Q13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i = 1;
        int star = 1;
        while(i<=2*n-1){
            int j = 1;
            while(j<=star){
                System.out.print("* ");
                j++;
            }
            if(i<=n-1){
                star++;
            }else{
                star--;
            }
            System.out.println();
            i++;
        }
    }
}
