public class maze_path {
    public static void main(String[] args) {
        int r = 2 ; 
        int c = 2 ;
        paths(r,c, 0,0,"" ) ; 
    }
    public static void paths(int r , int c , int currR, int currC ,String ans)
    {
        if(currC > c || currR > r)
        {
            return ;
        }
        if(currC == c && currR == r)
        {
            System.out.println(ans);
            return ; 
        }
        paths(r, c, currR+1, currC, ans+"V");
        paths(r, c, currR, currC+1, ans+"H");
    } 
}
