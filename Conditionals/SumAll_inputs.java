package Conditionals;

// Take integer inputs till the user enters 0 and print the sum of all numbers

import java.util.*;

public class SumAll_inputs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int sum = 0;
        int n;

        while ((n = input.nextInt()) != 0) {
            sum += n;
        }

        System.out.print(sum);
    }
}
