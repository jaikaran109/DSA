import java.util.Scanner;

public class StringPallindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;
        String s1 = "" ; 
        for (int i = str.length()-1 ; i >= 0 ; i--) 
        {
            s1 += str.charAt(i) ; 
        }

        System.out.println(s1.equals(str)) ;
        sc.close();
    }
}
