class Solution {
    public int minFlips(int a, int b, int c) {
        int ans = 0;
        while(a != 0 || b != 0 || c != 0){
            if((c & 1) == 1){
                if(((a & 1) == 0) && ((b & 1) == 0)) ans++;
            }else if((c & 1) == 0){
                if(((a & 1) == 1) && ((b & 1) == 1)) ans+=2;    // if c = 0 and dono ka and 1 to dono ko flip krna hoga
                else if(((a & 1) == 1) || ((b & 1) == 1)) ans++;
            }
            a >>= 1;
            b >>= 1;
            c >>= 1;
        }
        return ans;
    }
}

// Simple h tm phle ques acche se samjho then bss bit by bit check kr lo
