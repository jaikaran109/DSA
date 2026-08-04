import java.util.*;
public class printRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        int end = input.nextInt();
        print(start,end);
    }
    static void print(int x , int n){
        if(x > n) return;
        System.out.println(x);
        print(x+1,n);
    }
}
