class Solution {

    private void generate(int n , int l , int r , String ans , List<String> list){
        if(r == n){  // OR s.length() == 2*n
            list.add(ans);
            return;
        }
        if(l < n) generate(n , l+1 , r , ans + "(" , list);
        if(r < l) generate(n , l , r+1 , ans + ")" , list);
    }

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generate(n,0,0,"",list);
        return list;
    }
}
