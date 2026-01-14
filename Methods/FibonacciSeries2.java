package Methods;


//10. Write a program to print Fibonacci series of n terms where n is input
//by user :
//0 1 1 2 3 5 8 13 21


import java.util.*;

public class FibonacciSeries2 {

    static void printFibonacci(int n) {
        int a = 0, b = 1;

        if (n >= 1)
            System.out.print(a + " ");
        if (n >= 2)
            System.out.print(b + " ");

        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        printFibonacci(n);   // function call
    }
}
