public class lexicographical_counting {
    public static void main(String[] args) {
        int n = 13 ;
        lexico(n, 0) ; 
    }

    public static void lexico(int n , int curr) 
    {
        if(curr > n)
        {
            return ;
        }
        System.out.print(curr + " ");
        int i = 0 ;
        if(curr == 0)
        {
            i = 1 ;
        }
        while(i <= 9)
        {
            lexico(n, curr*10+i );
            i++ ;
        }
    }
}