import java.util.Scanner;

public class Recursion_Convert_String_to_Integer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String st = sc.next() ;
        sc.close();
        toint(st,0, 0) ;
    }
    public static void toint(String s ,int i , int num)
    {
        if(i == s.length())
        {
            System.out.println(num);
            return ; 
        }
        int n = s.charAt(i) - '0';
        toint(s, i+1, num * 10 + n);
    }
}
