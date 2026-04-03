// Take the following as input.

// A number (N1)
// A number (N2)
// Write a function which returns the LCM of N1 and N2. Print the value returned.

// Input Format

// Constraints

// 0<N1<1000000000
// 0<N2<1000000000

// Output Format

// Sample Input

// 4

// 6

// Sample Output

// 12

// Explanation

// The smallest number that is divisible by both N1 and N2 is
// called the LCM of N1 and N2.


import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n1 = sc.nextLong();
        long n2 = sc.nextLong();
        System.out.println(getLCM(n1, n2));
    }
    public static long getLCM(long n1, long n2) {
        if (n1 == 0 || n2 == 0) return 0;
        return Math.abs(n1 * n2) / getGCD(n1, n2);
    }
    public static long getGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
