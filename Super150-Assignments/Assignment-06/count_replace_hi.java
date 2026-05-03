public class count_replace_hi {
    public static void main(String[] args) {
        String s = "abchibi" ;
        int c = count(s);
        System.out.println(c); 
        String res = remove(s) ; 
        System.out.println(res);
        String ans = replace(s) ; 
        System.out.println(ans);
    }

    public static int count(String s)
    {
        if(s.length() < 2)
        {
            return 0 ;
        }
        if(s.length() >= 2 && s.substring(0,2).equals("hi"))
        {
            return 1 + count(s.substring(2)) ; 
        }
        else{
            return count(s.substring(1)) ;
        }
    }

    public static String remove(String s)
    {
        if(s.length() == 0)
        {
            return "" ; 
        }
        if(s.length() >= 2 && s.substring(0,2).equals("hi"))
        {
            return remove(s.substring(2)) ; 
        }
        else
        {
            return s.charAt(0) + remove(s.substring(1))  ; 
        }
    }

    public static String replace(String s)
    {
        if(s.length() == 0)
        {
            return "" ; 
        }
        if(s.length() >= 2 && s.substring(0,2).equals("hi"))
        {
            return "bye"+ replace(s.substring(2)) ; 
        }
        else 
        {
            return s.charAt(0) + replace(s.substring(1))  ;
        }
    }
}
