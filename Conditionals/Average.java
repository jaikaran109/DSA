// Calculate Average Of N Numbers
import java.util.*;

public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 0; i < n; i++){
            sum += sc.nextInt();
        }

        double avg = (double) sum / n;
        System.out.println("Average = " + avg);
    }
}
