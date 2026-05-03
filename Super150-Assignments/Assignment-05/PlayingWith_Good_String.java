import java.util.Scanner;

public class PlayingWith_Good_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String str = sc.next() ;
        int count = 0 ; 
        int max = 0 ; 
        for (int i = 0; i < str.length() ; i++) {
            char ch = str.charAt(i) ;
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u')
            {
                count ++ ;
                max = Math.max(count , max) ;
            }
            else 
            {
                count = 0 ; 
            }
        }
        System.out.println(max);
        sc.close();
    }
}
