// import java.util.Scanner;

public class tower_of_hanoi {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in) ; 
        int n = 3 ; 
        tower(n , 'A' , 'B', 'C') ; 
    }
    public static void tower(int n , int src , int helper,  int desti)
    {
        if(n == 0)
        {
            return ; 
        }
        tower(n-1, src, desti, helper);
        System.out.println("move disk "+ n + " from rod "+ (char)src+ " to rod " + (char)desti);
        tower(n-1, helper, src, desti);
    }
}