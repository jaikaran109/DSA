import java.util.Scanner;

public class StringToggleCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String str = sc.next() ;
        String res = "" ;
        for(int i = 0 ; i < str.length() ; i++)
        {
            char ch = str.charAt(i); 
            if('A' <= ch && 'Z' >= ch)
            {
                res += (char) (ch + 32 ) ;
            }
            else if('a' <= ch && 'z' >= ch)
            {
                res += (char) (ch - 32 ) ;
            }
        }
        System.out.println(res) ;
        sc.close() ;
    }
}
