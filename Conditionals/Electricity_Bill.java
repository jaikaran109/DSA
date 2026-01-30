package Conditionals;

// Calculate Electricity Bill

import java.util.*;

public class ElectricityBill {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int units = input.nextInt();
        double bill = 0;

        if (units <= 100) {
            bill = units * 1.5;
        } 
        else if (units <= 200) {
            bill = 100 * 1.5 + (units - 100) * 2.5;
        } 
        else {
            bill = 100 * 1.5 + 100 * 2.5 + (units - 200) * 4;
        }

        System.out.println("Electricity Bill = ₹" + bill);
    }
}
