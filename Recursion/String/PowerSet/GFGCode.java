class Solution {
    public List<String> powerSet(String s) {
        List<String> list = new ArrayList<>();
        subset("",s,0,list);  
        Collections.sort(list);
        return list;
        
    }
    
    private void subset(String ans , String s , int idx , List<String> list){
        if(idx == s.length()) {
            list.add(ans);
            return ;
        }
        char ch = s.charAt(idx);
        subset(ans+ch,s,idx+1,list);
        subset(ans,s,idx+1,list);
    }
}
