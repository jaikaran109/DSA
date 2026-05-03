import java.util.Scanner;

public class Recursion_Twins {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String s = sc.next() ; 
        int cnt = twins(s) ; 
        System.out.println(cnt);
        sc.close();
    }

    public static int twins(String s)
    {
        if(s.length() < 3)
        {
            return 0 ; 
        }
        if(s.charAt(0) == s.charAt(2))
        {
            return 1 + twins(s.substring(1)) ; 
        }
        else
        {
            return twins(s.substring(1)) ; 
        }
    }
}
