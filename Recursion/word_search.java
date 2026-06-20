public class word_search {
    public static void main(String[] args) {
        // int n = 4 ; 
        char [][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}} ;
        String word = "ABCCED" ;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(board[i][j] == word.charAt(0))
                {
                    boolean ans = search(board, i , j , word, 0) ;
                    if(ans == true)
                    {
                        System.out.println(ans);
                        return ; 
                    }
                }
            }
        }
        System.out.println(false);
    }

    public static boolean search(char [][] board , int st , int end , String word, int idx)
    {
        if(idx == word.length())
        {
            return true ;
        }
        if(st < 0 || end < 0 || st >= board.length || end >= board[0].length || board[st][end] != word.charAt(idx))
        {
            return false ;
        }
        // char temp = board[st][end] ; 
        // board[st][ end] = '.' ;
        boolean up = search(board, st-1, end, word, idx+1) ;
        boolean down = search(board, st+1, end, word, idx+1); 
        boolean left = search(board, st, end-1, word, idx+1); 
        boolean right = search(board, st, end+1, word, idx+1); 
        boolean found = up || down || left || right ;
        return found ;
        // board[st][ end] = '' ;
    }
}
