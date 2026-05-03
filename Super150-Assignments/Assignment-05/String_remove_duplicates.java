import java.util.Scanner;

public class String_remove_duplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;
        char ch = 'a' ;
        String res = "" ; 
        for(int i = 0 ; i < str.length()-1 ; i++)
        {
            ch = str.charAt(i) ;
            if(ch == str.charAt(i+1))
            {
                continue; 
            }
            else{
                res += ch ;
            }
        }
        System.out.println(res+str.charAt(str.length()-1));
        sc.close() ;
    }
}
