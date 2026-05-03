import java.util.Scanner;

public class String_Odd_even_char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;
        String res = "" ; 
        for (int i = 0; i < str.length() ; i++) 
        {
            char ch = str.charAt(i) ;
            if(i % 2 == 0)
            {
                res += (char) (ch + 1) ; 
            }    
            else
            {
                res += (char) (ch - 1) ; 
            }    
        }
        System.out.println(res);
        sc.close();
    }
}
