import java.util.Scanner ;
public class Chewbacca_and_number
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        long n = sc.nextLong() ;

        long sum = 0 ; 
        int len  = count_digi(n) ;

        int place = 0 ; 
        while(n > 0)
        {
            long rem = n % 10 ;
            if(rem == 9 && place == len-1)
            {
                sum += 9 * Math.pow(10,place) ; 
            }
            else if(rem > (9-rem))
            {
                sum += (9-rem) * Math.pow(10, place) ;
            }
            else
            {
                sum += rem * Math.pow(10,place); 
            }
            place++ ;
            n = n / 10 ; 
        }

        System.out.println(sum);
        sc.close();
    }

    public static int count_digi(long n)
    {
        int count = 0 ; 
        while(n > 0)
        {
            n = n / 10 ;
            count++ ;
        }

        return count ; 
    }
}
