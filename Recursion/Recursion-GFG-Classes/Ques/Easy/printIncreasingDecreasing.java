import java.util.Scanner;

public class printIncreasingDecreasing {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        IncresingDecreasing(n); // print using 1 recursion function -- 2 me to aasan ho jayega
    }

    static void IncresingDecreasing(int n){
        if(n == 0) return;
        System.out.println(n);
        IncresingDecreasing(n-1);
        System.out.println(n);
    }
}
