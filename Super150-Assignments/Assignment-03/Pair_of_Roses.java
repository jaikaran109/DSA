import java.util.Arrays;
import java.util.Scanner;
public class Pair_of_Roses {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        while(n > 0)
        {
            int roses = sc.nextInt() ; 
            int[] price = new int[roses] ;
            for(int i = 0 ; i < roses ; i++)
            {
                price[i] = sc.nextInt() ;
            }
            int money = sc.nextInt() ;

            int rose1 = 0 , rose2 =0 ; 
            int mindiff = Integer.MAX_VALUE ;
            
            int low = 0 ; 
            int high = roses-1 ;
            Arrays.sort(price) ;
            while(low <= high)
            {
                int sum = price[low] + price[high] ;
                if(sum == money)
                {
                    int diff = price[high] - price[low] ;
                    if(mindiff > diff)
                    {
                        mindiff = diff ; 
                        rose1 = price[low] ;
                        rose2 = price[high] ; 
                    }
                    low++ ;
                    high-- ;
                }
                else if(sum > money)
                {
                    high--;
                }
                else
                {
                    low++ ;
                }
            }
            
            System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
            n-- ;


            // for(int i = 0 ; i < roses ; i++)
            // {
            //     for(int j = i+1 ; j < roses ; j++)
            //     {
            //         if(price[i] + price[j] == money)
            //         {
            //             int diff = Math.abs(price[i] - price[j]) ; 
            //             if(mindiff > diff)
            //             {
            //                 mindiff = diff ;
            //                 if (price[i] < price[j]) 
            //                 {
            //                     rose1 = price[i];
            //                     rose2 = price[j];
            //                 } 
            //                 else 
            //                 {
            //                     rose1 = price[j];
            //                     rose2 = price[i];
            //                 }
            //             }
            //         }
            //     }
            // }
            // System.out.println("Deepak should buy roses whose prices are " + rose1 + " and " + rose2 + ".");
            // n-- ;
        }
        sc.close();
    }
}
