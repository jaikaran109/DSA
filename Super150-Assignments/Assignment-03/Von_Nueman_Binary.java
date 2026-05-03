    import java.util.Scanner;

    public class Von_Nueman_Binary {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ; 
            int test = sc.nextInt() ; 
            while(test > 0)
            {
                long num = sc.nextLong() ;
                long ans = Binary_to_decimal(num) ;
                System.out.println(ans);
                test -- ;
            }
            sc.close();
        }

        public static long Binary_to_decimal(long num)
        {
            long sum = 0 ; 
            int place = 0 ; 
            while(num > 0)
            {
                long rem = num % 10 ;
                sum += rem * Math.pow(2,place) ;
                num = num /10 ;
                place++ ;
            }
            return sum ;
        }
    }
