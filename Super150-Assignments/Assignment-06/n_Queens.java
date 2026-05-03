public class n_Queens {
    public static void main(String[] args) {
        int n = 4 ; 
        char [][] board = new char[n][n];
        for(int i = 0; i < n; i++){
        for(int j = 0; j < n; j++){
            board[i][j] = '.';
        }
    }
        Print(board, n , 0) ;
    }

    public static void Print(char [][] board , int queen , int row)
    {
        if(queen == 0)
        {
            Display(board) ; 
            System.out.println();
            return ; 
        }
        for(int col = 0 ; col < board[0].length ; col ++)
        {
            if(isSafe(board , row ,col))
            {
                board[row][col] = 'Q';
                Print(board, queen-1 , row+1) ;
                board[row][col] = '.' ;
            }
        }
    }

    public static boolean isSafe(char [][] board , int row , int col)
    {
        // up
        int r = row ; 
        while(r >= 0)
        {
            if(board[r][col] == 'Q')
            {
                return false ;
            }
            r -- ;
        }

        // left diag
        r = row ; 
        int c = col ; 
        while(r >= 0 && c >= 0)
        {
            if(board[r][c] == 'Q')
            {
                return false ;
            }
            r -- ; 
            c -- ;
        }

        // right diag
        r = row ; 
        c = col ;
        while (r >= 0 && c < board[0].length) 
        {
            if(board[r][c] == 'Q')
            {
                return false ;
            }
            r -- ; 
            c ++ ;
        }

        return true ; 
    }

    public static void Display(char [][] board)
    {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}