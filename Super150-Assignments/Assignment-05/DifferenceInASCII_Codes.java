import java.util.Scanner;

public class DifferenceInASCII_Codes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String s = sc.next() ; 
        String res = "" ;
        for(int i = 0 ; i < s.length() - 1 ; i++)
        {
            char curr = s.charAt(i) ; 
            char next = s.charAt(i+1) ;
            int diff = next - curr ; 
            res += curr +""+ diff ; 
        }
        res += s.charAt(s.length()-1);
        System.out.println(res) ;
        sc.close(); 
    }
}
