import java.util.HashMap;
import java.util.Scanner;

public class NonRepeatingChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while(test-- > 0)
        {
            String str = sc.next() ;
            HashMap<Character, Integer> map = new HashMap<>() ;
            for(int i =0 ; i < str.length() ; i++)
            {
                if(map.containsKey(str.charAt(i)))
                {
                    map.put(str.charAt(i) , map.get(str.charAt(i)) + 1 ) ;
                }
                else
                {
                    map.put(str.charAt(i),1 ) ;
                }
            }
            
            boolean flag = false;
            for (int i = 0; i < str.length(); i++) {
                if(map.get(str.charAt(i)) == 1)
                {
                    System.out.println(str.charAt(i));
                    flag = true ;
                    break ; 
                }
            }
            if(!flag)
            {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}
