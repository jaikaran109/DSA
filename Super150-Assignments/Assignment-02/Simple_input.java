import java.util.Scanner;

public class Simple_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0 ; 
        while(true)
        {
            int n = sc.nextInt() ; 
            sum += n ; 
            if(sum < 0)
            {
                break ;
            }    
            else{
                System.out.println(n);
            }
        }
        sc.close();

    }    
}
