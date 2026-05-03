public class Minimum_XOR_path_in_a_Grid {
    static int min  =Integer.MAX_VALUE ;
    
    public static void main(String[] args) {
        int [][] grid = {{1,2},{3,4}} ;
        min = Integer.MAX_VALUE;
        
        solve(grid , 0 , 0 , grid.length-1 , grid[0].length-1 , 0) ; 
        System.out.println(min);
    }
    public static void solve(int [][] grid , int r , int c , int row, int col , int xor)
    {
        if(r > row || c > col)
        {
            return ; 
        }
        if(r == row && c == col)
        {
            xor ^= grid[r][c];
            min = Math.min(xor , min) ; 
            return ; 
        }
        solve(grid, r, c+1 , row, col, xor ^ grid[r][c]); // right
        solve(grid, r+1, c , row, col, xor ^ grid[r][c]); // down
    }
}