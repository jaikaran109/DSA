// Check Leap Year Or Not
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
            System.out.println("Leap Year");
        else
            System.out.println("Not Leap Year");
    }
}
