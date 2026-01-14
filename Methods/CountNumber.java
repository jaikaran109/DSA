package Methods;


// Write a program to enter the numbers till the user wants and at the end it
//should display the count of positive, negative and zeros entered.


import java.util.*;

public class CountNumber {

    static void countNumbers() {
        Scanner sc = new Scanner(System.in);
        int pos = 0, neg = 0, zero = 0;
        char choice;

        do {
            System.out.print("Enter number: ");
            int n = sc.nextInt();

            if (n > 0)
                pos++;
            else if (n < 0)
                neg++;
            else
                zero++;

            System.out.print("Do you want to continue? (y/n): ");
            choice = sc.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        System.out.println("Positive numbers = " + pos);
        System.out.println("Negative numbers = " + neg);
        System.out.println("Zero numbers = " + zero);
    }

    public static void main(String[] args) {
        countNumbers();   // function call
    }
}
