package Methods;


//Write a function that calculates the Greatest Common Divisor of 2 numbers.



import java.util.*;

public class GCD {
    static int gcd(int a, int b) {
        while(b != 0) {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("GCD = " + gcd(a, b));
    }
}
