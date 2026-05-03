import java.util.HashMap;
import java.util.Scanner;

public class Max_freq_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String str = sc.next() ;
        HashMap<Character, Integer> map = new HashMap<>() ; 
        for (int i = 0; i < str.length() ; i++) 
        {
            if(map.containsKey(str.charAt(i)))
            {
                map.put(str.charAt(i) , map.get(str.charAt(i))+ 1) ;
            }
            else
            {
                map.put(str.charAt(i), 1) ;
            }
        }

        int count = 0 ; 
        char ans = 0 ;
        for(char x : map.keySet())
        {
            if(map.get(x) > count)
            {
                count = map.get(x) ; 
                ans = x ;
            }
        } 

        System.out.println(ans);
        sc.close();
    }
}
