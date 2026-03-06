public class Rat_in_a_maze {
    public static void main(String[] args) {
        int n = 4 ;
        int maze [] [] = {{1, 0 ,0 ,0}, {1, 1, 0, 1},{1, 1, 0, 0,}, {0, 1, 1, 1}} ;
        ratpath(n-1, n-1 ,0, 0, maze, "") ;
    }
    public static void ratpath(int r, int c , int currR  , int currC , int [][] maze, String ans)
    {
        if(r == currR && c == currC)
        {
            System.out.print(ans+"\t");
            return ; 
        }
        if(currC > c || currC < 0 || currR > r || currR < 0 || maze[currR][currC] == 0)
        {
            return ;
        }
         maze[currR][currC] = 0;
         ratpath(r, c, currR-1, currC, maze, ans+"U");
         ratpath(r, c, currR+1, currC, maze, ans+"D");
         ratpath(r, c, currR, currC-1, maze, ans+"L");
         ratpath(r, c, currR, currC+1, maze, ans+"R");
         maze[currR][currC] = 1;
    }
}
