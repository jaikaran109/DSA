class Solution {
    public int reverseExponentiation(int n) {
        int ans = 0;
        int reverse = rev(n,ans);
        return pow(n,reverse);
    }
    
    static int pow(int n , int reverse){
        if(reverse == 0) return 1;
        int call = pow(n,reverse/2);
        if(reverse % 2 == 0) return call * call;
        else return n * call * call;
    }
    
    static int rev(int n,int ans){
        if(n == 0) return ans;
        return rev(n / 10 , ans * 10 + n % 10);
    }
}
