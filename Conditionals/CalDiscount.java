// Calculate Discount Of Product
import java.util.*;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double price = sc.nextDouble();
        double discount = sc.nextDouble(); // in %

        double finalPrice = price - (price * discount / 100);
        System.out.println("Final Price = " + finalPrice);
    }
}
