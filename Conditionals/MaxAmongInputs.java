package Conditionals;


//Take integer inputs till the user enters 0 and print the largest number from all.


import java.util.*;
public class MaxAmongInputs {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
        int max = n;

        while ((n = input.nextInt()) != 0) {
            if (n > max) {
                max = n;
            }
        }

        System.out.print(max);

	}

}
