package Methods;

//Check Prime or Not

import java.util.*;

public class Prime {

    // Function to check prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;   // 0 and 1 are not prime
        if (n == 2) return true;    // 2 is prime
        if (n % 2 == 0) return false; // even numbers > 2 are not prime

        // check divisibility from 3 to sqrt(n)
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int num = 29;  // you can change input
        if (isPrime(num)) {
            System.out.println(num + " is Prime");
        } else {
            System.out.println(num + " is Not Prime");
        }
    }
}
