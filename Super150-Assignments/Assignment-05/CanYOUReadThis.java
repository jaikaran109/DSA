import java.util.Scanner;

public class CanYOUReadThis {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;
        for(int i = 0 ; i < str.length() ; i++)
        {
            if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
            {
                if(i!=0)
                {
                    System.out.println();
                }
                System.out.print(str.charAt(i));
            }
            else if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
            {
                System.out.print(str.charAt(i));
            }
        }
        sc.close() ;
    }
}
