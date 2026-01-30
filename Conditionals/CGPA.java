import java.util.*;

public class CGPA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int subjects = sc.nextInt();
        double sum = 0;

        for (int i = 0; i < subjects; i++) {
            sum += sc.nextDouble();
        }

        double cgpa = sum / subjects;
        System.out.println("CGPA = " + cgpa);
    }
}
