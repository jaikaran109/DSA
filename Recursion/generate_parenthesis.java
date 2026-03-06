public class generate_parenthesis {
    public static void main(String[] args) {
        int n = 3 ; 
        generate(n, 0, 0, "");
    }

    public static void generate(int n , int opn , int cls , String ans)
    {
        if(opn == n && cls == n)
        {
            System.out.println(ans);
            return ;
        }
        if (opn > n || opn < cls) 
        {
            return ;    
        }
        generate(n, opn+1, cls, ans+"(") ;
        generate(n, opn, cls+1, ans+")") ;
    }
}