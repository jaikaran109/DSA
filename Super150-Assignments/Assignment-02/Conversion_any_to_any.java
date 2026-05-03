import java.util.Scanner;

public class Conversion_any_to_any 
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int source = sc.nextInt() ; 
        int destination = sc.nextInt() ; 
        int num = sc.nextInt() ;

        int deci = source_to_decimal(source, num) ;
        int ans = decimal_to_destination(destination,deci);
        System.out.println(ans);

        sc.close();
    }    

    public static int source_to_decimal(int source, int num )
    {
        int result = 0 ;
        int place = 0 ;
        while(num > 0)
        {
            int digit = num % 10 ; 
            result += digit * Math.pow(source, place) ;
            place++ ;
            num /= 10 ;
        } 
        return result ;
    }

    public static int decimal_to_destination(int source , int num)
    {
        int result = 0 ; 
        int place = 0 ; 
        while(num > 0)
        {
            int digit = num % source ;
            result += digit * Math.pow(10,place) ;
            place++ ; 
            num /= source ;
        }
        return result ;
    }
}
