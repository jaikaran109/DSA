import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String str = sc.next() ;
        char ch = str.charAt(0) ;
        String res = "" ;
        int count = 0 ; 
        for(int i = 0; i < str.length() ; i++)
        {
            if(str.charAt(i) == ch)
            {
                count++ ;
            }
            else{
                res += ch + "" +count ;
                ch = str.charAt(i) ; 
                count = 1 ; 
            }
        }
        System.out.println(res+ch+count);
        sc.close();
    }
}
