public class replace_all_pi {
    public static void main(String[] args) {
        String s = "xabpixx3.15x" ; 
        String ans = replacee(s) ; 
        System.out.println(ans);
    }

    public static String replacee(String s)
    {
        if(s.length() == 0)
        {
            return "" ;
        }
        if(s.length() >= 2 && s.substring(0,2).equals("pi"))
        {
            return "3.14"+replacee(s.substring(2)) ; 
        }
        else
        {
            return s.charAt(0) + replacee(s.substring(1)) ;
        }
    }
}
