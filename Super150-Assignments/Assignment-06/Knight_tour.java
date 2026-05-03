public class Knight_tour {
    public static void main(String[] args) {
        int [][] grid = {{0,11,16,5,20},
                        {17,4,19,10,15},
                        {12,1,8,21,6},
                        {3,18,23,14,9},
                        {24,13,2,7,22}} ;
        boolean ans = isValid(grid, 0, 0, 0) ;
        System.out.println(ans);
    }   
    
    public static boolean isValid(int [][] grid, int r, int c, int expVal)
    {
        if(r < 0 || c < 0 || r >= grid.length || c >= grid[0].length || grid[r][c] != expVal )
        {
            return false ; 
        }
        if(expVal == (grid.length * grid[0].length)-1)
        {
            return true ;
        }
        boolean leftup1 = isValid(grid, r-2 , c-1, expVal+1) ;
        boolean leftup2 = isValid(grid, r-1 , c-2, expVal+1) ;
        boolean leftdwn1 = isValid(grid, r+1 , c-2, expVal+1) ;
        boolean leftdwn2 = isValid(grid, r+2 , c-1, expVal+1) ;
        boolean rightup1 = isValid(grid, r-1 , c+2, expVal+1) ;
        boolean rightup2 = isValid(grid, r-2 , c+1, expVal+1) ;
        boolean rightdwn1 = isValid(grid, r+1 , c+2, expVal+1) ;
        boolean rightdwn2 = isValid(grid, r+2 , c+1, expVal+1) ;

        return leftup1 || leftup2 || leftdwn1 || leftdwn2 || rightup1 || rightup2 || rightdwn1 || rightdwn2 ;
    }
}
