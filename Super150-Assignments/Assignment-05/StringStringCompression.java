import java.util.Scanner;

public class StringStringCompression {
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
                if(count != 1)
                {
                    res += ch + "" +count ;
                }
                else
                {
                    res += ch ; 
                }
                ch = str.charAt(i) ; 
                count = 1 ; 
            }
        }
        if(count != 1)
        {
            System.out.println(res+ch+count);
        }
        else
        {
            System.out.println(res+ch);
        }
        sc.close() ;
    }
}
