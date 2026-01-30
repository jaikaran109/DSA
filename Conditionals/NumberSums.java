// Sum of negative, positive even and positive odd numbers
import java.util.*;

public class NumberSums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int neg = 0, posEven = 0, posOdd = 0;
        int n;

        while((n = sc.nextInt()) != 0){
            if(n < 0) neg += n;
            else if(n % 2 == 0) posEven += n;
            else posOdd += n;
        }

        System.out.println("Negative Sum = " + neg);
        System.out.println("Positive Even Sum = " + posEven);
        System.out.println("Positive Odd Sum = " + posOdd);
    }
}
