import java.util.Scanner;

public class Alex_goes_Shopping {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        int n = sc.nextInt() ;
        int[] price = new int[n] ; 
        for(int i = 0 ; i < n ;i++)
        {
            price[i] = sc.nextInt() ;
        }

        int query = sc.nextInt() ; 
        while(query > 0)
        {
            int money = sc.nextInt() ; 
            int item = sc.nextInt() ;
            int count = 0 ;
            for(int i = 0 ; i < n ; i++)
            {
                if(money % price[i] == 0)
                {
                    count++ ;
                }
            }

            if(count >= item)
            {
                System.out.println("Yes");
            } 
            else{
                System.out.println("No");
            }
            query-- ; 
        }
        sc.close();
    }
}
