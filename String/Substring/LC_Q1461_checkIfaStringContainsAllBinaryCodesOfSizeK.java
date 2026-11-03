class Solution {
    public boolean hasAllCodes(String s, int k) {
        int codes = (int)Math.pow(2,k);
        HashSet<String> set = new HashSet<>();
        for(int i = k ; i <= s.length() ; i++){
            String str = s.substring(i-k, i);
            if(set.add(str)){
                codes--;
            }
            if(codes == 0) return true;
        }
        return false;
    }
}


// isme jitne possible combinations ho skte h unka count 2^k hi hoga to usko count kr lo        -- glti se bhi arraylist mt use krna bcz usme contains check krne ka worst time O(n^2) hoti h isiliye set use kr lo

// then ab tm sare diff diff pair ko list me store kr lo and codes-- kr do if codes == 0 ho gya means sare possible combinations mil gye else nhi mile
