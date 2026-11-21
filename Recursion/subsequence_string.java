import java.util.Scanner;
public class subsequence_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String s = sc.next() ; 
        int c = subsi(s, "" ) ;
        System.out.println("\n"+c);
        sc.close() ;
    }

    public static int subsi (String s, String ans)
    {
        if(s.length() == 0)
        {
            System.out.print(ans+" ");
            return 1 ; 
        }
        char ch = s.charAt(0) ; 
        String rem = s.substring(1) ;
        int include = subsi(rem, ans);
        int exclude = subsi(rem, ans+ch);
        return include+exclude ;
    }
}
