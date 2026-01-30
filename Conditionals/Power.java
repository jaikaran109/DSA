// Power In Java
import java.util.*;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exp = sc.nextInt();

        int result = 1;
        for(int i = 1; i <= exp; i++){
            result *= base;
        }

        System.out.println("Power = " + result);
    }
}
