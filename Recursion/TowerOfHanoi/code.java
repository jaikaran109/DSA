package Recursion.TowerOfHanoi;
import java.util.*;
public class code {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        honoi(n,'A','B','C');
    }

    private static void honoi(int n , char source , char helper , char destination){

        if(n == 0) return;

        // n - 1 disks from A to B via C
        honoi(n-1,source,destination,helper);

        // Largest from A to C
        System.out.println(source + "-->" + destination);

        // n - 1 disks from B to C via A
        honoi(n-1,helper,source,destination);
        
    }
}

