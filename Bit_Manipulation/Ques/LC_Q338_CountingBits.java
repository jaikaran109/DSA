class Solution {
    public int[] countBits(int n) {
        int[] ans = new int[n+1];
        for(int i = 0 ; i <= n ; i++){
            if(i % 2 == 0) {
                ans[i] = count(i / 2);
            }
            else {
                ans[i] = count(i / 2) + 1;
            }
        }
        return ans;
    }
    static int count(int n){
        int c = 0;
        while(n != 0){
            if((n & 1) == 1) c++;
            n >>= 1;
        }
        return c;
    }
}


// Dekho jb tm pattern dekhoge to N ke set bits ka count == N/2 ke set bit ke count ke equal hota h 
// and if N odd ho to uska set bit ka count == N/2 ke set bits + 1 ke equal hota h 

// Example -> 
// 10 -- 2 , 5 -- 2
// 9 -- 2 , 4 -- 1 + 1
