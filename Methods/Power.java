package Methods;


//Two numbers are entered by the user, x and n. Write a function to find
//the value of one number raised to the power of another i.e. x".


import java.util.*;

public class Power {
    static int power(int x, int n) {
        int result = 1;
        for(int i = 1; i <= n; i++) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(power(x, n));
    }
}
