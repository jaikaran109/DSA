import java.util.Scanner;

public class count_replace_hi_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String s = sc.next() ; 
        sc.close();
        System.out.println(count(s));
        // countreplace(s, "");
        remove(s, "" ) ;
        replace(s, "");
    }

    public static int count(String s)
    {
        if(s.length() == 0)
        {
            return 0 ; 
        }
        if(s.length() >= 3 && s.substring(0, 3).equals("hit"))
        {
            return count(s.substring(3)) ; 
        }
        else if(s.length() >= 2 && s.substring(0,2).equals("hi"))
        {
            return 1 + count(s.substring(2)) ; 
        }
        else
        {
            return count(s.substring(1)) ; 
        }
    }  
    public static void remove(String s, String ans)
    {
        if(s.length() == 0)
        {
            System.out.println(ans); 
            return ; 
        }
        if(s.length() >= 3 && s.substring(0, 3).equals("hit"))
        {
            remove(s.substring(3), ans+"hit") ; 
        }
        else if(s.length() >= 2 && s.substring(0,2).equals("hi"))
        {
            remove(s.substring(2), ans) ; 
        }
        else
        {
            remove(s.substring(1), ans+s.charAt(0)) ; 
        }
    }  

    public static void replace(String s , String ans)
    {
        if(s.length() == 0)
        {
            System.out.println(ans); 
            return ; 
        }
        if(s.length() >= 3 && s.substring(0, 3).equals("hit"))
        {
            replace(s.substring(3), ans+"hit") ; 
        }
        else if(s.length() >= 2 && s.substring(0,2).equals("hi"))
        {
            replace(s.substring(2), ans+"bye") ; 
        }
        else
        {
            replace(s.substring(1), ans+s.charAt(0)) ; 
        }
    }
}
