public class keypad_dailing {
    static String[] map = {"", "" , "abc" , "def", "ghi" , "jkl", "mno", "pqrs", "tuv", "wxyz"} ;
    public static void main(String[] args) {
        String digit = "235" ;
        combination (digit, "") ;
    }
    public static void combination (String digit, String ans)
    {
        if(digit.length() == 0)
        {
            System.out.println(ans);
            return ; 
        }
        int num = digit.charAt(0) - '0' ; 
        String press = map[num] ; 
        for (int i = 0; i < press.length() ; i++) {
            combination(digit.substring(1), ans+press.charAt(i));
        }
    } 
}
