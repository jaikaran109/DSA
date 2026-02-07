class Solution {
    public boolean judgeCircle(String moves) {
        int r = 0;
        int l = 0;
        int u = 0;
        int d = 0;
        for(int i = 0 ; i < moves.length() ; i++){
            if(moves.charAt(i) == 'U') u++;
            else if(moves.charAt(i) == 'L') l++;
            else if(moves.charAt(i) == 'R') r++;
            else d++;
        }
        return (l == r && u == d);
    }
}
