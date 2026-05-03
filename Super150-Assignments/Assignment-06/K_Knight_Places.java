public class K_Knight_Places {
    static int count = 0 ;
    public static void main(String[] args) {
        int n = 2 ;
        count = 0 ;
        boolean [][] grid = new boolean[n][n] ;
        solve(grid, n, "" , 0) ;
        System.out.println();
        System.out.println(count); 
    }

    public static void solve(boolean [][] grid , int knight , String ans , int idx ) 
    {
        if(knight == 0)
        {
            count++ ;
            System.out.print(ans+" ");
            return ;
        }
        if (idx == grid.length * grid[0].length)  return;
        int row = idx / grid.length ;
        int col = idx % grid[0].length ;
        if(isSafe(grid , row, col))
        {
            grid[row][col] = true ;
            solve(grid, knight-1, ans+"{"+ row +"-"+ col +"}"+" ", idx+1) ;  // place knight
            grid[row][col] = false ; 
        }
        solve(grid, knight, ans, idx+1) ; // skip
    }

    public static boolean isSafe(boolean [][] grid, int row , int col)
    {
        if(row-2 >= 0 && col-1 >= 0 && grid[row-2][col-1] == true) // left up
        {
            return false ; 
        }
        if(row-1 >= 0 && col-2 >= 0 && grid[row-1][col-2] == true) // leftup 
        {
            return false ; 
        }
        if(row-1 >= 0 && col+2 < grid[0].length && grid[row-1][col+2] == true) // right up
        {
            return false ; 
        }
        if(row-2 >= 0 && col+1 < grid[0].length && grid[row-2][col+1] == true)  // right up
        {
            return false ;
        }
        return true ;
    }
}
