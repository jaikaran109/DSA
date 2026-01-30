import java.util.*;

public class CompoundInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double principal = sc.nextDouble();
        double rate = sc.nextDouble();
        int time = sc.nextInt();

        double ci = principal * Math.pow(1 + rate / 100, time) - principal;
        System.out.println("Compound Interest = " + ci);
    }
}
