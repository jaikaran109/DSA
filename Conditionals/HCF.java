// HCF Of Two Numbers Program
import java.util.*;

public class HCF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        while(b != 0){
            int r = a % b;
            a = b;
            b = r;
        }
        System.out.println(a);
    }
}
