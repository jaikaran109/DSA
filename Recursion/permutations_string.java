import java.util.HashSet;

public class permutations_string {
    public static void main(String[] args) {
        String s = "abca" ;
        HashSet <String> set = new HashSet<>() ; 
        subsi(s, "" ,set) ; 
        for (String x : set)
        {
            System.out.println(x);
        }
    }

    public static void subsi(String s , String ans, HashSet<String> set)
    {
        if(s.length() == 0)
        {
            // System.out.println(ans) ;
            set.add(ans) ;
            return ;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i) ;
            String st = s.substring(0, i) ;
            String rem = s.substring(i+1) ;
            subsi(st+rem, ans+ch ,set);
        }
    }
}
