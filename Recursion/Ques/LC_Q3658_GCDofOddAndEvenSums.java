class Solution {

    static int oddSum(int n){

        int sum = 1;
        int temp = 1;

        for(int i = 1 ; i < n ; i++){
            temp += 2;
            sum += temp;
        }

        return sum;

    }
    
    static int evenSum(int n){

        int sum = 2;
        int temp = 2;

        for(int i = 1 ; i < n ; i++){
            temp += 2;
            sum  += temp;
        }

        return sum;

    }

    static int gcd(int even , int odd){

        if(even == 0) return odd;

        return gcd(odd%even,even);
    }

    public int gcdOfOddEvenSums(int n) {
        int odd = oddSum(n);
        int even = evenSum(n);
        return gcd(odd,even);
    }
    
}
