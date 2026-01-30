// Find NCR & NPR

import java.util.*;

public class NCR_NPR {

    static int factorial(int n) {
        int fact = 1;
        for(int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int r = sc.nextInt();

        int ncr = factorial(n) / (factorial(r) * factorial(n - r));
        int npr = factorial(n) / factorial(n - r);

        System.out.println("NCR = " + ncr);
        System.out.println("NPR = " + npr);
    }
}
