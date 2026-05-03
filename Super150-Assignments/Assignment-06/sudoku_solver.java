public class sudoku_solver {
    public static void main(String[] args) {
		char[][] grid = {   {'5','3','.','.','7','.','.','.','.'},
                            {'6','.','.','1','9','5','.','.','.'},
                            {'.','9','8','.','.','.','.','6','.'},
                            {'8','.','.','.','6','.','.','.','3'},
                            {'4','.','.','8','.','3','.','.','1'},
                            {'7','.','.','.','2','.','.','.','6'},
                            {'.','6','.','.','.','.','2','8','.'},
                            {'.','.','.','4','1','9','.','.','5'},
                            {'.','.','.','.','8','.','.','7','9'}};
        solver(grid, 0, 0) ;
	}

    public static void solver(char [][] grid , int row , int col)
    {
        if(col == 9)
        {
            col = 0 ; 
            row ++ ; 
        }
        if(row == 9)
        {
            display(grid) ; 
            return ; 
        }
        if(grid[row][col] != '.')
        {
            solver(grid, row, col+1);
        }
        else
        {
            for(int i = 1 ; i <= 9 ; i++)
            {
               if(issafe(grid,row,col, i))
               {
                grid[row][col] = (char) (i+'0') ;
                solver(grid, row, col+1); 
                grid[row][col] = '.' ;
               }
            }
        }
    }

    public static void display(char [][] board)
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) 
            {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean issafe(char [][] board , int row , int col, int val)
    {
        char v = (char) (val+'0') ;
        for(int i = 0 ; i <= 8 ; i++)
        {
            if(board[row][i] == v || board[i][col] == v)
            {
                return false ; 
            }
        }

        int r = (row/3) * 3 ; 
        int c = (col/3) * 3 ; 
        for(int i = r ; i < r+3 ; i++)
        {
            for(int j = c ; j < c+3 ; j++)
            {
                if(board[i][j] == v)
                {
                    return false ; 
                }
            }
        }
        return true ; 
    }
}